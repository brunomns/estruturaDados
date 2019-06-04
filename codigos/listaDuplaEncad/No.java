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
public class No {
    No proximo;
    No anterior;
    Produto prod; //Dado a ser manipulado na lista
    public No (Produto p){
        prod = p;
    }
}
