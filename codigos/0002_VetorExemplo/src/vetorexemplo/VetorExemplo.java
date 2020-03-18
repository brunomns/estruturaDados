/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorexemplo;

import java.util.Scanner;

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
        Aluno vetAl[] = new Aluno[3];
        // instancia o Scanner para possibilitar a leitura via teclado...
        Scanner tec = new Scanner(System.in);
        
        //Cria os objetos do tipo aluno dentro do vetor...
        for (int i = 0; i < vetAl.length; i++) {
           
            String nome;
            String email;
            String matricula;
           
            System.out.println("Digite o nome do aluno "+ i);
            nome = tec.nextLine();

            System.out.println("Digite o e-mail do aluno "+ i);
            email = tec.nextLine();

            System.out.println("Digite a matricula do aluno "+ i);
            matricula = tec.nextLine();
                       
            vetAl[i] = new Aluno(nome, email, matricula);            
        }
        
        //vetAl[2].nome = "Maria";
        //Imprime o nome dos alunos 
        for (int i = 0; i < vetAl.length; i++) {
            System.out.println("Aluno: "+vetAl[i].nome + " ");
            
        }
        
    }
    
}
