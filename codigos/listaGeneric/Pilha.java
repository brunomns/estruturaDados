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
public class Pilha<T> {
   
    No topo=null;   
    
    //Metodo para inserção de um elemento na lista
    public void empilha(T t){
        No<T> n = new No<>(t);
        if (topo==null){
            //Pilha VAZIA...            
            topo = n;            
        }
        else{
            //Proximo de ultimo aponta para N
            topo.proximo = n;
            //Anterior do novo elemento aponta para ultimo
            n.anterior = topo;
            //atualiza o ponteiro ultimo
            topo = n;            
        }           
    }
        
    public T desempilha (){        
        if(topo!=null){ 
            T aux = (T) topo.getT();
            No ant = topo.anterior;
            ant.proximo = null;
            topo.anterior = null;
            topo = ant;
            return aux;
        }       
        else{
            System.out.println("Pilha Vazia");
            return null;
        }
    }
    
    public void limpaPilha(){      
        topo = null;
    }
    
    public void imprimePilha(){
        No aux = topo;
        System.out.println("=====PILHA =====");
        while (aux!=null){            
            System.out.println(" -> "+aux.t.toString());
            aux = aux.anterior;
        }
    }
    
}