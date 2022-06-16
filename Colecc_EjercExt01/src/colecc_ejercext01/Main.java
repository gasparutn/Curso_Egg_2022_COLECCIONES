/*
Diseñar un programa que lea una serie de valores numéricos 
enteros desde el teclado y los guarde en un ArrayList de tipo 
Integer. La lectura de números termina cuando se introduzca el 
valor -99. Este valor no se guarda en el ArrayList. A continuación, 
el programa mostrará por pantalla el número de valores que se han 
leído, su suma y su media (promedio).
 */
package colecc_ejercext01;

import entidades.Numeros;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Numeros N = new Numeros();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> almacen = new ArrayList();
        int sum = 0;
        int x = 0;
        while (x != (-99)) {
            System.out.println("Ingrese un numero: ");
            x = leer.nextInt();
            if (x != (-99)) {
                almacen.add(x);
                sum++;
            }
        }
        int sumar = 0;

        for (Integer ver : almacen) {
            sumar = sumar + ver;
        }
        int prom = 0;
        prom = sumar / sum;
        System.out.println("-------------------------------------------");
        System.out.println("La cantidad de numeros ingresados es: " + sum);
        System.out.println("La suma de los numero es: " + sumar);
        System.out.println("El promedios es: " + prom);
        System.out.println("-------------------------------------------");

    }

}
