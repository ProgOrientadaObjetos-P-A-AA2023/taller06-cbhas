package paqueteuno;

import java.util.Scanner;
import paquetedos.*;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombreH;
        String direccion;
        String ciudad;
        String provincia;
        int numeroM;
        int numeroE;
        String nombreM;
        double sueldoM;
        String especialidadM;
        String nombreE;
        double sueldoE;
        String contratoE;
        double sueldoT = 0;

        System.out.print("Ingrese el nombre del hospital:\n> ");
        nombreH = entrada.nextLine();
        System.out.print("Ingrese la dirección:\n> ");
        direccion = entrada.nextLine();
        System.out.print("Ingrese la ciudad:\n> ");
        ciudad = entrada.nextLine();
        System.out.print("Ingrese la provincia:\n> ");
        provincia = entrada.nextLine();
        System.out.print("¿Cuántos médicos desaa ingresar?\n> ");
        numeroM = entrada.nextInt();
        Medico[] m = new Medico[numeroM];
        System.out.print("¿Cuántos enfermeros desaa ingresar?\n> ");
        numeroE = entrada.nextInt();
        Enfermero[] e = new Enfermero[numeroE];

        Ciudad c = new Ciudad(ciudad, provincia);

        entrada.nextLine();

        for (int i = 0; i < numeroM; i++) {
            System.out.print("\nIngrese el nombre del médico:\n> ");
            nombreM = entrada.nextLine();
            System.out.print("Ingrese el sueldo del médico:\n> ");
            sueldoM = entrada.nextDouble();
            entrada.nextLine();
            System.out.print("Ingrese la especialidad del médico:\n> ");
            especialidadM = entrada.nextLine();

            m[i] = new Medico(nombreM, especialidadM, sueldoM);
        }

        for (int i = 0; i < numeroE; i++) {
            System.out.print("\nIngrese el nombre del enfermero(ra):\n> ");
            nombreE = entrada.nextLine();
            System.out.print("Ingrese el sueldo del enfermero(ra):\n> ");
            sueldoE = entrada.nextDouble();
            entrada.nextLine();
            System.out.print("Ingrese el tipo de contrato del enfermero(ra):\n> ");
            contratoE = entrada.nextLine();

            e[i] = new Enfermero(nombreE, contratoE, sueldoE);
        }

        Hospital h = new Hospital(nombreH, c, m, e, sueldoT,
                direccion);

        h.calcularNEspecialidades();
        h.calcularSTotal();

        System.out.printf("%s\n", h);
    }

}

// @cbhas
