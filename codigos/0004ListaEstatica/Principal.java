import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Lista l = new Lista();

        for (int i = 0; i <= 4; i++) {
            Simport java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Lista l = new Lista();

        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite o nome para inserir na lista");
            String nome = tec.nextLine();
            No novo = new No(nome);
            l.insere(novo);
        }
        l.imprimeLista();

        int j = l.busca("Noel");
        No encontrado = l.getElement(j);
        System.out.println("--> pos "+j+" encontrado: "+encontrado.toString());

        l.remove("Joao");
        l.imprimeLista();

    }
}
