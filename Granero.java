package tarea3;
import java.util.ArrayList;
import java.util.List;

public class Granero extends Edificio {

    /*****
    * Nombre: Granero
    ******
    * Descripción: constructor de la clase Granero
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Granero(String nombre) {
        super(nombre, 10);
    }

    /*****
    * Nombre: producir
    ******
    * Descripción: aplicacion del metodo abstracto, obtiene los valores de produccion del granero y los guarda en una lista.
    ******
    * Inputs:
    * Ninguno.
    ******
    * Returns:
    * List<Integer>, lista con los valores de produccion que se generaron en el granero.
    *****/
    @Override
    public List<Integer> producir() {
        List<Integer> produccion = new ArrayList<Integer>();
        int son_granjeros = 0;
        int total_personas = 0;
        for (int i = 0; i < getLista_personas().size(); i++) {
            son_granjeros += getLista_personas().get(i).es_granjero();
            total_personas += 1;
        }
        int javalares = 0;
        int trigo = 0;
        int tecnologia = 0;
        int hierro = 0;
        if (son_granjeros > (int) Math.floor(total_personas / 2)) {
            for (int i = 0; i < getLista_personas().size(); i++) {
                javalares += getLista_personas().get(i).trabajo_realizado();
            }
            javalares = (int) Math.floor(javalares / getLista_personas().size());
            for (int i = 0; i < getLista_personas().size(); i++) {
                trigo += getLista_personas().get(i).trabajo_realizado();
            }
            trigo = (int) Math.floor(trigo / Math.floor(getLista_personas().size() / 2));
            for (int i = 0; i < getLista_personas().size(); i++) {
                tecnologia += getLista_personas().get(i).es_cientifico();
            }
            produccion.add(javalares);
            produccion.add(trigo);
            produccion.add(tecnologia);
            produccion.add(hierro);
            return produccion;
        } else {
            javalares = ((-2) * getLista_personas().size());
            produccion.add(javalares);
            produccion.add(trigo);
            produccion.add(tecnologia);
            produccion.add(hierro);
            return produccion;

        }
    }

    /*****
    * Nombre: mejorar
    ******
    * Descripción: aplicacion del metodo abstracto, mejora las estadisticas del granero.
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
        setCapacidad(getCapacidad() + 3);
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
    * int, 1 debido a que el edificio es granero.
    *****/
    @Override
    public int es_granero() {
        return 1;
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
    * int, 0 debido a que el edificio no es zona comun.
    *****/
    @Override
    public int es_zonaComun() {
        return 0;
    }

}