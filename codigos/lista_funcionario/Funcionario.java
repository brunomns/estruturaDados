/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarioteste;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bmnso
 */
public class Funcionario {
    String nome;
    int codigo;
    double salarioMensal;
    
    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o nome");
        nome = tec.nextLine();
        Random geraCodigo = new Random();
        codigo = geraCodigo.nextInt(51001);        
        System.out.println("Digite o salário mensal");
        salarioMensal = tec.nextDouble();        
    }
    
    public double salarioAnual(){
        return salarioMensal*12;
    }
    
    public void aumentaSalario(){
        salarioMensal = salarioMensal*1.1;
        System.out.println("O novo salário será de: R$ "+salarioMensal);
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome+" codigo: "+codigo+" Salario: R$"+salarioMensal;
    }
    
}
