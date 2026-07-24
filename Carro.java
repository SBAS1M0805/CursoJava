public class Carro {

    // Atributos
    String placa;
    String marca;
    int cantidadPasajeros;
    String color;
    int modelo;

    // Método
    public void acelerar(int velocidadActual, int velocidadFinal) {
        int velocidad = velocidadActual;

        while (velocidad < velocidadFinal) {
            velocidad = velocidad + 20;
            System.out.println("Acelerando! velocidad actual = " + velocidad);
        }
    }

    // Método principal
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Carro miCarro = new Carro();

        miCarro.acelerar(0, 100);
    }
}