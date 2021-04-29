/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p6rrja;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author manny
 */
public class G4S21P6RRJA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A","B","C"));
        
        System.out.println("\nImprimiendo mediante forEach");
        lista.forEach((contenido) -> {
            System.out.println("El contenido es: " + contenido);
        });
        
        lista.add("D");
        lista.add("Jonathan");
        lista.add("Esta es una linea de texto de prueba");
        
        System.out.println("\nImprimiendo mediante for");
        for(String contenido1 : lista){
            System.out.println("El contenido es: " + contenido1);
        }
        
        lista.add("E");
        lista.add("F");
        lista.add("G");
        
        System.out.println("\nImprimiendo mediante forEach y .stream");
        lista.stream().forEach((contenido2) -> {
            System.out.println("El contenido es: " + contenido2);
        });
        
        String cadena1 = "variable 1";
        String cadena2 = "variable 2";
        String cadena3 = "variable 3";
        lista.add(cadena1);
        lista.add(cadena2);
        lista.add(cadena3);
        
        System.out.println("\nImprimiendo variables agregadas a la lista");
        lista.forEach((contenido3) -> {
            System.out.println("El contenido es: " + contenido3);
        });
        
        System.out.println("\nImprimiendo un tipo de dato no valido");
        lista.add(String.valueOf(3312));
        lista.forEach((contenido4) -> {
            System.out.println("El contenido es: " + contenido4);
        });
        
        System.out.println("\nBuscando un valor");
        lista.forEach((contenido5) -> {
            if(contenido5.equals("F")){
                System.out.println("El valor fue encontrado");
                //para detener el flujo en un for    break;
            } else{
                System.out.println("El valor no fue encontrado");
            }
        });
    }
    
}
