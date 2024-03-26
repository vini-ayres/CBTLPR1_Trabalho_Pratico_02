/* 8) Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

import java.util.Scanner;

public class TP02Ex8 {
    static Scanner scanner = new Scanner(System.in);
    static double[][] array = new double[3][4];

    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 4; ++j) {
                System.out.print("Digite um valor para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Digite o valor da constante: ");
        double constante = scanner.nextDouble();

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 4; ++j) {
                array[i][j] *= constante;
                System.out.print("[" + array[i][j] + "]" + "\t");
            }
            System.out.println();
        }
    }
}
