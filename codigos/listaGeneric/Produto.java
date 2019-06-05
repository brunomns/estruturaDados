/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturageneric;

/**
 *
 * @author bmnso
 */
public class Produto {
    int idProd;
    String nomeProd;
    
    public Produto(int i, String n){
        idProd = i;
        nomeProd = n;
    }
    @Override
    public String toString() {
        return "Produto{" + "id=" + idProd + ", nome=" + nomeProd + '}';
    }

    public int getId() {
        return idProd;
    }

    public void setId(int id) {
        this.idProd = id;
    }

    public String getNome() {
        return nomeProd;
    }

    public void setNome(String nome) {
        this.nomeProd = nome;
    }
    
}
