/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarioteste;

import java.util.Scanner;

/**
 *
 * @author bmnso
 */
public class FuncionarioTeste {

    /**
     * @param args the command line arguments
     */
     //Ponteiro que mostra a ultima posição vazia
    int ultimo =0;
    //Vetor de 10 posicoes...
    Funcionario vetP[] = new Funcionario[10];
    
    public static void main(String[] args){
        FuncionarioTeste ft = new FuncionarioTeste();
        
                
        Scanner tec = new Scanner(System.in);
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
                        Funcionario f = new Funcionario();
                        f.cadastrar();
                        ft.cadastra(f);
                        break;
                case 2:
                        System.out.println("Digite o nome a remover");
                        String nomeR = tec.nextLine();
                        ft.remove(nomeR);
                        break;
                case 3:
                        System.out.println("Digite o nome pra buscar");
                        String nomeB = tec.nextLine();
                        int pos = ft.busca(nomeB);
                        System.out.println(ft.vetP[pos].toString());
                        break;
                case 4:
                        System.out.println("====Imprimindo Lista ====");
                        ft.imprimeVetor();
                        break;
                case 0: System.out.println("Saindo...");
                        break;
                default: System.out.println("Comando nao existente");
            }
            
        }while(opcao!=0);
        
        
    }
    //antigo main...
    public static void main1(String[] args) {
        // TODO code application logic here
        
       Funcionario f1 = new Funcionario();
       f1.cadastrar();
        
        
        
        Funcionario f2 = new Funcionario();
        f2.cadastrar();
        System.out.println("Funcionario: "+f2.toString());
        System.out.println("Salario Anual: "+ f2.salarioAnual());
        System.out.println("Aumentando o salario...");
        f2.aumentaSalario();
        System.out.println("Novo salario anual "+f2.salarioAnual());
                
        
        System.out.println("F1 = "+f1.toString());
        f1.aumentaSalario();
        System.out.println("F2 = "+f2.toString());
    }
    public void imprimeVetor(){
        for (int i = 0; i < ultimo; i++) {
            System.out.println(vetP[i].toString());
            
        }
    }
    public void cadastra(Funcionario p){
        if(ultimo<vetP.length){
            vetP[ultimo] = p;
            ultimo++;
        }
        else{
            System.out.println("====Lista cheia====");
            System.out.println("Erro ao cadastrar:"+p.nome);
        }
    }
    
    public void cadastraOrdena(Funcionario p){
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
