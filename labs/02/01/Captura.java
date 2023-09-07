package com.mycompany.opmatriz;
import java.util.Scanner;
class Captura {
    private static final Scanner leer = new Scanner(System.in);

  public static double nextDouble(String message) {
    System.out.print(message);
    return leer.nextDouble();
  }

  public static double [][] readMat(int filas, int cols) {
    double [][] matR = new double[filas][cols];

    for(int i=0;i<filas;i++){
        for(int j=0;j<cols; j++){
            System.out.println("Ingrese el numero en la fila" + (i+1) + "Ingrese el numero en la columna" + (j+1) + ": ");
            matR[i][j]=leer.nextDouble();
        }
    }
    return matR;
  }
   public static double Capescalar(){
      System.out.println("Ingrese un escalar: ");
      leer.nextDouble();
   
      return leer.nextDouble();
  }
      public static double Capopcion(){
      System.out.println("Ingrese un escalar: ");
      leer.nextDouble();
      return leer.nextDouble();
  }
  
  
 
}


