public class Carro {

    // Atributos
    private String placa;
    private String marca;
    private int cantidadPasajeros;
    private String color;
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

    public void setColor(String entradaColor) {
        color = entradaColor;
    }

    public String getColor() {
        return color;
    }
}