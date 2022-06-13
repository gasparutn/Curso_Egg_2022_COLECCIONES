/*
Se requiere un programa que lea y guarde países, y para evitar que 
se ingresen repetidos usaremos un conjunto. El programa pedirá un 
país en un bucle, se guardará el país en el conjunto y después se 
le preguntará al usuario si quiere guardar otro país o si quiere 
salir, si decide salir, se mostrará todos los países guardados
en el conjunto.
 */
package colecc_ejerc05;

import Servicios.Servis;
import entidades.Paises;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        /*
        METODO CON SERVICIOS
        */
                
        Servis Resul = new Servis();
        Resul.ingresarNombres();
        Resul.ordenaAZ();
        Resul.eliminarPais();
         
        /*  METODO MAIN 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Set<String> nombres = new HashSet();
        Paises Ps = new Paises();
        String opc = "SI";
        while (opc.equalsIgnoreCase("SI")) {
            System.out.println("ingrese un pais: ");
            Ps.setPais(leer.next());
       
            System.out.println("desea ingresar otro pais? SI/NO");
            opc = leer.next();
            nombres.add(Ps.getPais());
        }
        System.out.println("Los paises son: ");
        for (String id : nombres) {

            System.out.println(id);
        }
        System.out.println("______________________________________");
        System.out.println("Ordenados alfabeticamente: ");
        TreeSet conjOrden = new TreeSet();
        conjOrden.addAll(nombres);
        System.out.println(conjOrden);
        System.out.println("______________________________________");
        String borrar = "";
        boolean ok = false;
        Iterator<String> eliminaPais = nombres.iterator();
        System.out.print("Ingrese el nombre del pais que desea eliminar: ");
        borrar = leer.next();
        while (eliminaPais.hasNext() && !ok) {
            if (eliminaPais.next().toUpperCase().equals(borrar.toUpperCase())) {
                eliminaPais.remove();
                System.out.println("La lista nueva es: " + nombres + "\n");

                ok = true;
            }
        }
        if (ok == false) {
            System.out.println("Ese pais no se encuentra en la lista");
        }
    }
         */
    }
}
