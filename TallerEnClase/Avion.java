package tallerenclase;

public class Avion {
    String matricula;
    int modelo;
    int capPasajeros;

    public Avion (String entradaMatricula, int entradaModelo, int entradaCapPasajeros) {
        this.capPasajereros = entradaCapPasajeros;
        this.modelo = entradaModelo;
        this.matricula = entradaMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapPasajeros() {
        return capPasajeros;
    }

    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public void mostrarInformacionAvion() {
    System.out.println("Matricula del Avion: " + matricula());
    System.out.println("Modelo del Avion: " + modelo());
    System.out.println("Capacidad de Pasajeros: " + capPasajeros());

    }



}
