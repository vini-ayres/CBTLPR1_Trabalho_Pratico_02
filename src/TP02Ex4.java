/* 4) Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

public class TP02Ex4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},{4, 5, 6}};
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(array[i][j]);
            }
        }
    }
}
