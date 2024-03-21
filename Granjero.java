package tarea3;
public class Granjero extends Persona {

    /*****
    * Nombre: Granjero
    ******
    * Descripción: constructor de la clase Granjero
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Granjero(String nombre) {
        super(nombre, 15, 8);
    }

    /*****
    * Nombre: mejorar
    ******
    * Descripción: aplicacion del metodo abstracto, mejora las estadisticas de la persona granjera
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * Ninguno
    *****/
    @Override
    public void mejorar() {
        setNivel(getNivel() + 1);
        setProductividad(getProductividad() + 2);
    }

    /*****
    * Nombre: trabajo_realizado
    ******
    * Descripción: aplicacion del metodo abstracto, determina la cantidad de trabajo que hace el granjero.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, cantidad de trabajo realizado por el granjero.
    *****/
    @Override
    public int trabajo_realizado() {
        System.out.println(getNombre() + " realizo un trabajo de:");
        System.out.println(getProductividad() * 2 + Math.floor(getNivel() / 2));
        return (int) (getProductividad() * 2 + Math.floor(getNivel() / 2));
    }

    /*****
    * Nombre: es_granjero
    ******
    * Descripción: aplicacion del metodo abstracto, determina si una persona es granjera o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 1 debido a que la persona es granjero.
    *****/
    @Override
    public int es_granjero() {
        return 1;
    }

    /*****
    * Nombre: es_cientifico
    ******
    * Descripción: aplicacion del metodo abstracto, determina si una persona es cientifico o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 0 debido a que la persona no es cientifico.
    *****/
    @Override
    public int es_cientifico() {
        return 0;
    }

    /*****
    * Nombre: es_herrero
    ******
    * Descripción: aplicacion del metodo abstracto, determina si una persona es herrera o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 0 debido a que la persona no es herrera.
    *****/
    @Override
    public int es_herrero() {
        return 0;
    }
}