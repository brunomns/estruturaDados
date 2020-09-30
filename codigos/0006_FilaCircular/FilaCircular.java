public class FilaCircular {


    int TAM = 10;
    No fila[];
    int inicio = -1;
    int fim = -1;

    public FilaCircular(int tam){
        fila = new No[tam];
        this.TAM = tam;
    }
    //Fila insere no fim
    //remove do comeco/inicio
    public void insere(No n){
        //verificar se fila vazia?
        if (inicio == -1 || fim == -1){
            //fila vazia
            inicio = 0;
            fim = 0;
            fila[inicio] = n;
            System.out.println(" Elemento inserido! " );
        }
        else if (proximo(fim) != inicio){
            //verificar se a fila não está cheia....
            // fim-> 10 0 1 2  inicio-> 3 4
            // a fila estará cheia quando a próxima posição após o ponteiro fim for igual ao inicio
            fim = proximo(fim);
            fila[fim] = n;
            System.out.println(" Elemento inserido! " );
        }
        else
            System.out.println(" Fila Cheia! ");

    }

    //método que retorna a próxima posição possível da Fila Circular...

    public int proximo(int pont){
        if (pont < (this.TAM -1)){
            return pont +1;
        }
        else{
            return 0;
        }
    }

    //remocao sempre no inicio da fila
    public No remove(){
        if (this.inicio != -1){
            //fila não vazia....
            No temp = fila[inicio];
            if (inicio == fim){
                fila[inicio] = null;
                inicio = -1;
                fim = -1;
            }
            inicio = proximo(inicio);
            System.out.println("Removido com sucesso: "+ temp.toString());

            return temp;
        }
        else{
            System.out.println("Lista vazia");
            return null;
        }
    }

    public void imprime(){
        if(inicio!=-1) {
            System.out.println("Ponteiros-> Inicio "+inicio+" Fim: "+fim);
            int aux = this.inicio;
            do {
                System.out.println(fila[aux].toString());
                aux = proximo(aux);
            } while (aux != proximo(fim));
        }
    }
}
