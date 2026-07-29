public class Carro {

    // Atributos
    private String placa;
    private String marca;
    private int cantidadPasajeros;
    private String color;
    private int modelo;

    // Nuevos atributos
    private boolean lucesEncendidas;
    private int gasolina = 100;

    // Método para acelerar
    public void acelerar(int velocidadActual, int velocidadFinal) {
        int velocidad = velocidadActual;

        while (velocidad < velocidadFinal) {
            velocidad = velocidad + 20;
            System.out.println("Acelerando... velocidad actual = " + velocidad);
        }
    }

    // Método para frenar
    public void frenar(int velocidadActual) {
        int velocidad = velocidadActual;

        while (velocidad > 0) {
            velocidad = velocidad - 20;

            if (velocidad < 0) {
                velocidad = 0;
            }

            System.out.println("Frenando... velocidad actual = " + velocidad);
        }
    }

    // Método para encender las luces
    public void encenderLuces() {
        lucesEncendidas = true;
        System.out.println("Las luces están encendidas.");
    }

    // Método para ver el nivel de gasolina
    public void verGasolina() {
        System.out.println("Nivel de gasolina: " + gasolina + "%");
    }

    // Setter del color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter del color
    public String getColor() {
        return color;
    }
}