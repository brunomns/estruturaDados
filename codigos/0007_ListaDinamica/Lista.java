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

    public void imprimeLista(){
        No aux = inicio;
        System.out.println("Inicio da lista: "+ inicio.getClass()+"@"+Integer.toHexString(inicio.hashCode()));
        System.out.println("Fim da lista: "+ fim.getClass()+"@"+Integer.toHexString(fim.hashCode()));
        while (aux!=null) {
            System.out.println(aux.toString());
            aux = aux.proximo;
        }
    }
}
