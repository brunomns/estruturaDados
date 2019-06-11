/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturageneric;

/**
 *
 * @author bmnso
 */
public class Fila<T>{
    
    No primeiro=null;
    No ultimo=null;   
    
    
    //Metodo para inserção de um elemento na lista
    public void insere(T t){
        No<T> n = new No<>(t);
        if (primeiro==null){
            //LISTA VAZIA...
            primeiro = n;
            ultimo = n;            
        }
        else{
            //Proximo de ultimo aponta para N
            ultimo.proximo = n;
            //Anterior do novo elemento aponta para ultimo
            n.anterior = ultimo;
            //atualiza o ponteiro ultimo
            ultimo = n;            
        }           
    }
   
    
    public T remove (){
        if(primeiro!=null){
            T aux = (T) primeiro.getT();
            if(primeiro == ultimo){
                //So tem um elemento na fila
                primeiro = null;
                ultimo = null;                
            }
            else{               
                No prox = primeiro.proximo;
                prox.setAnterior(null);
                primeiro.setProximo(null);
                primeiro = prox;                
            }
            return aux;
        }
        else{
            System.out.println("Fila Vazia");
            return null;
        }
    }
    
    public void limpaLista(){
        primeiro = null;
        ultimo = null;
    }
    
    public void imprimeLista(){
        No aux = primeiro;
        System.out.println("=====LISTA =====");
        while (aux!=null){            
            System.out.println(" -> "+aux.t.toString());
            aux = aux.proximo;
        }
    }
}
