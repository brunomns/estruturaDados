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
public class VetorExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno vetAl[] = new Aluno[5];
        
        //Cria os objetos do tipo aluno dentro do vetor...
        for (int i = 0; i < vetAl.length; i++) {
           vetAl[i] = new Aluno("nomeAluno"+i,"mail"+i+"@uenp.edu",Integer.toString(i));            
        }
        //Imprime o nome dos alunos 
        for (int i = 0; i < vetAl.length; i++) {
            System.out.println("Aluno: "+vetAl[i].nome);
            
        }
        
    }
    
}
