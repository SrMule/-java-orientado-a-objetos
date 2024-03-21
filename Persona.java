package tarea3;
public abstract class Persona {
    private String nombre;
    private int edad;
    private int nivel;
    private int productividad;

    /*****
    * Nombre: Persona
    ******
    * Descripción: constructor de la clase Persona
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Persona(String nombre, int edad, int productividad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = 1;
        this.productividad = productividad;
    }

    /*****
    * Nombre: envejecer
    ******
    * Descripción: Hace envejecer en un año a la persona
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * Ninguno
    *****/
    public void envejecer() {
        this.edad = this.edad + 1;
    }

    /*****
    * Nombre: mejorar
    ******
    * Descripción: metodo abstracto, mejora las estadisticas de la persona
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * Ninguno
    *****/
    public abstract void mejorar();

    /*****
    * Nombre: trabajo_realizado
    ******
    * Descripción: metodo abstracto, determina la cantidad de trabajo que hace la persona
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, cantidad de trabajo realizado por la persona
    *****/
    public abstract int trabajo_realizado();

    /*****
    * Nombre: es_granjero
    ******
    * Descripción: metodo abstracto, determina si una persona es granjera o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, retorna un 1 si la persona es granjera y un 0 si no lo es
    *****/
    public abstract int es_granjero();

    /*****
    * Nombre: es_cientifico
    ******
    * Descripción: metodo abstracto, determina si una persona es cientifico o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, retorna un 1 si la persona es cientifico y un 0 si no lo es
    *****/
    public abstract int es_cientifico();

    /*****
    * Nombre: es_herrero
    ******
    * Descripción: metodo abstracto, determina si una persona es herrera o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, retorna un 1 si la persona es herrera y un 0 si no lo es
    *****/
    public abstract int es_herrero();

    /*****
    getter y setters de los atributos de la clase
    *****/
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getNivel() {
        return this.nivel;
    }

    public int getProductividad() {
        return this.productividad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setProductividad(int productividad) {
        this.productividad = productividad;
    }
}