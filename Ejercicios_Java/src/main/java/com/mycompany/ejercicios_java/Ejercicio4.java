
package com.mycompany.ejercicios_java;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese temperatura: ");
        float temperatura = 32+(9*(sp.nextInt()/5));
        System.out.println("Resultado es: "+temperatura+" C°");
    }
    
}
