package TallerEnClase;

public class Vuelo {
    private String numVuelo;
    private String origen;
    private String destino;
    private String fechaVuelo;
    private String horaVuelo;


    public Vuelo (String entradaNumVuelo, String entradaOrigen, String entradaDestino, String entradaFechaVuelo, String entradaHoraVuelo) {
        this.numVuelo = entradaNumVuelo;
        this.origen = entradaOrigen;
        this.destino = entradaDestino;
        this.fechaVuelo = entradaFechaVuelo;
        this.horaVuelo= entradaHoraVuelo;
    }


    public String getNumVuelo() {
        return numVuelo;
    }


    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }


    public String getOrigen() {
        return origen;
    }


    public void setOrigen(String origen) {
        this.origen = origen;
    }


    public String getDestino() {
        return destino;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }


    public String getFechaVuelo() {
        return fechaVuelo;
    }


    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }


    public String getHoraVuelo() {
        return horaVuelo;
    }


    public void setHoraVuelo(String horaVuelo) {
        this.horaVuelo = horaVuelo;
    }

    public void mostrarInformacionVuelo() {
    System.out.println("Numero del Vuelo: " + vuelo());
    System.out.println("Origen del vuelo: " + origen());
    System.out.println("Destino del Vuelo: " + destino());
    System.out.println("Fecha del Vuelo: " + fechaVuelo());
    System.out.println("Hora del Vuelo: " + horaVuelo());

    
}
