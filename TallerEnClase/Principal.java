package TallerEnClase;

public class Principal {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo(23, "Bogota", "Medellin", "23/10/26", "18:30");
        Piloto piloto1 = new Piloto("Sebastian", 45, 109828376, true, 180);
        Avion avion1 = new Avion("ABC123", 2020, 150);
        piloto1.mostrarInformacionPiloto();
        vuelo1.mostrarInformacionVuelo();
        avion1.mostrarInformacionAvion();
    }

    

}
