public class No {

    //Objeto generico - pode ser de qqr tipo
    Object obj;
    //ponteiro para o proximo elemento
    No proximo;
    //ponteiro para o elemento anterior
    No anterior;

    public No(Object o){
        obj = o;
    }

    public Object getObj(){
        return obj;
    }

    public String toString(){
        return obj.toString();
    }

    public void setProximo(No n){
        proximo = n;
    }
    public No getProximo(){
        return proximo;
    }

    public void setAnterior(No n){
        anterior = n;
    }
    public No getAnterior(){
        return anterior;
    }

}
