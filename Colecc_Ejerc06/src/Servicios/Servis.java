package Servicios;

import entidades.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> articulos = new HashMap();
    Productos Art = new Productos();

    public void ingresararticulos() {
        String salir = "SI";
        while (salir.equalsIgnoreCase("SI")) {
            System.out.println("Ingrese la cantidad de articulos que desee:");
            Art.setNombre(leer.next());
            System.out.println("Ingrese el precio($$$) del producto: ");
            Art.setPrecio(leer.nextInt());
            articulos.put(Art.getNombre(), Art.getPrecio());
            System.out.println("desea agregar otro producto. SI/NO?");
            salir = leer.next();
        }
    }

    public void mostrarProductos() {

        for (Map.Entry<String, Integer> aux : articulos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println("Producto: " + key + "\nPrecio: $" + value);
        }
    }

    public void eliminarproducto() {
        System.out.println("Ingrese el producto que desea eliminar: ");
        String borrar = leer.next();
        for (Map.Entry<String, Integer> eliminar : articulos.entrySet()) {
            String key = eliminar.getKey();
            Integer value = eliminar.getValue();
            if (borrar.equals(key)) {
                articulos.remove(borrar);
            }
        }
    }

    public void modificarProductPrecio() {
        System.out.println("Ingrese el producto el cual desea modificar el precio: ");
        String product = leer.next();
        int a = 0;
        for (Map.Entry<String, Integer> entry : articulos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (product.equals(key)) {
                a = 0;
            }
            if (!product.equals(key)) {
                a = 1;
            }
            if (a == 1) {
                System.out.println("El producto ingresado no existe:");
            }
            if (a == 0) {
                System.out.println("Ingrese el nuevo precio : ");
                articulos.replace(product, leer.nextInt());

            }
        }
    }
}
