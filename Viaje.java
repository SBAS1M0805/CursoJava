public class Viaje {
    
    private CarroFamiliar atributoCarro;
    private Persona atriutoPasajero[];

    /*para realizar la dependencia o composicion 
    debo realizar dihca dependecia empleando un Constructor*/

    public Viaje (Persona objetoEntrada[]) {
        
        this.atriutoPasajero = objetoEntrada;
    }

    public CarroFamiliar getAtributoCarro() {
        return atributoCarro;
    }

    public void setAtributoCarro(CarroFamiliar atributoCarro) {
        this.atributoCarro = atributoCarro;
    }

    
}
