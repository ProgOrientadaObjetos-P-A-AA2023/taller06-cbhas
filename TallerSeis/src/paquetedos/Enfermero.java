package paquetedos;

public class Enfermero {

    private String nombre;
    private String tipoN;
    private double sueldoM;

    public Enfermero(String n, String tN, double sM) {
        nombre = n;
        tipoN = tN;
        sueldoM = sM;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTNombramiento(String tN) {
        tipoN = tN;
    }

    public void establecerSMensual(double sM) {
        sueldoM = sM;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTNombramiento() {
        return tipoN;
    }

    public double obtenerSMensual() {
        return sueldoM;
    }

}

// @cbhas
