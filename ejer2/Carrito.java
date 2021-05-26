package ejer2;

import java.util.HashMap;

/**
 * La clase Carrito representa un carro de la compra, con funcionalidades comúnes
 * a las cestas de la compra que se implementan en tiendas webs.
 * Esta compuesto por un diccionario (o mapa) que registra los productos que un
 * cliente añade y la cantidad de los mismos.
 *
 * Un carrito es componente de una instancia de la clase Usuario, es decir, se trata
 * de una relación de composición.
 */
public class Carrito {
    private HashMap<Producto, Integer> carrito = new HashMap<Producto, Integer>();

    /**
     * Constructor de la clase Carrito
     */
    public Carrito(){

    }

    /**
     * Devuelve las entradas del carrito
     * @return El HashMap que implementa al carrito.
     */
    public HashMap<Producto, Integer> getEntradas() {
        return carrito;
    }

    /**
     * Añade al carrito un producto recibido como parámetro.
     * Si dicho productoya se encontraba en el carrito, incrementará
     * en 1 su cantidad.
     * @param producto El producto a añadir en el carrito.
     */
    public void anyadirProducto(Producto producto) {
        // Ya existe el producto en el carrito?
        if(carrito.containsKey(producto)) {
            int cAnterior = carrito.get(producto);
            carrito.remove(producto);
            carrito.put(producto, (cAnterior + 1));
        } else {
            carrito.put(producto, 1);
        }
    }

    /**
     * Reduce la cantidad de un producto recibido como parámetro.
     * Si la cantidad de dicho producto es 1, simplemente se eliminará
     * del carrito.
     * @param producto El producto a añadir en el carrito.
     */
    public void reducirProducto(Producto producto) {
        // Ya existe el producto en el carrito?
        if(carrito.containsKey(producto)) {
            int cAnterior = carrito.get(producto);
            if (cAnterior == 1) {
                carrito.remove(producto);
            } else {
                carrito.put(producto, (cAnterior - 1));
            }
        }
    }
}
