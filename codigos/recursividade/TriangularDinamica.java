/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursao;

/**
 *
 * @author bmnso
 */
public class TriangularDinamica {
    public static final int TAM = 1000;
    public static int tri[] = new int[TAM];
    public static int contR=0;
    public static int contD =0;
    
    public static void main(String[] args) {
        for (int i = 0; i < TAM; i++) {
            tri[i]=0;            
        }
        contR=0;
        contD=0;        
        System.out.println(" Triangular Recursivo 10 = "+triangular(10)+" iterações: "+contR);
        System.out.println(" Triangular Dinamico 10 = "+triangularDinam(10)+" iterações: "+contD);
        
        contR=0;
        contD=0;        
        System.out.println(" Triangular Recursivo 5 = "+triangular(5)+" iterações: "+contR);
        System.out.println(" Triangular Dinamico 5 = "+triangularDinam(5)+" iterações: "+contD);
        
        contR=0;
        contD=0;        
        System.out.println(" Triangular Recursivo 50 = "+triangular(50)+" iterações: "+contR);
        System.out.println(" Triangular Dinamico 50 = "+triangularDinam(50)+" iterações: "+contD);
        
        contR=0;
        contD=0;        
        System.out.println(" Triangular Recursivo 25 = "+triangular(25)+" iterações: "+contR);
        System.out.println(" Triangular Dinamico 25 = "+triangularDinam(25)+" iterações: "+contD);
        
    }
    
    public static int triangular(int n){
        contR = contR+1;
        if(n>0){
            if(n==1)
                return 1;
            else
                return triangular(n-1)+n;
        }
        return -1;
    }
    
    public static int triangularDinam(int n){
        contD = contD+1;
        if(n>0 && n<TAM){
            if(tri[n]!=0){
                return tri[n];
            }
            else{
                if(n==1){
                    tri[n]=1;
                }else               
                    tri[n] = triangularDinam(n-1)+n;
                return tri[n];
            }
        }
        else{
            System.out.println("Valores possíveis entre 0 e "+TAM);
            return -1;
        }
    }
    
}
