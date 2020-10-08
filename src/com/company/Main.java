/*
Author: Marc Nadal Parra
Date: 10/07/2020
*/
package com.company;
// Crear un arreglo que imprima n numeros y muestre si son primos (1)
// Crear un arregloque imprima una n cantidad de numeros secuenciales (2)

import java.util.Scanner;

public class Main
{
    //Se Declara la entrada de Texto mediante Scanner.
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Se declara, inicializa y se pide definir un valor para los n numreos.
        int n = 0;
        System.out.println("Ingrese un numero por favor ");
        n = teclado.nextInt();

        //Mando llamar mis Métodos de la Clase clase.
        clase obj = new clase();

        obj.Pariente(n);
        obj. Fibonacci(n);
    }
}