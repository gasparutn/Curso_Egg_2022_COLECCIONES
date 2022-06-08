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
        // .size() muestra el tamano del Arraylist en Numero.  
        System.out.println("El tamano Arraylist es: " + razas.size());

    }

    /*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
     */
    public void mostraryeliminar() {
        //variable para almacenar objeto que se va eliminar
        String borrar = "";
        // boolean p/ determinar si no existe la raza ingresada por el user
        boolean ok = false;
        // Iterador que recorre la el arrayslist "razas" y guardar en var.. lista
        Iterator<String> lista = razas.iterator();

        System.out.println("ingrese la raza que desea eliminar de la lista: ");
        borrar = leer.nextLine();
        /*
        Object next(): Devuelve el siguiente elemento en la coleccion, mientras 
         el metodo hasNext() retorne true. 
        Este metodo es el que nos sirve para mostrar el elemento,
         */
        while (lista.hasNext() && !ok) {
            //Opcional"" toUpper... para devolver el valor en MAYUSCULA   
            if (lista.next().toUpperCase().equals(borrar.toUpperCase())) {
                // remove : Elimina el elemento actual de la colección.
                lista.remove();
                System.out.println("La lista actual es: ");
                // se muestra los objetos actuales q hay despues de borrar
                mostrarRazas();

                ok = true;
            }
        }
        if (ok == false) {
            System.out.println("no se encontro la raza");
        }
    }

}
