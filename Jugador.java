package tarea3;
import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private int javalares;
    private int hierro;
    private int trigo;
    private int tecnologia;
    private List<Persona> lista_personas;
    private List<Edificio> lista_edificios;
    private List<Feria> lista_ferias;
    private List<Museo> lista_museos;
    private List<Javapato> lista_javapatos;

    /*****
    * Nombre: Jugador
    ******
    * Descripción: constructor de la clase Jugador
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.javalares = 30;
        this.hierro = 30;
        this.trigo = 10;
        this.tecnologia = 6;
        lista_personas = new ArrayList<Persona>();
        lista_edificios = new ArrayList<Edificio>();
        lista_ferias = new ArrayList<Feria>();
        lista_museos = new ArrayList<Museo>();
        lista_javapatos = new ArrayList<Javapato>();
    }

    /*****
    * Nombre: agregar_persona
    ******
    * Descripción: agrega una persona a la lista de personas del jugador
    ******
    * Inputs:
    * Persona persona
    ******
    * Returns:
    * Ninguno
    *****/
    public void agregar_persona(Persona persona) {
        this.lista_personas.add(persona);
    }

    /*****
    * Nombre: agregar_edificio
    ******
    * Descripción: agrega un edificio a la lista de edificios del jugador
    ******
    * Inputs:
    * Edificio edificio
    ******
    * Returns:
    * Ninguno
    *****/
    public void agregar_edificio(Edificio edificio) {
        this.lista_edificios.add(edificio);
    }

    /*****
    * Nombre: agregar_feria
    ******
    * Descripción: agrega una feria a la lista de ferias del jugador
    ******
    * Inputs:
    * Feria feria
    ******
    * Returns:
    * Ninguno
    *****/
    public void agregar_feria(Feria feria) {
        this.lista_ferias.add(feria);
    }

    /*****
    * Nombre: agregar_museo
    ******
    * Descripción: agrega un museo a la lista de museos del jugador
    ******
    * Inputs:
    * Museo museo
    ******
    * Returns:
    * Ninguno
    *****/
    public void agregar_museo(Museo museo) {
        this.lista_museos.add(museo);
    }

    /*****
    * Nombre: agregar_javapato
    ******
    * Descripción: agrega un javapato a la lista de javapatos del jugador
    ******
    * Inputs:
    * Javapato javapato
    ******
    * Returns:
    * Ninguno
    *****/
    public void agregar_javapato(Javapato javapato) {
        this.lista_javapatos.add(javapato);
    }

    /*****
    * Nombre: sacar_persona
    ******
    * Descripción: saca una persona de la lista de personas del jugador
    ******
    * Inputs:
    * String persona
    ******
    * Returns:
    * Ninguno
    *****/
    public void sacar_persona(String persona) {
        for (int i = 0; i < this.lista_personas.size(); i++) {
            if (persona == this.lista_personas.get(i).getNombre()) {
                this.lista_personas.remove(i);
            }
        }
    }

    /*****
    * Nombre: sacar_edificio
    ******
    * Descripción: saca un edificio de la lista de edificios del jugador
    ******
    * Inputs:
    * String edificio
    ******
    * Returns:
    * Ninguno
    *****/
    public void sacar_edificio(String edificio) {
        for (int i = 0; i < this.lista_edificios.size(); i++) {
            if (edificio == this.lista_edificios.get(i).getNombre()) {
                this.lista_edificios.remove(i);
            }
        }
    }

    /*****
    * Nombre: sacar_atraccion
    ******
    * Descripción: saca una atraccion de la lista de atracciones del jugador
    ******
    * Inputs:
    * String atraccion, String clase
    ******
    * Returns:
    * Ninguno
    *****/
    public void sacar_atraccion(String atraccion, String clase) {
        if (clase == "Feria") {
            for (int i = 0; i < lista_ferias.size(); i++) {
                if (atraccion == this.lista_ferias.get(i).getNombre()) {
                    this.lista_ferias.remove(i);
                }
            }
        } else if (clase == "Museo") {
            for (int i = 0; i < lista_museos.size(); i++) {
                if (atraccion == this.lista_museos.get(i).getNombre()) {
                    this.lista_museos.remove(i);
                }
            }
        } else if (clase == "Javapato") {
            for (int i = 0; i < lista_javapatos.size(); i++) {
                if (atraccion == this.lista_javapatos.get(i).getNombre()) {
                    this.lista_javapatos.remove(i);
                }
            }
        }
    }

    /*****
    getter y setters de los atributos de la clase
    *****/
    public String getNombre() {
        return this.nombre;
    }

    public int getJavalares() {
        return this.javalares;
    }

    public int getHierro() {
        return this.hierro;
    }

    public int getTrigo() {
        return this.trigo;
    }

    public int getTecnologia() {
        return this.tecnologia;
    }

    public List<Persona> getLista_personas() {
        return this.lista_personas;
    }

    public List<Edificio> getLista_edificios() {
        return this.lista_edificios;
    }

    public List<Feria> getLista_ferias() {
        return this.lista_ferias;
    }

    public List<Museo> getLista_museos() {
        return this.lista_museos;
    }

    public List<Javapato> getLista_javapatos() {
        return this.lista_javapatos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJavalares(int javalares) {
        this.javalares = javalares;
    }

    public void setHierro(int hierro) {
        this.hierro = hierro;
    }

    public void setTrigo(int trigo) {
        this.trigo = trigo;
    }

    public void setTecnologia(int tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setLista_personas(List<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }

    public void setLista_edificios(List<Edificio> lista_edificios) {
        this.lista_edificios = lista_edificios;
    }

    public void setLista_ferias(List<Feria> lista_ferias) {
        this.lista_ferias = lista_ferias;
    }

    public void setLista_museos(List<Museo> lista_museos) {
        this.lista_museos = lista_museos;
    }

    public void setLista_javapatos(List<Javapato> lista_javapatos) {
        this.lista_javapatos = lista_javapatos;
    }
}
