public class Lista {

    No inicio;
    No fim;

    public void insere(No n){
        if (inicio == null){ //lista vazia
            inicio = n;
            fim = n;
            System.out.println("Inicializando a lista - Inserido no inicio...");
        }
        else{
            fim.proximo = n;
            fim = n;
            System.out.println("Inserido no final...");
        }

    }

    public No busca(String s){
        No aux = inicio;
        while(aux != null){
            if(aux.valor.contains(s)){
                return aux;
            }
            aux = aux.proximo;
        }
        return null;
    }

    public No buscaAnt(String s){
        No ant = inicio;
        while(ant.proximo != null){
            if(ant.proximo.valor.contains(s)){
                return ant;
            }
            ant = ant.proximo;
        }
        return null;
    }

    public No remove(String s){
        No aux = inicio;
        if (inicio != null) {
            if (aux.valor.contains(s)) {
                if (aux == fim) {
                    //lista só tem um elemento.
                    fim = null;
                    inicio = null;
                } else {
                    inicio = aux.proximo;
                    aux.proximo = null;
                }
            } else {
                No ant = buscaAnt(s);
                if(ant !=null) {
                    aux = ant.proximo;
                    if (aux == fim) {
                        ant.proximo = null;
                        fim = ant;
                    } else {
                        ant.proximo = aux.proximo;
                        aux.proximo = null;
                    }
                }
                else{
                    System.out.println("Elemento nao encontrado na lista");
                    return null;
                }
            }
            System.out.println("Elemento removido -> "+s);
            return aux;
        }
        else{
            System.out.println("Lista vazia...");
            return null;
        }
    }

    public void imprimeLista(){
        No aux = inicio;
        if (inicio == null){
            System.out.println("---LISTA VAZIA---");
        }
        else {
            System.out.println("Inicio da lista: " + inicio.getClass() + "@" + Integer.toHexString(inicio.hashCode()));
            System.out.println("Fim da lista: " + fim.getClass() + "@" + Integer.toHexString(fim.hashCode()));
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.proximo;
            }
        }
    }
}
