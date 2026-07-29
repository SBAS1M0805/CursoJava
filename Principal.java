public class Principal {

    public static void main(String[] args) {

        // Crear objeto
        Carro objetoCarro = new Carro();

        // Asignar color
        objetoCarro.setColor("Azul");

        // Acelerar
        objetoCarro.acelerar(0, 100);

        // Frenar
        objetoCarro.frenar(100);

        // Encender luces
        objetoCarro.encenderLuces();

        // Ver gasolina
        objetoCarro.verGasolina();

        // Mostrar color
        System.out.println("El color del carro es: " + objetoCarro.getColor());

        // Volver a acelerar
        objetoCarro.acelerar(20, 80);
    }
}