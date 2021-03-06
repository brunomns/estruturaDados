public class Lista {
    //Obj lista[] = new Obj[N]
    //definindo uma constante
    final int N=10;
    No lista[] = new No[N];
    int ultimo = -1; //ponteiro de controle da lista

    public void insere (No n){
        if(ultimo<N){
            //tenho espaço...
            //atualiza o ponteiro ultimo
            ultimo++;
            //insere o elemento na posição.
            lista[ultimo] = n;
        }
        else{
            System.out.println("Lista está cheia!");
        }
    }

    public void imprimeLista(){
        for (int i = 0; i <= ultimo; i++) {
            System.out.println("Elemento "+i+" : "+lista[i].toString());
        }
    }

    public int busca (String n){
        for (int i = 0; i <= ultimo; i++) {
            if(lista[i].getNome().contains(n)){
                return i;
            }
        }
        return -1;
    }

    public No remove(String rem){
        int r = busca(rem);
        No remover = null;
        if(r!=-1){
            remover = lista[r];
            for (int i = r; i < ultimo ; i++) {
                lista[i] = lista[i+1];
            }
            lista[ultimo] = null; //apagando a ultima posição da lista.
            ultimo--; // atualizando o ponteiro ultimo.
        }
        return remover;
    }

    public No getElement(int i){
        if (i<=ultimo){
            return lista[i];
        }
        else
            return null;
    }
}
                                                                                                                                                                                                                                                                                                                 public class Lista {
    //Obj lista[] = new Obj[N]
    //definindo uma constante
    final int N=10;
    No lista[] = new No[N];
    int ultimo = -1; //ponteiro de controle da lista

    public void insere (No n){
        if(ultimo<N){
            //tenho espaço...
            //atualiza o ponteiro ultimo
            ultimo++;
            //insere o elemento na posição.
            lista[ultimo] = n;
        }
        else{
            System.out.println("Lista está cheia!");
        }
    }

    public void imprimeLista(){
        for (int i = 0; i <= ultimo; i++) {
            System.out.println("Elemento "+i+" : "+lista[i].toString());
        }
    }

    public int busca (String n){
        for (int i = 0; i <= ultimo; i++) {
            if(lista[i].getNome().contains(n)){
                return i;
            }
        }
        return -1;
    }

    public No remove(String rem){
        int r = busca(rem);
        No remover = null;
        if(r!=-1){
            remover = lista[r];
            for (int i = r; i < ultimo ; i++) {
                lista[i] = lista[i+1];
            }
            lista[ultimo] = null; //apagando a ultima posição da lista.
            ultimo--; // atualizando o ponteiro ultimo.
        }
        return remover;
    }

    public No getElement(int i){
        if (i<=ultimo){
            return lista[i];
        }
        else
            return null;
    }
}
