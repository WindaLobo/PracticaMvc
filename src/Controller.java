

public class Controller {
    static Modelo miModelo;
    static View miVista;
    public static void main(String[] args) {
        miModelo = new Modelo();
        miVista = new View();
    }

    public void cerarPersona(String nombre, String apellido,int edad) {
        Persona persona = miModelo.cerarPersona(nombre, apellido,edad);
        if (persona != null)
            miVista.mostrarDetallesUsuario(nombre, apellido);
    }
}

