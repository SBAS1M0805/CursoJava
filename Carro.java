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

        Carro miCarro = new Carro("JSH876", "Toyota", "Rojo", 5, 2020);

        miCarro.acelerar(0, 100);
    }

    public void setColor(String entradaColor) {
        color = entradaColor;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public int getModelo() {
        return modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    //CONSTRUCTORES
    public Carro (String entradaPlaca, String entradaMarca, String entradaColor, int entradaCantPasajeros, int entradaModelo) {
        placa = entradaPlaca;
        marca = entradaMarca;
        color = entradaColor;
        cantidadPasajeros = entradaCantPasajeros;
        modelo = entradaModelo;

    }
}