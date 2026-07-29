

public class F1 extends Carro{

    //atributos propios de esta clase
    private String Escuderia;

    //Constructor
    //super que sirve para llamar al constructor de la clase padre
    public F1(String entradaPlaca, String entradaMarca, String entradaColor, int entradaCantPasajeros, int entradaModelo, String entradaEscuderia) {
        super(entradaPlaca, entradaMarca, entradaColor, entradaCantPasajeros, entradaModelo);
        this.Escuderia = entradaEscuderia;

    }

    public void frenar(int velocidadOrigen, int velocidadFinal) {
        while (velocidadOrigen > velocidadFinal){
            System.out.println("Frenando... " + velocidadOrigen);
            velocidadOrigen-= 40;
        }
    }

    public boolean frenar (){
        return true;
    }

    public void frenar (int velocidadEntrada) {
        JOptionPane.showMessageDialog(null, "F1 Frenando");
    }

    //TIPOS DE POLIMORFISMO
    //POLIMORFISMO DE HERENCIA
    //POLIMORFISMO DE SOBRECARGA
    //POLIMORFISMO ABSTRACTO



}
