
package com.mycompany.ejercicios_java;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);        
        System.out.println("Ingrese un numero");
        int numero = sp.nextInt();
        System.out.println("El doble es: "+(numero*2)+" y su triple es: " +(numero*3));
        
    }
    
}
