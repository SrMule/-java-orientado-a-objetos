package tarea3;
public class Cientifico extends Persona {

    /*****
    * Nombre: Cientifico
    ******
    * Descripción: constructor de la clase Cientifico
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Cientifico(String nombre) {
        super(nombre, 24, 10);
    }

    /*****
    * Nombre: mejorar
    ******
    * Descripción: aplicacion del metodo abstracto, mejora las estadisticas de la persona cientifica
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
        setProductividad(getProductividad() + 1);
    }

    /*****
    * Nombre: trabajo_realizado
    ******
    * Descripción: aplicacion del metodo abstracto, determina la cantidad de trabajo que hace el cientifico.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, cantidad de trabajo realizado por el cientifico.
    *****/
    @Override
    public int trabajo_realizado() {
        System.out.println(getNombre() + " realizo un trabajo de:");
        System.out.println(getProductividad() * 3 + getNivel());
        return getProductividad() * 3 + getNivel();
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
    * int, 1 debido a que la persona es cientifico.
    *****/
    @Override
    public int es_cientifico() {
        return 1;
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