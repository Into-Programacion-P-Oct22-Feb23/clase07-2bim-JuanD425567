package manejoexepciones;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo01 {

    public static void main(String[] args) {

        try {
            int valor1 = 10;
            int valor2 = 0;
            int resultado = valor1 / valor2;

            System.out.printf("Resultado %d", resultado);

            System.out.println("continuamos");
        } 
        catch(ArithmeticException arithmeticException){
            System.out.println("Lo sentimos hay un error");
            System.out.printf("De tipo %s\n", arithmeticException);
        }

    }
}
