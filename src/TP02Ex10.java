/* 10) Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas). */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

import java.util.Scanner;

public class TP02Ex10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a ordem da matriz (MxM, máximo 10): ");
        int ordem = scanner.nextInt();

        if (ordem <= 0 || ordem > 10) {
            System.out.println("Ordem inválida. A ordem deve ser um número entre 1 e 10.");
        }

        double[][] matriz = new double[ordem][ordem];
        System.out.println("Digite os elementos da matriz: ");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double[][] matrizInversa = calcularMatrizInversa(matriz);
        if (matrizInversa == null) {
            System.out.println("A matriz não tem inversa.");
        } else {
            System.out.println("Matriz Inversa:");
            imprimirMatriz(matrizInversa);
        }

        scanner.close();
    }

    private static double[][] calcularMatrizInversa(double[][] matriz) {
        int ordem = matriz.length;

        if (matriz[0].length != ordem) {
            return null;
        }

        double[][] adjunta = new double[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                adjunta[i][j] = cofator(matriz, i, j) * Math.pow(-1, i + j);
            }
        }

        double determinante = determinante(matriz);

        if (determinante == 0) {
            return null;
        }

        double[][] inversa = new double[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                inversa[i][j] = adjunta[i][j] / determinante;
            }
        }

        return inversa;
    }

    private static double determinante(double[][] matriz) {
        int ordem = matriz.length;

        if (ordem == 1) {
            return matriz[0][0];
        }

        double det = 0;
        for (int j = 0; j < ordem; j++) {
            det += matriz[0][j] * cofator(matriz, 0, j);
        }

        return det;
    }

    private static double cofator(double[][] matriz, int linha, int coluna) {
        return determinante(submatriz(matriz, linha, coluna));
    }

    private static double[][] submatriz(double[][] matriz, int excluiLinha, int excluiColuna) {
        int ordem = matriz.length;
        double[][] submatriz = new double[ordem - 1][ordem - 1];

        for (int i = 0, m = 0; i < ordem; i++) {
            if (i == excluiLinha) {
                continue;
            }
            for (int j = 0, n = 0; j < ordem; j++) {
                if (j == excluiColuna) {
                    continue;
                }
                submatriz[m][n] = matriz[i][j];
                n++;
            }
            m++;
        }

        return submatriz;
    }

    private static void imprimirMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double elemento : linha) {
                System.out.print("[" + elemento + "]\t");
            }
            System.out.println();
        }
    }
}
