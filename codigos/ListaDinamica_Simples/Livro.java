public class Livro {

    String nomeLivro;
    String autor;

    public Livro(String n, String a){
        nomeLivro = n;
        autor = a;

    }

    public String toString(){
        return "Livro: "+nomeLivro+" autor: "+autor;
    }
}
