public class Pasajero extends Persona {
    String num_asiento;

    public Pasajero(String num_asiento, String nombre, String apellido, int documento) {
        super(nombre, apellido, documento);
        this.num_asiento = num_asiento;
    }



    
}
