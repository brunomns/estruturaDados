/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedados;

/**
 *
 * @author bmnso
 */
public class TipodeDados {

    /**
     * @param args the command line arguments
     */
    int a;
    static int b;
    
    public static void main(String[] args) {
        // TODO code application logic here
        int c;
        //instanciando um objeto l do tipo Livro
        Livro l = new Livro();
        l.nome = "Memorias Postumas de Bras Cubas";
        l.ISSN = "1234564";
        // Forma 1 -> Instanciar o objeto
        TipodeDados td = new TipodeDados();
        td.a =10;        
        // variavel local do método main...
        c = 20;
        b = 40;
        td.b = 20;
        System.out.println("td -> a: "+td.a);
        System.out.println("td -> b: "+td.b);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        
        TipodeDados td2 = new TipodeDados();
        td2.a = 35;
        td2.b = 15;
        
        System.out.println("td -> a: "+td.a);
        System.out.println("td2 -> a: "+td2.a);
        System.out.println("td2 -> b: "+td2.b);
        System.out.println("td -> b: "+td.b);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        
        
        
    }
    
}
