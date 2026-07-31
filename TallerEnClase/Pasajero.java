package TallerEnClase;

public class Pasajero extends Persona {
    private String ticket;
    private int asiento;

    public Pasajero (String entradaNombre, int entradaDocumento, int entradaEdad,
        String entradaTicket, int entradaAsiento) {
            super (entradaNombre, entradaEdad, entradaDocumento);

            this.ticket = entradaTicket;
            this.asiento = entradaAsiento;

        }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
    
        

}
