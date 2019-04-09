/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturavetor;

import java.util.Scanner;

/**
 *
 * @author bmnso
 */
public class EstruturaVetor {
    
    //Ponteiro que mostra a ultima posição vazia
    int ultimo =0;
    //Vetor de 10 posicoes...
    Pessoa vetP[] = new Pessoa[10];
    
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec  = new Scanner (System.in);
        EstruturaVetor ev = new EstruturaVetor();
        int opcao = -1;
        do{
            System.out.println("Digite a opção desejada");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Remover");
            System.out.println("3 - Buscar");
            System.out.println("4 - Imprimir");
            opcao = tec.nextInt();
            tec.nextLine();
            
            switch(opcao){
                case 1:
                        System.out.println("Entre com o nome");
                        String nome = tec.nextLine();
                        System.out.println("Entre com o RG");
                        int rg = tec.nextInt();
                        tec.nextLine();
                        ev.cadastraOrdena(new Pessoa(nome,rg));
                        break;
                case 2:
                        System.out.println("Digite o nome a remover");
                        String nomeR = tec.nextLine();
                        ev.remove(nomeR);
                        break;
                case 3:
                        System.out.println("Digite o nome pra buscar");
                        String nomeB = tec.nextLine();
                        int pos = ev.busca(nomeB);
                        System.out.println(ev.vetP[pos].toString());
                        break;
                case 4:
                        System.out.println("====Imprimindo Lista ====");
                        ev.imprimeVetor();
                        break;
                case 0: System.out.println("Saindo...");
                        break;
                default: System.out.println("Comando nao existente");
            }
            
        }while(opcao!=0);
        
        /*
        ev.cadastra(new Pessoa("Jaque",5827));
        
        Pessoa p1 = new Pessoa("Joao",4321);        
        ev.cadastra(p1);        
        Pessoa p2 = new Pessoa("Maria",1234);
        ev.cadastra(p2);
        
        Pessoa p3 = new Pessoa("Marta",123467);
        ev.cadastra(p3);
        
        
        
        
        //System.out.println("Removendo Maria...");
        //ev.remove("Maria");
        //ev.imprimeVetor();
        
        //System.out.println("Coloca Maria");
        ev.cadastra(p2);
        ev.cadastra(p1);
        ev.cadastra(p3);
        ev.cadastra(p2);
        ev.cadastra(p1);
        ev.cadastra(p2);
        
        ev.cadastra(p3);
        
        ev.imprimeVetor();
        ev.remove("Marta");
        ev.imprimeVetor();
        */
    }
    public void imprimeVetor(){
        for (int i = 0; i < ultimo; i++) {
            System.out.println(vetP[i].toString());
            
        }
    }
    public void cadastra(Pessoa p){
        if(ultimo<vetP.length){
            vetP[ultimo] = p;
            ultimo++;
        }
        else{
            System.out.println("====Lista cheia====");
            System.out.println("Erro ao cadastrar:"+p.nome);
        }
    }
    
    public void cadastraOrdena(Pessoa p){
        if(ultimo<(vetP.length)){
            if(ultimo==0){ // lista vazia
                //System.out.println("Cadastra posicao 0");
                vetP[ultimo]=p;
                ultimo++;
            }
            else{
                boolean flagIns =false;
                for (int i = 0; i < ultimo; i++) {                      
                    if(p.nome.compareTo(vetP[i].nome) < 0 ){
                        //inserir na posicao i                       
                        for (int j = ultimo; j > i; j--) {
                            vetP[j] = vetP[j-1];                                                
                        }
                        vetP[i] = p;
                        ultimo++;
                        flagIns = true;
                    }
                    if(flagIns) break;
                }
                if(!flagIns){
                    vetP[ultimo]=p;
                    ultimo++;
                }                
            }//else                        
        }
        else{
            System.out.println("====Lista cheia====");
            System.out.println("Erro ao cadastrar:"+p.nome);
        }
    }
    
    public int busca(String nm){
        if(ultimo == 0){
            System.out.println("LISTA VAZIA");
            return -1;
        }
        else{
            for (int i = 0; i < ultimo; i++) {
                if(vetP[i].nome.contains(nm))
                    return i;                
            }
            return -1;
        }
    }
    public void remove(String nm){
        int r = busca(nm);
        for (int i = r; i < (ultimo-1); i++) {            
                vetP[i] = vetP[i+1];                                       
        }
        ultimo--;
        vetP[ultimo] = null;
    }
    
}
