// exercicio didatico sobre matrizes
// fazer um programa que leia um numero inteiro N e depois uma matriz de N linhas por N colunas contendo numeros inteiros, depois o programa devera mostrar a diagonal principal e a quantidade de valores negativos.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int[][] mat = new int[n][n]; // instanciando a matriz de N linhas e N colunas na memoria.

        for (int i = 0; i < mat.length; i++) {     // for externo para percorrer as linhas da matriz
            
            for (int j = 0; j < mat[i].length; j++) {    // for interno para percorrer as colunas da matriz
                
                mat[i][j] = sc.nextInt(); // leitura dos dados da matriz
            
            } // for interno
         
        }    // for externo

        // imprimindo a diagonal principal da matriz
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
            // mat[i][i] -> acessa a diagonal principal da matriz
        }    
        System.out.println();

        // imprimindo a quantidade de numeros negativos da matriz
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {  // se o numero for negativo
                    count++; // incrementa o contador
                }
            }
        }            
        System.out.println("Negative numbers = " + count);
    
        sc.close();
    
    }
    
}
