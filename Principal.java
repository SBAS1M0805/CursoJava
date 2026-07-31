

public class Principal {

    public static void main(String[] args) {

        Carro objetoCarro = new Carro("JSH876", "Toyota", "Rojo", 5, 2020);
        F1 objetoF1 = new F1("ABC123", "Ferrari", "Rojo", 1, 2022, "Ferrari");
        objetoCarro.setColor("azul");

        objetoCarro.acelerar(0, 100);
        System.out.println("El color del carro es: " + objetoCarro.getColor());

        objetoCarro.acelerar(20, 80);
        objetoF1.acelerar(100, 350);

        Persona pasajero1 = new Persona("Juan", 35);
        Persona pasajero2 = new Persona("Ricardo", 60);
        Persona pasajero3 = new Persona("Carlos", 12);

        Persona [] listaPasajeros = new Persona[3];
        listaPasajeros[0] = pasajero1;
        listaPasajeros[1] = pasajero2;
        listaPasajeros[2] = pasajero3;
        Persona [] lista2 = {pasajero1, pasajero2, pasajero3};

        //relacion fuerte - Composicion o dependencia
        Viaje objetoViaje = new Viaje(listaPasajeros);

        CarroFamiliar objetoCarroFamiliar = new CarroFamiliar("XYZ789", "Honda", "Negro", 5, 2021);

        ObjetoViaje.setAtributoCarro(objetoCarro);

    }
}