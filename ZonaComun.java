package tarea3;
import java.util.ArrayList;
import java.util.List;

public class ZonaComun extends Edificio {

    /*****
    * Nombre: ZonaComun
    ******
    * Descripción: constructor de la clase ZonaComun
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public ZonaComun(String nombre) {
        super(nombre, 6);
    }

    /*****
    * Nombre: producir
    ******
    * Descripción: aplicacion del metodo abstracto, obtiene los valores de produccion la zona comun y los guarda en una lista.
    ******
    * Inputs:
    * Ninguno.
    ******
    * Returns:
    * List<Integer>, lista con los valores de produccion que se generaron en la zona comun.
    *****/
    @Override
    public List<Integer> producir() {
        List<Integer> produccion = new ArrayList<Integer>();
        int javalares = 0;
        int trigo = 0;
        int tecnologia = 0;
        int hierro = 0;
        javalares = getLista_personas().size();
        produccion.add(javalares);
        produccion.add(trigo);
        produccion.add(tecnologia);
        produccion.add(hierro);
        return produccion;
    }

    /*****
    * Nombre: mejorar
    ******
    * Descripción: aplicacion del metodo abstracto, mejora las estadisticas la zona comun.
    ******
    * Inputs:
    * Ninguno.
    ******
    * Returns:
    * Ninguno.
    *****/
    @Override
    public void mejorar() {
        setNivel(getNivel() + 1);
        setCapacidad(getCapacidad() + 4);
    }

    /*****
    * Nombre: es_granero
    ******
    * Descripción: aplicacion del metodo abstracto, determina si un edificio es granero o no.
    ******
    * Inputs:
    * Ninguno.
    ******
    * Returns:
    * int, 0 debido a que el edificio no es granero.
    *****/
    @Override
    public int es_granero() {
        return 0;
    }

    /*****
    * Nombre: es_laboratorio
    ******
    * Descripción: aplicacion del metodo abstracto, determina si un edificio es laboratorio o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 0 debido a que el edificio no es laboratorio.
    *****/
    @Override
    public int es_laboratorio() {
        return 0;
    }

    /*****
    * Nombre: es_herreria
    ******
    * Descripción: aplicacion del metodo abstracto, determina si un edificio es herreria o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 0 debido a que el edificio no es herreria.
    *****/
    @Override
    public int es_herreria() {
        return 0;
    }

    /*****
    * Nombre: es_zonaComun
    ******
    * Descripción: aplicacion del metodo abstracto, determina si un edificio es zona comun o no.
    ******
    * Inputs:
    * Ninguno
    ******
    * Returns:
    * int, 1 debido a que el edificio es zona comun.
    *****/
    @Override
    public int es_zonaComun() {
        return 1;
    }

}
