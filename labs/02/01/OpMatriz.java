package com.mycompany.opmatriz;


public class OpMatriz {
public static double[][] suma(double[][] matA, double[][] matB) {
    // Verificar si las matrices tienen las mismas dimensiones
    int filasA = matA.length;
    int columnasA = matA[0].length;
    int filasB = matB.length;
    int columnasB = matB[0].length;

    if (filasA != filasB || columnasA != columnasB) {
        throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones.");
    }

    // Crear la matriz resultante con las mismas dimensiones
    double[][] matR = new double[filasA][columnasA];

    // Realizar la suma de las matrices
    for (int i = 0; i < filasA; i++) {
        for (int j = 0; j < columnasA; j++) {
            matR[i][j] = matA[i][j] + matB[i][j];
        }
    }

    return matR;
}


public static double[][] producto(double[][] matA, double[][] matB) {
    int filasA = matA.length;
    int columnasA = matA[0].length;
    int filasB = matB.length;
    int columnasB = matB[0].length;

    if (columnasA != filasB) {
        throw new IllegalArgumentException("El número de columnas de la matriz A debe ser igual al número de filas de la matriz B.");
    }

    double[][] matR = new double[filasA][columnasB];

    for (int i = 0; i < filasA; i++) {
        for (int j = 0; j < columnasB; j++) {
            double sum = 0;
            for (int k = 0; k < columnasA; k++) {
                sum += matA[i][k] * matB[k][j];
            }
            matR[i][j] = sum;
        }
    }

    return matR;
}

  
 public static double[][] escalar(double escalar, double[][] matB) {
    int filasB = matB.length;
    int columnasB = matB[0].length;

    double[][] matR = new double[filasB][columnasB];

    for (int i = 0; i < filasB; i++) {
        for (int j = 0; j < columnasB; j++) {
            matR[i][j] = escalar * matB[i][j];
        }
    }

    return matR;
}
public static double[][] tras(double[][] matA) {
    int filasA = matA.length;
    int columnasA = matA[0].length;

    double[][] matR = new double[columnasA][filasA];

    for (int i = 0; i < filasA; i++) {
        for (int j = 0; j < columnasA; j++) {
            matR[j][i] = matA[i][j];
        }
    }

    return matR;
}
 
    
    
}
