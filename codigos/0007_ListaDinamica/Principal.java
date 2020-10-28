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

        //l.imprimeLista();

        n = new No("D",4);
        l.insere(n);

        l.imprimeLista();

        No buscado = l.busca("C");
        System.out.println(" ----- BUSCA -----");
        System.out.println(buscado.toString());

        No removido = l.remove("B");
        System.out.println(removido.toString());

        removido = l.remove("Z");

        l.imprimeLista();

        l.insere(new No("F",5));
        l.insere(new No("G",6));
        l.insere(new No("H",7));
        l.insere(new No("I",8));
        l.insere(new No("X",9));

        l.imprimeLista();

        l.remove("G");
        l.remove("X");
        l.remove("I");
        l.remove("A");
        l.remove("C");
        l.remove("D");
        l.remove("F");
        l.imprimeLista();
        l.remove("H");

        l.imprimeLista();


    }
}
