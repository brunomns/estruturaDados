public class ArvoreBinaria {

    Node raiz;

    public void insere(Node n){
        if (raiz == null){
            raiz = n;
            System.out.println("Inserido na raiz");
        }
        else{
            //busca para identificar em qual posicao
            // o elemento devera ser inserido
            Node aux = raiz;
            while(aux!=null){
                if (n.getKey() > aux.getKey()){
                    //mover para direita
                    Node filhoDir = aux.getFilhoDireita();
                    if (filhoDir!=null){
                        aux = aux.getFilhoDireita();
                    }
                    else{
                        //insere na posicao do filho a direita de aux
                        aux.setFilhoDireita(n);
                        n.setPai(aux);
                        aux=null;
                        System.out.println("Inserido no filho a direita");
                    }
                }
                else{
                    //mover para esquerda
                    Node filhoEsq = aux.getFilhoEsquerda();
                    if (filhoEsq!=null){
                        aux = aux.getFilhoEsquerda();
                    }
                    else{
                        //insere na posicao do filho a esquerda
                        aux.setFilhoEsquerda(n);
                        n.setPai(aux);
                        aux=null;
                        System.out.println("Inserido no filho a esquerda");
                    }
                }
            }//while
        }//else
    }//insere

    public Node search(int buscar){
        Node aux = raiz;
        while(aux!=null){
            if (aux.getKey() == buscar)
                return aux;
            else if(buscar > aux.getKey()){
                aux = aux.getFilhoDireita();
            }
            else{
                aux = aux.getFilhoEsquerda();
            }
        }
        return null;
    }

    public void preOrdem(Node root){
        if (root!=null){
            System.out.println(root.toString());
            preOrdem(root.getFilhoEsquerda());
            preOrdem(root.getFilhoDireita());
        }
    }

    public void posOrdem(Node root){
        if (root!=null){
            posOrdem(root.getFilhoEsquerda());
            posOrdem(root.getFilhoDireita());
            System.out.println(root.toString());
        }
    }

    public void emOrdem(Node root){
        if (root!=null){
            emOrdem(root.getFilhoEsquerda());
            System.out.println(root.toString());
            emOrdem(root.getFilhoDireita());
        }
    }


}
