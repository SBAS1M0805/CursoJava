package TallerEnClase;
public class Piloto extends Persona {
    private boolean  licencia;
    private int horasVuelo;

    public Piloto (String entradaNombre, int entradaEdad, String entradaDocumento, String entradaLicencia,
        int entradaHorasVuelo
    ) {
        super (entradaNombre, entradaEdad, entradaDocumento);
        this.licencia = entradaLicencia;
        this.horasVuelo = entradaHorasVuelo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public void mostrarInformacionPiloto() {
    System.out.println("Piloto: " + nombre () + edad() + años);
    System.out.println("Documento: " + documento());
    System.out.println("Licencia: " + licencia);
    System.out.println("Horas de vuelo: " + horasVuelo);
}

    

    
}
