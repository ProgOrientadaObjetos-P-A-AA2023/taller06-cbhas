package paquetedos;

public class Hospital {

    private String nombreH;
    private Ciudad ciudad;
    private Medico[] medico;
    private Enfermero[] enfermero;
    private double sueldoT;
    private String direccion;
    private int nEspecialidades;

    public Hospital(String nH, Ciudad c, Medico[] m, Enfermero[] e, double sT, String d) {
        nombreH = nH;
        ciudad = c;
        medico = m;
        enfermero = e;
        sueldoT = sT;
        direccion = d;
    }

    public void establecerNHospital(String nH) {
        nombreH = nH;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public void establecerMedico(Medico[] m) {
        medico = m;
    }

    public void establecerEnfermero(Enfermero[] e) {
        enfermero = e;
    }

    public void calcularSTotal() {
        for (Medico m : medico) {
            sueldoT += m.obtenerSMensual();
        }

        for (Enfermero e : enfermero) {
            sueldoT += e.obtenerSMensual();
        }
    }

    public void calcularNEspecialidades() {
        nEspecialidades = medico.length + enfermero.length;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }

    public String obtenerNHospital() {
        return nombreH;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public Medico[] obtenerMedico() {
        return medico;
    }

    public Enfermero[] obtenerEnfermero() {
        return enfermero;
    }

    public double obtenerSTotal() {
        return sueldoT;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public int obtenerNEspecialidades() {
        return nEspecialidades;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       HOSPITAL %S
                                       Dirección: %s
                                       Ciudad: %s
                                       Provincia: %s
                                       Número de especialidades: %d
                                       Listado de médicos
                                       """,
                nombreH,
                direccion,
                obtenerCiudad().obtenerNHospital(),
                obtenerCiudad().obtenerPHospital(),
                nEspecialidades);

        for (int i = 0; i < medico.length; i++) {
            mensaje = String.format("""
                                    %s- %s - sueldo: %.2f - %s                         
                                    """,
                    mensaje,
                    obtenerMedico()[i].obtenerNDoctor(),
                    obtenerMedico()[i].obtenerSMensual(),
                    obtenerMedico()[i].obtenerEspecialidad());
        }

        mensaje = String.format("%s\nListado de enfermeros(as)\n",
                mensaje);
        for (int i = 0; i < enfermero.length; i++) {
            mensaje = String.format("""
                                    %s- %s - sueldo: %.2f - %s                         
                                    """,
                    mensaje,
                    obtenerEnfermero()[i].obtenerNombre(),
                    obtenerEnfermero()[i].obtenerSMensual(),
                    obtenerEnfermero()[i].obtenerTNombramiento());
        }

        mensaje = String.format("%sTotal de sueldos a pagar por mes: %.2f",
                mensaje,
                obtenerSTotal());

        return mensaje;
    }

}

// @cbhas
