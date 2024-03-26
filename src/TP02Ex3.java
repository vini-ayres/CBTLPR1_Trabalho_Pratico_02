/* 3) Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:

a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;

Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

import java.util.Scanner;

public class TP02Ex3 {
    static double[] array;
    static int count = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        executarPrograma();
    }

    public static void executarPrograma() {
        do {
            lerValores();
            mostrarMaiorMenor();
            mostrarSomaMedia();
            mostrarPorcentagem();
        } while (desejaNovaExecucao());
    }

    public static void lerValores() {
        System.out.print("Digite a quantidade de valores a serem digitados: ");
        int n = scanner.nextInt();

        while (n < 0 || n >= 20) {
            System.out.print("Erro. Digite novamente o valor da quantidade: ");
            n = scanner.nextInt();
        }

        array = new double[n];

        count = 0;
        while (count < n) {
            System.out.print("Digite um valor: ");
            double valor = scanner.nextDouble();
            array[count] = valor;
            count++;
        }
    }

    public static void mostrarMaiorMenor() {
        double maior = array[0];
        double menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maior < array[i]) {
                maior = array[i];
            }
            if (menor > array[i]) {
                menor = array[i];
            }
        }
        System.out.println("O maior valor: " + maior);
        System.out.println("O menor valor: " + menor);
    }

    public static void mostrarSomaMedia() {
        double soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        double media = soma / array.length;
        System.out.println("A soma dos valores: " + soma);
        System.out.println("A media aritmetica dos valores: " + media);
    }

    public static void mostrarPorcentagem() {
        double porcentagemPositivos = 0;
        double porcentagemNegativos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                porcentagemPositivos++;
            }
            if (array[i] < 0) {
                porcentagemNegativos++;
            }
        }
        System.out.println("Porcentagem dos valores positivos: " + (porcentagemPositivos / array.length) * 100 + "%");
        System.out.println("Porcentagem dos valores negativos: " + (porcentagemNegativos / array.length) * 100 + "%");
    }

    public static boolean desejaNovaExecucao() {
        System.out.print("Deseja executar o programa novamente? (S/N): ");
        String resposta = scanner.next().toUpperCase();
        return resposta.equals("S");
    }
}