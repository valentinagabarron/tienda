package Tienda;

/*Queremos llevar un seguimiento de stock de unos productos.

Realizamos las siguientes acciones:
- Añadir un producto(Producto producto)
- Aumentar stock de un producto(string nombre)
- Eliminar stock de un producto(string nombre)
- Mostrar producto y su stock()
- Eliminar producto.
- Ordenar el producto por aquellos que tienen mayor cantidad
*/

public class Tienda {

    public static void main(String[] args) {
        OperacionesStock op = new OperacionesStock();
        Producto product = new Producto();

        // nombre
        product.setNombre("cereales");
        // stock
        product.setCantidad(1);
        //agrego el producto
        op.agregarProducto(product);
    }
}
