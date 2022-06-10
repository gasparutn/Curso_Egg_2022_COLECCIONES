/*
Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import entidades.Pelicula;
import java.util.ArrayList;

public class Servis {

    Pelicula LP = new Pelicula();

    public void motrarpelis(ArrayList<Pelicula> lista) {

        for (Pelicula L : lista) {
            System.out.println(L);
        }
        System.out.println("-------------------------------------------");
    }

    public void durapelis(ArrayList<Pelicula> lista) {

        for (Pelicula dura : lista) {
            if (dura.getDuracion() > 61) {
                System.out.println("Peliculas de mayor duracion:");
                System.out.println("Titulo: " + dura.getTitulo() + "" + "\nDirector: " + dura.getDirector() + "" + "\nDuracion: " + dura.getDuracion() + " minutos");
            }
        }
        System.out.println("-------------------------------------------");
    }

}
