/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorexemplo;

/**
 *
 * @author bmnso
 */
public class VetorMatriz {
    public static void main(String[] args) {
        int vetInt[] = new int[10];
        for (int i = 0; i < vetInt.length; i++) {
            vetInt[i] = i+10;
            System.out.print(vetInt[i]+" | ");            
        }
        System.out.println("");
        
        int mat[][] = { {0,1,2},
                        {3,4,5},
                        {6,7,8}};
        
        //Realizar a soma de todos os elementos da matriz e retornar o valor resultante.
        
        int somador =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+"|"); 
                somador = somador + mat[i][j];
            }
            System.out.println("");            
        }
        
        System.out.println(" SOMA: "+ somador);
        
        int mat2[][] = { {9,10,11},
                        {12,13,14},
                        {15,16,17}};
        
        int soma[][] = new int[3][3];
        System.out.println("Matriz somando duas matrizes...");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                soma[i][j] = mat[i][j] + mat2[i][j];
                System.out.print(soma[i][j]+"|");
            }            
            System.out.println("");
        }
        
        
        /*
        int matInt[][] = new int[4][4];
        for (int i = 0; i < matInt.length; i++) {
            for (int j = 0; j < matInt[0].length; j++) {
                matInt[i][j] = i*j + j;
                System.out.print(matInt[i][j]+" | ");                
            }
            System.out.println("");
            
        }*/
        
    }
}
