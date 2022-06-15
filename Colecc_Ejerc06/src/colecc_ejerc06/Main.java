/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package colecc_ejerc06;

import Servicios.Servis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servis P = new Servis();
        int opciones = 0;
        P.ingresararticulos();
        System.out.println("-------------------------------------");
        do {
            System.out.println("");
            System.out.println("OPCION 1:MOSTRAR PRODUCTO Y PRECIO: ");
            System.out.println("OPCION 2:INGRESAR MAS ARTICULOS: ");
            System.out.println("OPCION 3:ELIMINAR PRODUCTOS: ");
            System.out.println("OPCION 4:MODIFICAR PRECIOS: ");
            System.out.println("OPCION 5:SALIR:");
            System.out.println("------------------------------------");
            System.out.print("->");
            opciones = leer.nextInt();

            switch (opciones) {
                case 1:
                    P.mostrarProductos();
                    break;
                case 2:
                    P.ingresararticulos();
                    break;

                case 3:
                    P.eliminarproducto();
                    break;
                case 4:
                    P.modificarProductPrecio();
                    break;
                case 5:
                    break;
            }

        } while (opciones != 5);

    }
}
