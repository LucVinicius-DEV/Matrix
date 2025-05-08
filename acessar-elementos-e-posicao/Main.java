// exercicio didatico sobre matrizes
// fazer um programa que leia dois numeros inteiros M e N, e depois leia uma matriz de M linhas por N colunas contendo numeros inteiros, podendo haver repeticoes. Em seguida, ler um numero inteiro X que pertence a matriz. Para cada ocorrencia de X, mostrar os valores a esquerda, acima, a direita e abaixo de X, quando houver.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n]; // criando a matriz

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt(); // preenchendo a matriz
            }
        }

        int x = sc.nextInt(); // numero a ser procurado na matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":"); // posicao do numero na matriz
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]); // se o numero nao estiver na primeira coluna, mostra o numero a esquerda
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]); // se o numero nao estiver na primeira linha, mostra o numero acima
                    }
                    if (j < n - 1) {
                        System.out.println("Right: " + mat[i][j + 1]); // se o numero nao estiver na ultima coluna, mostra o numero a direita
                    }
                    if (i < m - 1) {
                        System.out.println("Down: " + mat[i + 1][j]); // se o numero nao estiver na ultima linha, mostra o numero abaixo
                    }
                }
            }
        }
       
        
        sc.close();
    
    }
    
}
