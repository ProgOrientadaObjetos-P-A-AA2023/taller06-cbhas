package paquetedos;

public class Medico {

    private String nombreD;
    private String especialidad;
    private double sueldoM;

    public Medico(String nD, String e, double sM) {
        nombreD = nD;
        especialidad = e;
        sueldoM = sM;
    }

    public void establecerNDoctor(String nD) {
        nombreD = nD;
    }

    public void establecerEspecialidad(String e) {
        especialidad = e;
    }

    public void establecerSMensual(double sM) {
        sueldoM = sM;
    }

    public String obtenerNDoctor() {
        return nombreD;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSMensual() {
        return sueldoM;
    }

}

// @cbhas
