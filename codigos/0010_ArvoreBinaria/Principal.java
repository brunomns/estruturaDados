public class Principal {

    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria();

        Node n1 = new Node();
        n1.setObjKey("Ola",20);

        ab.insere(n1);


        Node n2 = new Node();
        n2.setObjKey("A",2);

        ab.insere(n2);

        Node n3 = new Node();
        n3.setObjKey("Z",3);

        ab.insere(n3);

        ab.insere(new Node("Novo",15));


        Node search_el = ab.search(20);
        if (search_el!=null)
            System.out.println(search_el.toString());
        else
            System.out.println("Elemento nao encontrado");

        System.out.println("Imprimindo em pre ordem");
        ab.preOrdem(ab.raiz);

        System.out.println("Imprimindo em pos ordem");
        ab.posOrdem(ab.raiz);

        System.out.println("Imprimindo em  ordem");
        ab.emOrdem(ab.raiz);
    }

}
