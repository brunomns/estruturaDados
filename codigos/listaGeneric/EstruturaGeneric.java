/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturageneric;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author bmnso
 */
public class EstruturaGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Produto> lista = new ArrayList<>();
                
        lista.add(new Produto(1,"Cafeteira"));
        lista.add(new Produto(2,"Copo"));
        lista.add(new Produto(3,"Tabua"));
        lista.add(new Produto(4,"Ferro"));
        //imprime(lista);
        
        Lista<Produto> lprod = new Lista<>();
        
        Produto p1 = new Produto(1,"Cadeira");
        Produto p2 = new Produto(2,"Mesa");
        Produto p3 = new Produto(3,"Guarda Roupa");
        Produto p4 = new Produto(4,"Rack");
                
        
        lprod.insere(p1);
        lprod.insere(p2);
        lprod.insere(p3);
        lprod.insere(p4);
        lprod.imprimeLista();
        lprod.remove("Rack");
        lprod.imprimeLista();
        lprod.insere((new Produto(6,"Notebook")));
        lprod.imprimeLista();
        
       
        
        
    }
    public static void imprime(ArrayList<Produto> l){
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).toString());            
        }
    }
    
}
