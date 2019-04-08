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
public class Pessoa {
    String nome;
    int rg;  
    
    //Construtor
    public Pessoa(String n, int r){
        nome = n;
        rg = r;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+" RG: "+rg;
    }
}
