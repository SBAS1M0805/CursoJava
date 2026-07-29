public class Principal {

    public static void main(String[] args) {

        Carro objetoCarro = new Carro();

        objetoCarro.setColor("azul");

        objetoCarro.acelerar(0, 100);
        System.out.println("El color del carro es: " + objetoCarro.getColor());

        objetoCarro.acelerar(20, 80);
    }
}