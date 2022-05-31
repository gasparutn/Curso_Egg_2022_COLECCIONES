/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class RazasP {
    private final Scanner leer; 
    private final ArrayList<String> razas;

    public RazasP() {
        this.razas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

  
    public void crearRazas() {
        String salir="";
        while(!salir.equalsIgnoreCase("NO")){
        System.out.println("ingrese una raza de perro");
        String tipo= leer.next();
        
        
        
        System.out.println("desea agregar otra raza?");
        salir=leer.next();
        
        
        razas.add(tipo);
    }
        

        }
    
    public void mostrarRazas(){
        
        for (String Ra : razas) {
            
            
            System.out.println(Ra);
        } 

           System.out.println(razas.size());
        
        
}
    
}