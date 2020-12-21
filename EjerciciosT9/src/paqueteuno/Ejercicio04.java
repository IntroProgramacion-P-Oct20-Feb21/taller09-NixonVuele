/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se declaran las variables
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        String cadenaFinal="";
        //Se llena el arreglo promedios cualitativos dependiendo a las notas comparadas con las condicionales escritas
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i]>=0 && promedios[i] <=5.9 )
            promediosCualitativos[i]="Regular";
            if (promedios[i]>=6 && promedios[i] <=8.9 )
                promediosCualitativos[i]="Bueno";
            if (promedios[i]>=9 && promedios[i] <=10)
                promediosCualitativos[i]="Sobresaliente";
            //Se encierra todos la informacion en una cadena acumuladora llamada cadenaFinal
            cadenaFinal=String.format("%s %s %s %.2f %s %s\n",cadenaFinal,estudiantes[i] , "promedio:" , promedios[i],
                    "promedio cualitativo:" ,promediosCualitativos[i]);
        }
        //Se presenta en la pantalla todos los datos acumulados
        System.out.print(cadenaFinal);
    }
}
