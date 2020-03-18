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
public class Aluno {
    String nome;
    String email;
    String matricula;
    
    //Construtor da classe com parametros
    public Aluno(String n, String mail, String mat){
        nome = n;
        email = mail;
        matricula = mat;
    }
    //Construtor sem parametros
    public Aluno(){
        
    }
}
