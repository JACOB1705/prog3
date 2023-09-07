package com.mycompany.opmatriz;
import com.mycompany.opmatriz.Captura;
import com.mycompany.opmatriz.OpMatriz;

class Implementacion {
     public static void main(String args[]) {
         System.out.println("Menú de Operaciones de Matrices");
         System.out.println("1. Sumar dos matrices");
         System.out.println("2. Multiplicar dos matrices");
         System.out.println("3. Multiplicar una matriz por un escalar");
         System.out.println("4. Calcular la transposición de una matriz");
         System.out.println("5. Salir");
         System.out.print("Seleccione una opción: ");
         double opcion = Captura.Capopcion();
  }
     public static void realizarSuma(int filas, int columnas) {

        double[][] matrizA = Captura.readMat(filas, columnas);
        double[][] matrizB = Captura.readMat(filas, columnas);

        double[][] resultado = OpMatriz.suma(matrizA, matrizB);
        System.out.println("Resultado de la suma de las matrices:");
        imprimirMatriz(resultado);
    }

    public static void realizarProducto(int filasA, int columnasA, int filasB, int columnasB) {
        
        if (columnasA != filasB) {
            System.out.println("No se puede multiplicar. El número de columnas de A debe ser igual al número de filas de B.");
            return;
        }

        double[][] matrizA = Captura.readMat(filasA, columnasA);
        double[][] matrizB = Captura.readMat(filasB, columnasB);

        double[][] resultado = OpMatriz.producto(matrizA, matrizB);
        System.out.println("Resultado de la multiplicación de las matrices:");
        imprimirMatriz(resultado);
    }

    public static void realizarEscalar( int filas, int columnas) {
        double escalar = Captura.nextDouble("Ingrese el escalar: ");
        double[][] matriz = Captura.readMat(filas, columnas);
        double[][] resultado = OpMatriz.escalar(escalar, matriz);
        System.out.println("Resultado de la multiplicación de la matriz por el escalar:");
        imprimirMatriz(resultado);
    }

    public static void realizarTransposicion(int filas, int columnas) {
        
        System.out.println("Ingrese las dimensiones de la matriz a transponer.");
        double[][] matriz = Captura.readMat(filas, columnas);
        double[][] resultado = OpMatriz.tras(matriz);
        System.out.println("Resultado de la transposición de la matriz:");
        imprimirMatriz(resultado);
    }

    public static void imprimirMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

}
}