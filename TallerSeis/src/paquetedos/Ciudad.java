package paquetedos;

public class Ciudad {

    private String nombreC;
    private String provinviaC;

    public Ciudad(String nC, String pC) {
        nombreC = nC;
        provinviaC = pC;
    }

    public void establecerNHospital(String nC) {
        nombreC = nC;
    }

    public void establecerPHospital(String pC) {
        provinviaC = pC;
    }

    public String obtenerNHospital() {
        return nombreC;
    }

    public String obtenerPHospital() {
        return provinviaC;
    }

}

// @cbhas
