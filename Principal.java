

public class Principal {

    public static void main(String[] args) {

        Carro objetoCarro = new Carro("JSH876", "Toyota", "Rojo", 5, 2020);
        F1 objetoF1 = new F1("ABC123", "Ferrari", "Rojo", 1, 2022, "Ferrari");
        objetoCarro.setColor("azul");

        objetoCarro.acelerar(0, 100);
        System.out.println("El color del carro es: " + objetoCarro.getColor());

        objetoCarro.acelerar(20, 80);
        objetoF1.acelerar(100, 350);
    }
}