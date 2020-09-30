
public class Principal {

    public static void main(String[] args) {
        FilaCircular fi = new FilaCircular(4);

        for (int i = 0; i < 5; i++) {
            No n = new No("i: "+i,i);
            fi.insere(n);
        }
        fi.imprime();
        System.out.println("-----add more elements----");
        for (int i = 0; i < 6; i++) {
            No n = new No("i2: "+i,i);
            fi.insere(n);
        }

        fi.imprime();
        fi.remove();
        fi.remove();
        fi.imprime();

        for (int i = 0; i < 4; i++) {
            No n = new No("i2: "+i,i);
            fi.insere(n);
        }
        fi.imprime();
        fi.remove();

    }
}