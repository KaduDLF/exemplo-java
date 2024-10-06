
package list02.exercicio1;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario func1 = new Funcionario();
        System.out.println("Diga o nome do funcionario");
        String nome = scan.nextLine();
        System.out.println("Digite a funcao deste funcionario");
        String funcao = scan.nextLine();
        System.out.println("Qual salario desse funcionario?");
        double salario = scan.nextDouble();
        scan.nextLine();
        
        func1.setFuncao(funcao);
        func1.setNome(nome);
        func1.setSalario(salario);
        
        System.out.println("Deseja promover esse funcionario? s para sim e n para não");
        String escolha = scan.nextLine();
        escolha = escolha.toLowerCase();
        while(escolha.equals("s")){
            System.out.println("Digite quantos reais vão ser acrescentado ao salario");
            double valor = scan.nextDouble();
            scan.nextLine();
            func1.promover(valor);
            
            System.out.println("o novo salario é: " + func1.getSalario());
            
            System.out.println("Deseja fazer outra promoção para esse funcionario? s para sim e n para não");
            escolha = scan.nextLine();
            escolha = escolha.toLowerCase();
        }
        
        System.out.println("o Montante do Salario deste funcionario é: " + func1.montante());
    }
}
