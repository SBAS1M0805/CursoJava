public class Principal {

    public static void main(String[] args) {

        Carro objetoCarro = new Carro();

        objetoCarro.color = "azul";

        objetoCarro.acelerar(0, 100);
        System.out.println("El color del carro es: " + objetoCarro.color);

        objetoCarro.acelerar(20, 80);
    }
}