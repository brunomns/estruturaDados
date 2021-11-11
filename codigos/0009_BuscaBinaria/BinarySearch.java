class BinarySearch {
    //busca binaria
    int buscaBinaria(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            // Calcula qual e o elemento central, baseado na posicao
            // relativa de inicio e fim do subvetor
            int mid = l + (r - l) / 2;
            // Se o elemento esta no meio
            if (arr[mid] == x) {
                System.out.println("Elemento esta no meio! pos:"+mid +" Elemento "+arr[mid]);
                return mid;
            }
            // Se o elemento e menor que o meio, vai para o sub-array a esquerda
            if (arr[mid] > x) {
                System.out.println("Buscando a esquerda de "+mid+" Elemento "+arr[mid]);
                return buscaBinaria(arr, l, mid - 1, x);
            }
            // Senao o elemento esta a direita
            System.out.println("Buscando a direita de "+mid+" Elemento "+arr[mid]);
            return buscaBinaria(arr, mid + 1, r, x);
        }
        // Se nao encontrar nenhum elemento
        System.out.println("Elemento nao encontrado");
        return -1;
    }

    public static void imprimeVet(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(i+" | ");
        }
        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        imprimeVet(arr);
        int n = arr.length;
        int x = 25;

        int resultado = ob.buscaBinaria(arr, 0, n - 1, x);

        if (resultado == -1)
            System.out.println("Elemento nao esta no array");
        else
            System.out.println("Elemento encontrado na posicao " + resultado);
    }
}
