package tarea3;
public class Herrero extends Persona {

    /*****
    * Nombre: Herrero
    ******
    * Descripción: constructor de la clase Herrero
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Herrero(String nombre) {
        super(nombre, 18, 9);
    }

    /*****
    * Nombre: mejorar
    ******
    * Descripción: aplicacion del metodo abstracto, mejora las estadisticas de la persona herrera
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
        setProductividad(getProductividad() + 3);
    }

    /*****
    * Nombre: trabajo_realizado
    ******
    * Descripción: aplicacion del metodo abstracto, determina la cantidad de trabajo que hace el herrero.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, cantidad de trabajo realizado por el herrero.
    *****/
    @Override
    public int trabajo_realizado() {
        System.out.println(getNombre() + " realizo un trabajo de:");
        System.out.println(getProductividad() + getNivel() * 2);
        return getProductividad() + getNivel() * 2;
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
    * int, 0 debido a que la persona no es granjero.
    *****/
    @Override
    public int es_granjero() {
        return 0;
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
    * int, 1 debido a que la persona es herrera.
    *****/
    @Override
    public int es_herrero() {
        return 1;
    }
}