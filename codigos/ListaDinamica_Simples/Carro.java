public class Carro {
    String modelo;
    int numPortas;
    String marca;

    public Carro(String m, int np, String marc){
        modelo = m;
        numPortas = np;
        marca = marc;
    }

    public String toString(){
        return "Carro: "+modelo+" Marca: "+marca+" N_portas: "+numPortas;
    }
}
