/* 9) Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

import java.util.Scanner;

public class TP02Ex9 {
    static Scanner scanner = new Scanner(System.in);
    static double[][] array;

    public static void main(String[] args) {
        System.out.print("Digite o numero de linhas de matriz (M): ");
        int m = scanner.nextInt();

        System.out.print("Digite o numero de colunas de matriz (N): ");
        int n = scanner.nextInt();

        if (m > 10 || n > 10) {
            System.out.println("A matriz não pode ter mais de 10 linhas ou 10 colunas.");
        }

        array = new double[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print("Digite um valor para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Matriz transposta: ");
        imprimirMatriz(matrizTransposta(array));
    }

    public static double[][] matrizTransposta(double[][] array) {
        int m = array.length;
        int n = array[0].length;
        double[][] transposta = new double[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposta[j][i] = array[i][j];
            }
        }

        return transposta;
    }

    public static void imprimirMatriz(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("[" + array[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }
}
