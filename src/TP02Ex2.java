/* 2) Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:

a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

import java.util.Scanner;

public class TP02Ex2 {
    static int[] array = new int[10];
    static int count = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int valor;
        while (count < 10) {
            System.out.print("Digite um valor positivo: ");
            valor = scanner.nextInt();
            if (valor <= 0) {
                System.out.println("Erro. O valor precisa ser positivo.");
            } else {
                array[count] = valor;
                count++;
            }
        }
        mostrarMaiorValor();
        somarValores();
        mostrarMedia();
    }

    public static void mostrarMaiorValor() {
        int maior = 0;
        for (int i = 0; i < array.length; i++) {
            if (maior < array[i]) {
                maior = array[i];
            }
        }
        System.out.println("O maior valor: " + maior);
    }

    public static void somarValores() {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        System.out.println("A soma dos valores: " + soma);
    }

    public static void mostrarMedia() {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        double media = (double) soma / array.length;
        System.out.println("A media aritmetica dos valores: " + media);
    }
}