/* 6) Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os valores na tela. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

public class TP02Ex6 {
    public static void main(String[] args) {
        String[][] array = {
            {"Gabriel", "Lucas", "Ana"},
            {"Maria", "Joao", "Pedro"},
        };

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
