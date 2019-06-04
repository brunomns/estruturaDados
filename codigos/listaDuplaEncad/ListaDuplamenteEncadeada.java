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
public class ListaDuplamenteEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista l = new Lista();
        
        Produto p1 = new Produto(1,"Cadeira");
        Produto p2 = new Produto(2,"Mesa");
        Produto p3 = new Produto(3,"Guarda Roupa");
        Produto p4 = new Produto(4,"Rack");
        
        l.insere(new No(p1));
        l.insere(new No(p2));
        l.imprimeLista();
        l.insere(new No(p3));
        l.insere(new No(p4));
        l.imprimeLista();
        l.remove("Guarda");
        l.imprimeLista();
        l.remove("4"); 
        l.imprimeLista();
        l.remove("Guarda");
        
    }
    
}
