/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturageneric;

/**
 *
 * @author bmnso
 * 
 * @param <T> 
 */
public class No<T> {
    No proximo;
    No anterior;
    T t; //Dado a ser manipulado na lista

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
    public No (T obj){
        t = obj;
    }
}
