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
public class Fibotest {
    static long fibo[] = new long[1000];
    public static void main(String[] args) {
        for (int i = 0; i < fibo.length; i++) {
            fibo[i]=0;            
        }
        System.out.println("Fibo recursivo...");
        long start = System.currentTimeMillis();
        System.out.println("Fibo :"+fibonaci(50));
        long finish = System.currentTimeMillis();
        long tempo = finish - start;
        System.out.println("Tempo Recursao = " + tempo);
        
        
        System.out.println("=======================");
        start = System.currentTimeMillis();
        System.out.println("Fibo DINAMICO: "+fibonaciD(50));
        finish = System.currentTimeMillis();
        tempo = finish - start;
        System.out.println("Tempo Dinamico = " + tempo);
        
        
        
    }
    public static long fibonaciD(int n){
        //System.out.print(" n= "+n);
        if (fibo[n]!=0){
            return fibo[n];
        }
        else if(n>0){
            if(n==1 || n==2){
                fibo[n]=1;
                return 1;
            }
            else{
                fibo[n] = fibonaciD(n-1)+fibonaciD(n-2);
                return fibo[n];
            }
        }
        else
            return -1;
    }
    
    public static long fibonaci(int n){
       //System.out.print (" n = "+n);
       if(n>0){
            if(n==1 || n==2){               
                return 1;
            }
            else{
                return fibonaci(n-1)+fibonaci(n-2);             
            }
        }
        else
            return -1;
    }
    
}
