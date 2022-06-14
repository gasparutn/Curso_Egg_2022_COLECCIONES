package Servicios;

import entidades.Paises;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Servis {

    Paises P = new Paises();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Set<String> nombres = new HashSet();

    public void ingresarNombres() {

        Paises Ps = new Paises();
        String opc = "SI";
        while (opc.equalsIgnoreCase("SI")) {
            System.out.println("Ingrese un Pais: ");
            Ps.setPais(leer.next());
            System.out.println("Desea ingresar otro Pais? SI/NO");
            opc = leer.next();
            nombres.add(Ps.getPais());
        }
        System.out.println("Los paises son: ");
        for (String id : nombres) {
            System.out.println(id);
        }
    }

    public void ordenaAZ() {

        System.out.println("\nOrdenados alfabeticamente: ");
        TreeSet conjOrden = new TreeSet();
        conjOrden.addAll(nombres);
        System.out.println(conjOrden);

    }

    public void eliminarPais() {
        String borrar = "";
        boolean ok = false;
        Iterator<String> eliminaPais = nombres.iterator();
        System.out.print("Ingrese el nombre del pais que desea eliminar: ");
        borrar = leer.next();
        while (eliminaPais.hasNext() && !ok) {
            if (eliminaPais.next().toUpperCase().equals(borrar.toUpperCase())) {
                eliminaPais.remove();
                System.out.println("\nLa lista nueva es: " + nombres);

                ok = true;
            }
        }
        if (ok == false) {
            System.out.println("Ese pais no se encuentra en la lista");
        }
    }

}
