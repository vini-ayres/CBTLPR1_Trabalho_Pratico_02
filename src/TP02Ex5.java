/* 5) Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela. */

/* Aluno: Vinícius do Nascimento Ayres - CB3025675 */

public class TP02Ex5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2},{3, 4},{5, 6}};
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 2; ++j) {
                System.out.print(array[i][j]);
            }
        }
    }
}
