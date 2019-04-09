/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturavetor;

/**
 *
 * @author bmnso
 */
public class BuscaBin {
    int vetNum[] = {2,5,7,8,10,12,15,19,27,31,41};
    int ultimo = vetNum.length;
    
    public static void main(String[] args) {
        BuscaBin bn = new BuscaBin();
        //faz a busca binaria em todos os elementos e imprime as iteração...
        for (int i = 0; i < bn.vetNum.length; i++) {            
            System.out.println("Busca "+bn.vetNum[i]+" : está na posição: " + bn.buscabin(bn.vetNum[i]));
            
        }
        //Busca por elementos que nao estão no vetor
        System.out.println("Busca 16 : " + bn.buscabin(16));
        System.out.println("Busca 17 : " + bn.buscabin(17));
        System.out.println("Busca 1 : " + bn.buscabin(1));
        
        
        
    }
    public int buscabin(int b){
        //inicializa os ponteiros para busca
        int primeiro = 0;
        int tam = ultimo-1;        
        int n2=0;
                              
        
        while((primeiro+n2)<ultimo){
            //imprime as partições do vetor
            for (int i = primeiro; i <= tam; i++) 
                System.out.print(vetNum[i]+"|");            
            //calcula partição
            n2 = (tam - primeiro)/2;
            
            System.out.print(" partindo a partir da posição: "+(primeiro+n2)+" valor: "+vetNum[primeiro+n2]);
            System.out.println("");            
            if(vetNum[primeiro+n2]==b)
                    return primeiro+n2;            
            if((tam-primeiro)>0){                            
                if (b<vetNum[primeiro+n2]) // elemento está a esquerda
                    // condicional com atribuição em 1 linha=>>  x = <condicao>?<se sim>:<senao>;
                    tam = (n2!=0)? n2+primeiro : tam-1;                                    
                else // elemento está a direita
                    primeiro = (n2==0)?primeiro+1:primeiro+n2;                
            }
            else
                primeiro = ultimo; // força saída do looping
        }        
        return -1;
    }
    
}
