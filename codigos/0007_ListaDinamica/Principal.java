public class Principal {

    public static void main(String[] args) {
        Lista l = new Lista();

        No n = new No("A",1);
        l.insere(n);

        l.imprimeLista();

        n = new No("B",2);
        l.insere(n);

        n = new No("C",3);
        l.insere(n);

        l.imprimeLista();

        n = new No("D",4);
        l.insere(n);

        l.imprimeLista();


    }
}
