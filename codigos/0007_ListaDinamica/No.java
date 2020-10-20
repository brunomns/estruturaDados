public class No {

    String valor;
    int id;

    No proximo;

    public No(String v, int i){
        valor = v;
        id = i;
    }

    public String toString(){
        if (proximo!=null)
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) + " No id: "+id+" valor: "+valor + " proximo elemento: "+ proximo.getClass()+"@"+Integer.toHexString(proximo.hashCode());
        else
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) + " No id: "+id+" valor: "+valor + " proximo elemento: null";
    }
}
