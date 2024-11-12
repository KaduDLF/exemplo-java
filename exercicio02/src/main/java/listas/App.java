
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        // fazer um programa para ler um numero e depois os dados, de N funcionarios, 
        // em seguida efetuar o aumento de x por cento do salario do funcionario escolhido
        
        List<Funcionario> list = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        
        Funcionario funcionario;
        
        System.out.println("Digite um determinado numero de funcionarios");
        int numero = scan.nextInt();
        
        for (int i = 0;i < numero;i++){
            System.out.println("Digite o id do funcionario:");
            int id = scan.nextInt();
            scan.nextLine();
            
            System.out.println("Digite o nome do Funcionario");
            String nome = scan.nextLine();
            
            System.out.println("Digite o Salario do funcionario");
            int salario = scan.nextInt();
            
            funcionario = new Funcionario(id,nome,salario);
            
            list.add(funcionario);
            
        }
        System.out.println("Tecle enter para continuar");
        scan.nextLine();
        
        System.out.println("Digite o id do funcionario! a ser aumentado");
        int idProc = scan.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == idProc).findFirst().orElse(null);
        if(emp == null){
            System.out.println("Esse id não foi cadastrado");
        }else{
            System.out.println("Digite o percentual de aumento de salario");
            int porcentagem = scan.nextInt();
            emp.aumentarSal(porcentagem);
        }
        
        
        
        for(Funcionario func : list){
            System.out.println(func);
        }
        
        scan.close();
    }
}
