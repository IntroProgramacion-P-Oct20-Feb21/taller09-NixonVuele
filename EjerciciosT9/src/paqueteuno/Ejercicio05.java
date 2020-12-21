/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Se declara las variables
        String[] estudiantes = {"Kimberly", "Hogan",
                "Teresa", "Luis", "Mark", "Jennifer",
                "Alcides"};
        String inicial;
        boolean bandera = true;
        String primeraLetra;
        //Se inicia un ciclo repetitivo que hara que el usuario salga cuando escriba la primera letra de un nombre
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            //se transforma la letra ingresada en mayuscula por que los nombres inician con mayuscula
            inicial = inicial.toUpperCase();
            //Inicia otro ciclo que verificara si la primera letra de todos los nombres es igual a la letra ingresada
            // Si son las mismas letras saldra del ciclo, caso contrario volvera a ingresar al mismo
            for (int i = 0; i < estudiantes.length; i++) {
                primeraLetra=estudiantes[i].substring(0, 1);
                if (inicial.equals(primeraLetra)) {
                    bandera = false;
                }
            }
        }
    }
}