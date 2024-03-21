package tarea3;
import java.util.List;

public class Museo implements Atraccion {
    private String nombre;

    /*****
    * Nombre: Museo
    ******
    * Descripción: constructor de la clase Museo
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Museo(String nombre) {
        this.nombre = nombre;
    }

    /*****
    * Nombre: visitar
    ******
    * Descripción: aplicacion del metodo abstracto, determina la cantidad de javarales que se obtinene cuando las personas visitan el museo.
    ******
    * Inputs:
    * List<Persona> lista_personas.
    ******
    * Returns:
    * int, cantidad javarales generados por el museo.
    *****/
    @Override
    public int visitar(List<Persona> lista_personas) {
        int son_cientificos = 0;
        int son_herreros = 0;
        int son_granjeros = 0;
        int javalares = 0;
        for (int i = 0; i < lista_personas.size(); i++) {
            son_cientificos += lista_personas.get(i).es_cientifico();
            son_herreros += lista_personas.get(i).es_herrero();
            son_granjeros += lista_personas.get(i).es_granjero();
        }
        javalares = (int) (4 * son_cientificos + 4 * Math.floor(son_granjeros / 4) + 4 * Math.floor(son_herreros / 2));
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
