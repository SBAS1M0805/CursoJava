public class Vuelo {
    Avion avion;
    Piloto piloto;
    Pasajero[] pasajeros;

    public Vuelo(Avion avion, Piloto piloto) {
        this.avion = avion;
        this.piloto = piloto;
        pasajeros = new Pasajero[100];
    }

public void agregarPasajero(Pasajero nuevoPasajero) {
    for (int i = 0; i < 100; i++) {
        if (pasajeros[i] == null) {
            pasajeros[i] = nuevoPasajero;
            break;
        }
    }
}

public void mostrarInformacion() {
    System.out.println("Modelo del avión: " + avion.modelo);
    System.out.println("Aerolinia del avion: " + avion.aerolinea );
    System.out.println("Capacidad de pasajeros del avion: " + avion.cap_pasajeros );
    System.out.println("Nombre del piloto: " + piloto.getNombre() );
    System.out.println("Apellido del piloto: " + piloto.getApellido() );
    System.out.println("Documento del piloto: " + piloto.getDocumento() );
    System.out.println("¿El piloto posee licencia? " + piloto.tiene_licencia );
    System.out.println("Cantidad de horas en el aire del piloto: " + piloto.horas_vuelo );

    
}

}