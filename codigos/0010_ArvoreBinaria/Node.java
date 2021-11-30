public class Node {

    //arvore Binaria
    int key;
    Object o;

    Node filhoDireita;
    Node filhoEsquerda;


    //opcional
    Node pai;

    public Node(Object ob, int k){
        this.o = ob;
        this.key = k;
    }
    public Node(){}

    public void setObjKey(Object ob, int k){
        this.o = ob;
        this.key = k;
    }

    public int getKey(){
        return this.key;
    }

    public Node getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(Node filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public void setKey(int k){
        this.key = k;
    }

    public Node getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(Node filhoDireita) {
        this.filhoDireita = filhoDireita;
    }

    public Node getPai() {
        return pai;
    }

    public void setPai(Node pai) {
        this.pai = pai;
    }

    public String toString(){
        return key+ " - "+o.toString();
    }
}
