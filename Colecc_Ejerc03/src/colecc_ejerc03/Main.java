/*
En el main deberemos tener un bucle que crea un objeto Alumno. 
Se pide toda la información al usuario y ese Alumno se guarda en 
una lista de tipo Alumno y se le pregunta al usuario si quiere 
crear otro Alumno o no.
 */
package colecc_ejerc03;

import entidades.Alumno;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnes = new ArrayList();

        String salir = "";
        while (!salir.equalsIgnoreCase("NO")) {
            Alumno A1 = new Alumno();
            System.out.println("ingrese su nombre");
            A1.setNombre(leer.next());

            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese 3 notas");
                notas.add(leer.nextInt());
            }

            A1.setNotas(notas);

            System.out.println("desea crear otro alumno?(SI/NO)");
            salir = leer.next();
            alumnes.add(A1);
        }

        double sumNot = 0;

        do {
            System.out.println("Ingrese el nombre del alumno que desea buscar: ");
            String alum = leer.next();
            for (Alumno aux : alumnes) {
                
                if (aux.getNombre().equals(alum)) {

                    for (int i = 0; i < 3; i++) {
                        sumNot = aux.getNotas().get(i);
                    }
                    System.out.println("El promedio del alumno " + aux.getNombre() + " es: " + (sumNot / 3));
                }

            }
            System.out.println("desea ver otro promedio? SI/NO");
            
        } while (leer.next().equalsIgnoreCase("SI"));
    }

}
