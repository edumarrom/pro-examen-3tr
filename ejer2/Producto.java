package ejer2;

/**
 * La clase Producto representa a un producto, el cual se compone de su código,
 * denominación, precio y categoría.
 */
public class Producto {
    private int codigo;
    private String denominacion;
    private double precio;
    private Categoria categoria;

    /**
     * Constructor de la clase Producto.
     * @param codigo El código del producto.
     * @param denominacion La denominación del producto.
     * @param precio El precio unitario del producto.
     * @param categoria La categoría a la que pertenece el producto.
     */
    public Producto(int codigo, String denominacion
    , double precio, Categoria categoria) {
      setCodigo(codigo);
      setDenominacion(denominacion);
      setPrecio(precio);
      setCategoria(categoria);
    }

    /**
     * Devuelve el código del producto.
     * @return El código del producto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Modifica el código del producto.
     * @param codigo El nuevo código del producto.
     */
    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve la denominación del producto.
     * @return La denominación del producto.
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * Modifica la denominación del producto.
     * @param denominacion La nueva denominación.
     */
    private void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * Devuelve el preciodel producto.
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio del producto.
     * @param precio El nuevo precio.
     */
    private void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la categoría del producto.
     * @return La categoría del producto.
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Modifica la categoría del producto. Al modificar la categoría,
     * se añade el producto a la lista de productos de la categoría.
     * @param categoria La nueva categoría.
     */
    private void setCategoria(Categoria categoria) {
        Categoria antiguaCategoria = getCategoria();
        if (antiguaCategoria != null) {
            antiguaCategoria.getProductos().remove(this);
        }
        this.categoria = categoria;
        categoria.getProductos().add(this);
    }
}
