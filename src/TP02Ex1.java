/* 1) Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

import java.util.Scanner;

public class TP02Ex1 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int valor1;
        int valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();

        while (valor1 >= valor2) {
            System.out.print("Digite o segundo valor: ");
            valor2 = scanner.nextInt();
        }

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }
}
