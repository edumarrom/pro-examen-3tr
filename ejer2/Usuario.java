package ejer2;

/**
 * La clase Usuario representa a un usuario.
 * Todo usuario posee su propio carrito de la
 * compra nada más es instanciado.
 */
public class Usuario {
    private String nombre = "";
    private Carrito carrito;

    /**
     * Constructor por defecto de la clase Usuario.
     */
    public Usuario() {
        carrito = new Carrito();
    }

    /**
     * Constructor de la clase Usuario.
     * @param nombre El nombre del usuario.
     */
    public Usuario(String nombre) {
        setNombre(nombre);
    }

    /**
     * Devuelve el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el código del producto.
     * @param codigo El nuevo código del producto.
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el carrito del usuario.
     * @return El carrito del usuario.
     */
    public Carrito getCarrito() {
        return carrito;
    }
}
