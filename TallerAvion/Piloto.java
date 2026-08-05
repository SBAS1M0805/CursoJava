public class Piloto extends Persona {
    boolean tiene_licencia;
    int horas_vuelo;
    public Piloto(String nombre, String apellido, int documento, boolean tiene_licencia, int horas_vuelo) {
        super(nombre, apellido, documento);
        this.tiene_licencia = tiene_licencia;
        this.horas_vuelo = horas_vuelo;
    }

    
}
