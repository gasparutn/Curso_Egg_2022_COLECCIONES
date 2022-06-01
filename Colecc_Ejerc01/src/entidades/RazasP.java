/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazasP {

    private final Scanner leer;
    private final ArrayList<String> razas;

    public RazasP() {
        this.razas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearRazas() {
        String salir = "";
        while (!salir.equalsIgnoreCase("NO")) {
            System.out.println("ingrese una raza de perro");
            String tipo = leer.nextLine();

            System.out.println("desea agregar otra raza?(SI/NO)");
            salir = leer.nextLine();

            razas.add(tipo);
        }
        System.out.println("");
    }

    public void mostrarRazas() {

        for (String Ra : razas) {

            System.out.println(Ra);
        }
        System.out.println("El tamano Arraylist es: "+razas.size());

    }

    /*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
     */
    public void mostraryeliminar() {
        String borrar = "";
        boolean ok=false;
        Iterator <String> lista = razas.iterator();
        System.out.println("ingrese la raza que desea eliminar de la lista: ");
        borrar = leer.nextLine();
        while (lista.hasNext()&&!ok) {
            
            if (lista.next().toUpperCase().equals(borrar.toUpperCase()) ) {
                lista.remove();
                System.out.println("La lista actual es: ");
                mostrarRazas();
                
                ok=true;
            }
           
        }
           if(ok==false){
               System.out.println("no se encontro la raza");
           }
    }

}
