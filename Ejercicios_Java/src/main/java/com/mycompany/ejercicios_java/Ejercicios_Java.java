
package com.mycompany.ejercicios_java;
//Se importo la libreria para Scanner
import java.util.Scanner;

/**
 *
 * @author Francisco Gonzalez
 */
public class Ejercicios_Java {

    public static void main(String[] args) {
        //Creacion Scanner con nombre sp
        Scanner sp = new Scanner(System.in);
        //Definicion de variables para almacenar numeros
        int num1,num2;
        //Solicita primer numero ingresado por teclado     
        System.out.println("Ingrese un numero");
        //Se almacena en variable num1 
        num1 = sp.nextInt();
        //Solicita otro numero ingresado por teclado
        System.out.println("Ingrese otro numero");
        //Se almacena en variable num2
        num2 = sp.nextInt();
        //Muestra resultado de ingreso concatenado
        System.out.println("LOS NUMEROS SON: "+num1+" Y "+num2);
        
        
    }
}
