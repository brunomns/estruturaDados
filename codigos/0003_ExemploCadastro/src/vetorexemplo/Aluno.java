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
public class Aluno {
    String nome;
    String email;
    String matricula;
    private Scanner tec = new Scanner(System.in);
    
    //Construtor da classe com parametros
    public Aluno(String n, String mail, String mat){
        nome = n;
        email = mail;
        matricula = mat;
    }
    //Construtor sem parametros
    public Aluno(){
        
    }    
    public void cadastra(){                
        System.out.println("Digite o nome do aluno ");
        nome = tec.nextLine();
        //inteiros nextInt() , float nextFloat();.....

        System.out.println("Digite o e-mail do aluno ");
        email = tec.nextLine();

        System.out.println("Digite a matricula do aluno ");
        matricula = tec.nextLine();        
    }
    
    @Override
    public String toString(){
        return "Matrícula: "+matricula +"\n Nome: "+nome+"\n email: "+email;
    }
    
}
