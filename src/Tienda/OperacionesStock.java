package Tienda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Queremos llevar un seguimiento de stock de unos productos.

Realizamos las siguientes acciones:
- Añadir un producto(Producto producto)
- Aumentar stock de un producto(string nombre)
- Eliminar stock de un producto(string nombre)
- Mostrar producto y su stock()
- Eliminar producto.
- Ordenar el producto por aquellos que tienen mayor cantidad
*/

public class OperacionesStock {
    List<Producto> productos = new ArrayList<Producto>();

    public void agregarProducto(Producto product) {
        productos.add(product);
    }

    public void aumentarStock(String nombreProduct) {
        for (Producto producto: productos) {
            if(producto.getNombre().equals(nombreProduct)) {
                producto.setCantidad(producto.getCantidad() + 1);
            }
        }
    }




    public void eliminarStock(String nombreProduct) {
        for (Producto producto: productos) {
            if(producto.getNombre().equals(nombreProduct)) {
                producto.setCantidad(0);
            }
        }
    }

    public String mostrarProducto(Producto product) {
        String productoStock = "Producto: " + product.getNombre() + " tiene " + product.getCantidad() + " de stock.";
        System.out.println(productoStock);
        return productoStock;
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }
    public List<Producto> ordenarProducto() {
        List<Producto> listaNueva = null;
        Producto productoCant = new Producto();
        productoCant.setCantidad(0);
        for (int i = 0; i < productos.size(); i++) {
            for (int j = 0; j < productos.size(); j++) {
                if(productos.get(j).getCantidad() > productoCant.getCantidad() ) {
                    productoCant = productos.get(j);
                    productos.remove(productoCant);
                }
            }
            listaNueva.add(productoCant);
        }
        productos = listaNueva;
        return listaNueva;
    }
}
