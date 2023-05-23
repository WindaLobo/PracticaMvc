

public class Controller {
    static Modelo miModelo;
    static View miVista;
    public static void main(String[] args) {
        miModelo = new Modelo();
        miVista = new View();
    }

    public void cerarPersona(String nombre, String apellido) {
        Persona persona = miModelo.cerarPersona(nombre, apellido);
        if (persona != null)
            miVista.mostrarDetallesUsuario(nombre, apellido);
    }
}

