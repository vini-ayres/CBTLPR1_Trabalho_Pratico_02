/* 11) Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

import java.util.Scanner;

public class TP02Ex11 {
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
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double determinante = calcularDeterminante(matriz);
        System.out.println("Determinante da matriz: " + determinante);
    }

    public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;

        if (matriz[0].length != ordem) {
            System.out.println("A matriz não é quadrada.");
        }

        if (ordem == 1) {
            return matriz[0][0];
        }

        if (ordem == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        double determinante = 0;

        for (int j = 0; j < ordem; j++) {
            determinante += matriz[0][j] * cofator(matriz, 0, j);
        }

        return determinante;
    }

    public static double cofator(double[][] matriz, int linha, int coluna) {
        return Math.pow(-1, linha + coluna) * calcularDeterminante(submatriz(matriz, linha, coluna));
    }

    public static double[][] submatriz(double[][] matriz, int excluiLinha, int excluiColuna) {
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
}