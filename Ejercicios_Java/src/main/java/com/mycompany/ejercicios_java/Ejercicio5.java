
package com.mycompany.ejercicios_java;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese Radio");
        float radio = sp.nextFloat();
        System.out.println("El area es: "+(Math.PI*Math.pow(radio, 2)));
        System.out.println("Longitud de circunferencia es: "+(2*Math.PI*radio));
        
        
    }
}
