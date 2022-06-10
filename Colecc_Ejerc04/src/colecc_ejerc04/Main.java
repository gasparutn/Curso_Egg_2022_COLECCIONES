/*
 * En el main deberemos tener un bucle que crea un objeto Pelicula 
   pidiéndole al usuario todos sus datos y guardándolos en el 
   objeto Pelicula. Después, esa Pelicula se guarda una lista de 
   Peliculas y se le pregunta al usuario si quiere crear otra Pelicula 
   o no.
 */
package colecc_ejerc04;

import Servicios.Servis;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;
import utilidades.Comparadores;

public class Main {

    public static void main(String[] args) {
        Servis Ser = new Servis();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> lista = new ArrayList();
        String opc = "SI";
        while (opc.equalsIgnoreCase("SI")) {
            Pelicula pelis = new Pelicula();
            System.out.println("Ingrese una Pelicula: ");
            pelis.setTitulo(leer.next());
            System.out.println("Ingrete un Director: ");
            pelis.setDirector(leer.next());
            System.out.println("Ingrese la duracion en minutos: ");
            pelis.setDuracion(leer.nextFloat());
            lista.add(pelis);
            System.out.println("Desea ingresar otra Pelicula? SI/NO");
            opc = leer.next();
         
            
        }
        System.out.println("\n-------------------------------------------");
        System.out.println("Pelicuas en cartelera:");
        Ser.motrarpelis(lista);
        Ser.durapelis(lista);
        Collections.sort(lista, Comparadores.ordenarDuracionDesc);
        System.out.println("Duracion de la Pelicula descendente: ");
        Ser.motrarpelis(lista);
        System.out.println("-------------------------------------------");
        Collections.sort(lista, Comparadores.ordenarDuracionAsc);
        System.out.println("Duracion de la Pelicula ascendente: ");
        Ser.motrarpelis(lista);
        System.out.println("-------------------------------------------");
        Collections.sort(lista, Comparadores.ordenartitulocAlfa);
        System.out.println("Orden del Titulo alfabeticamente: ");
        Ser.motrarpelis(lista);
        System.out.println("-------------------------------------------");
        Collections.sort(lista, Comparadores.ordenarDirectAlfa);
        System.out.println("Orden del director alfabeticamente: ");
        Ser.motrarpelis(lista);
        System.out.println("-------------------------------------------");
    }
}
