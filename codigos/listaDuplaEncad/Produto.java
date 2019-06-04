/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaduplamenteencadeada;

/**
 *
 * @author bmnso
 */
public class Produto {
    int idProd;
    String nomeProd;
    
    public Produto(int id, String nome){
        idProd = id;
        nomeProd = nome;
    }
    
    public String toString(){
        return idProd+" "+nomeProd;
    }
    
}
