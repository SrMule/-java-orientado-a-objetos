package tarea3;
import java.util.ArrayList;
import java.util.List;

public abstract class Edificio {
    private String nombre;
    private int nivel;
    private int capacidad;
    private List<Persona> lista_personas;

    /*****
    * Nombre: Edificio
    ******
    * Descripción: constructor de la clase Edificio
    ******
    * Inputs:
    * String nombre, int capacidad
    ******
    * Returns:
    * Ninguno
    *****/
    public Edificio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.nivel = 1;
        this.capacidad = capacidad;
        lista_personas = new ArrayList<Persona>();
    }

    /*****
    * Nombre: agregar_persona
    ******
    * Descripción: agrega una persona a la lista de personas del edificio.
    ******
    * Inputs:
    * Persona persona
    ******
    * Returns:
    * Ninguno.
    *****/
    public void agregar_persona(Persona persona) {
        lista_personas.add(persona);
    }

    /*****
    * Nombre: sacar_persona
    ******
    * Descripción: saca una persona de la lista de personas del edificio.
    ******
    * Inputs:
    * String persona
    ******
    * Returns:
    * Ninguno.
    *****/
    public void sacar_persona(String persona) {
        for (int i = 0; i < lista_personas.size(); i++) {
            if (persona == lista_personas.get(i).getNombre()) {
                lista_personas.remove(i);
            }
        }
    }

    /*****
    * Nombre: producir
    ******
    * Descripción: metodo abstracto, obtiene los valores de produccion del edificio y los guarda en una lista.
    ******
    * Inputs:
    * Ninguno.
    ******
    * Returns:
    * List<Integer>, lista con los valores de produccion que se generaron.
    *****/
    public abstract List<Integer> producir();

    /*****
    * Nombre: mejorar
    ******
    * Descripción: metodo abstracto, mejora las estadisticas del edificio.
    ******
    * Inputs:
    * Ninguno.
    ******
    * Returns:
    * Ninguno.
    *****/
    public abstract void mejorar();

    /*****
    * Nombre: es_granero
    ******
    * Descripción: metodo abstracto, determina si un edificio es granero o no.
    ******
    * Inputs:
    * Ninguno.
    ******
    * Returns:
    * int, 1 si el edificio es granero y un 0 si no lo es.
    *****/
    public abstract int es_granero();

    /*****
    * Nombre: es_herreria
    ******
    * Descripción: metodo abstracto, determina si un edificio es herreria o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 1 si el edificio es herreria y un 0 si no lo es.
    *****/
    public abstract int es_herreria();

    /*****
    * Nombre: es_laboratorio
    ******
    * Descripción: metodo abstracto, determina si un edificio es laboratorio o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 1 si el edificio es laboratorio y un 0 si no lo es.
    *****/
    public abstract int es_laboratorio();

    /*****
    * Nombre: es_zonaComun
    ******
    * Descripción: metodo abstracto, determina si un edificio es zona comun o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 1 si el edificio es zona comun y un 0 si no lo es.
    *****/
    public abstract int es_zonaComun();

    /*****
    getter y setters de los atributos de la clase
    *****/
    public String getNombre() {
        return this.nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public List<Persona> getLista_personas() {
        return this.lista_personas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setLista_personas(List<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }

}
