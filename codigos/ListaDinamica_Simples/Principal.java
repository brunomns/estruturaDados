public class Principal {
    public static void main(String[] args) {
        ListaEncadeadaDinamica listaLivros = new ListaEncadeadaDinamica();

        Livro l1 = new Livro("Estrutura", "LAFORE");
        Livro l2 = new Livro("Algoritmos", "CORMEN");
        Livro l3 = new Livro("Arquitetura", "Tenembau");

        listaLivros.insereFim(new No(l1));
        listaLivros.insereFim(new No(l2));
        listaLivros.insereFim(new No(l3));

        listaLivros.imprimeLista();


        ListaEncadeadaDinamica listaCarros = new ListaEncadeadaDinamica();

        Carro c1 = new Carro("Civic",4,"Honda");
        Carro c2 = new Carro("Gol",4,"Volks");
        Carro c3 = new Carro("Onix",4,"Chevrolet");

        listaCarros.insereFim(new No(c1));
        listaCarros.insereFim(new No(c2));
        listaCarros.insereFim(new No(c3));

        listaCarros.imprimeLista();

        listaCarros.remove("Volks");

        listaCarros.imprimeLista();

        System.out.println("Lista Hibrida! ");
        ListaEncadeadaDinamica listaHibrida = new ListaEncadeadaDinamica();
        listaHibrida.insereFim(new No(l1));
        listaHibrida.insereFim(new No(l2));
        listaHibrida.insereFim(new No(l3));
        listaHibrida.insereFim(new No(c1));
        listaHibrida.insereFim(new No(c2));
        listaHibrida.insereFim(new No(c3));

        listaHibrida.imprimeLista();

        listaHibrida.remove("Estrutura");
        listaHibrida.remove("Civic");

        listaHibrida.imprimeLista();

        No carro = listaHibrida.busca("Gol");

        Carro c = (Carro) carro.getObj();
        System.out.println(c.marca);

        No x = listaHibrida.busca("Algoritmos");
        String nomeClasse = x.getObj().getClass().getName();
        if (nomeClasse == "Livro"){
            Livro l = (Livro) x.getObj();
            System.out.println(l.autor);
        }
        else{
            Carro c6  = (Carro) x.getObj();
            System.out.println(c6.marca);
        }
    }
}
