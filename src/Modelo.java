import java.util.ArrayList;
public class Modelo {
    static ArrayList<Persona> personas = new ArrayList<>();
    Persona persona;
    public Persona  cerarPersona (String nombre, String apellido) {
        persona = new Persona(nombre, apellido);
        personas.add(persona);
        return persona;
    }
}
