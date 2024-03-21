package tarea3;
import java.util.List;

public class Feria implements Atraccion {
    private String nombre;

    /*****
    * Nombre: Feria
    ******
    * Descripción: constructor de la clase Feria
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Feria(String nombre) {
        this.nombre = nombre;
    }

    /*****
    * Nombre: visitar
    ******
    * Descripción: aplicacion del metodo abstracto, determina la cantidad de javarales que se obtinene cuando las personas visitan la feria.
    ******
    * Inputs:
    * List<Persona> lista_personas.
    ******
    * Returns:
    * int, cantidad javarales generados por la feria.
    *****/
    @Override
    public int visitar(List<Persona> lista_personas) {
        int son_granjeros = 0;
        int son_cientificos = 0;
        int son_herreros = 0;
        int javalares = 0;
        for (int i = 0; i < lista_personas.size(); i++) {
            son_granjeros += lista_personas.get(i).es_granjero();
            son_cientificos += lista_personas.get(i).es_cientifico();
            son_herreros += lista_personas.get(i).es_herrero();
        }
        javalares = (int) (2 * son_granjeros + 2 * Math.floor(son_cientificos / 2) + 2 * Math.floor(son_herreros / 3));
        return javalares;
    }

    /*****
    getter y setters de los atributos de la clase
    *****/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
