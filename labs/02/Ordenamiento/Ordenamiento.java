package com.mycompany.ordenamiento;
import java.util.Random;

public class Ordenamiento {
    public static void main(String[] args) {
         int[] size = {100, 500, 1000, 5000, 10000};
         
    }
  
    public static void ordenamientoBurbuja(double[] arreglo) {
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = 0; j < arreglo.length-1-i; j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                    }
                }
            }
        }
    
}
