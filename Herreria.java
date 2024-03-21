package tarea3;
import java.util.ArrayList;
import java.util.List;

public class Herreria extends Edificio {

    /*****
    * Nombre: Herreria
    ******
    * Descripción: constructor de la clase Herreria
    ******
    * Inputs:
    * String nombre
    ******
    * Returns:
    * Ninguno
    *****/
    public Herreria(String nombre) {
        super(nombre, 8);
    }

    /*****
    * Nombre: producir
    ******
    * Descripción: aplicacion del metodo abstracto, obtiene los valores de produccion la herreria y los guarda en una lista.
    ******
    * Inputs:
    * Ninguno.
    ******
    * Returns:
    * List<Integer>, lista con los valores de produccion que se generaron en la herreria.
    *****/
    @Override
    public List<Integer> producir() {
        List<Integer> produccion = new ArrayList<Integer>();
        int son_herreros = 0;
        int son_cientificos = 0;
        int total_personas = 0;
        for (int i = 0; i < getLista_personas().size(); i++) {
            son_herreros += getLista_personas().get(i).es_herrero();
            son_cientificos += getLista_personas().get(i).es_cientifico();
            total_personas += 1;
        }
        int javalares = 0;
        int trigo = 0;
        int tecnologia = 0;
        int hierro = 0;
        for (int i = 0; i < getLista_personas().size(); i++) {
            if (getLista_personas().get(i).es_herrero() == 1) {
                javalares += getLista_personas().get(i).trabajo_realizado();
            }
        }
        javalares = (int) Math.floor(javalares / getLista_personas().size());
        for (int i = 0; i < getLista_personas().size(); i++) {
            if (getLista_personas().get(i).es_herrero() == 1) {
                hierro += getLista_personas().get(i).trabajo_realizado();
            }
        }
        hierro = (int) Math.floor(hierro / (total_personas - son_herreros));
        for (int i = 0; i < getLista_personas().size(); i++) {
            if (getLista_personas().get(i).es_cientifico() == 1) {
                tecnologia += getLista_personas().get(i).trabajo_realizado();
            }
        }
        tecnologia = (int) Math.floor(tecnologia / 3);
        tecnologia = (int) Math.floor(tecnologia / son_cientificos);
        produccion.add(javalares);
        produccion.add(trigo);
        produccion.add(tecnologia);
        produccion.add(hierro);
        return produccion;
    }

    /*****
    * Nombre: mejorar
    ******
    * Descripción: aplicacion del metodo abstracto, mejora las estadisticas la herreria.
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
    * int, 1 debido a que el edificio es herreria.
    *****/
    @Override
    public int es_herreria() {
        return 1;
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
