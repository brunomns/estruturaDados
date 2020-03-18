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
        
        int matInt[][] = new int[4][4];
        for (int i = 0; i < matInt.length; i++) {
            for (int j = 0; j < matInt[0].length; j++) {
                matInt[i][j] = i*j + j;
                System.out.print(matInt[i][j]+" | ");                
            }
            System.out.println("");
            
        }
        
    }
}
