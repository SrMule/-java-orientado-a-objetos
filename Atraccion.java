package tarea3;
import java.io.IOException;
import java.util.List;

public interface Atraccion {

    /*****
    * Nombre: visitar
    ******
    * Descripción: metodo abstracto, determina la cantidad de javarales que se obtinene cuando las personas visitan las atracciones.
    ******
    * Inputs:
    * List<Persona> lista_personas.
    ******
    * Returns:
    * int, cantidad javarales generados por las atracciones.
    *****/
    int visitar(List<Persona> lista_personas) throws IOException;

}
