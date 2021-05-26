package ejer2;

import java.util.ArrayList;

/**
 * La clase Categoria representa las distintas categorías a las
 * que pueden pertener los productos de una tienda. Es responsabilidad
 * de la categoría tener constancia de qué productos pertenecen a
 * dicha categoría. Esta necesidad se satisface almacenando las referencias
 * a dichos productos en una lista.
 */
public class Categoria {
    private String denominacion;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    /**
     * Constructor de la clase Categoría.
     * @param denominacion La denominación de dicha categoría.
     */
    public Categoria(String denominacion) {
        setDenominacion(denominacion);
    }

    /**
     * Devuelve la denominación de la categoría.
     * @return La denominación de la categoría.
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * Modifica la denominación de una categoría.
     * @param denominacion La nueva denominación.
     */
    private void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * Devuelve la lista de productos pertenecientes a esta categoría.
     * @return
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
