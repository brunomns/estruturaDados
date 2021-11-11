import java.util.Random;

public class QuickSort {

    public void troca (int arr[], int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public int particiona(int arr[], int esq, int dir, int pivo){
        int esqPont = esq-1;
        int dirPont = dir;
        while(true){
            //encontra maior item
            while (arr[++esqPont] < pivo);
            //encontra menor item
            while (dirPont > 0 && arr[--dirPont] > pivo);
            //se ponteiros cruzam - particao feita.
            if (esqPont >= dirPont)
                break;
            else
                troca(arr,esqPont,dirPont);
        }
        troca(arr,esqPont,dir);
        return esqPont;
    }

    //parametros vet -> vetor a ser ordenado
    // i -> posicao inicial do sub-vetor
    // j -> posicao final do sub-vetor
    public void quicksort(int[] vet, int i, int j){
        if (j-i <= 0)
            return;
        else {
            System.out.println("Particionamento - pivo: "+vet[j]);
            int part = particiona(vet, i, j, vet[j]);
            imprimeVet(vet);
            System.out.println("Chamando recursivo lado esquerdo: "+i+" ate "+(part-1));
            quicksort(vet, i, part - 1);
            System.out.println("Esquerda");
            imprimeVet(vet);
            System.out.println("Chamando recursivo lado direito: "+(part+1)+" ate "+j);
            quicksort(vet, part + 1, j);
            System.out.println("Direita");
            imprimeVet(vet);
        }
    }

    public static void imprimeVet(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int vet1[] = new int[20];
        //gera valores aleatorios para o vetor
        Random rand = new Random();
        for (int i = 0; i < vet1.length; i++) {
            boolean randok = true;
            while(randok){
                int rand_val = rand.nextInt(100);
                for (int j = 0; j <= i; j++) {
                    if (rand_val == vet1[j]) {
                        randok = false;
                        break;
                    }
                }
                if (randok) {
                    vet1[i] = rand_val;
                    randok = false;
                }
                else
                    randok = true;
            }
        }
        imprimeVet(vet1);


        QuickSort quick = new QuickSort();
        quick.quicksort(vet1,0,vet1.length-1);

        imprimeVet(vet1);
    }

}
