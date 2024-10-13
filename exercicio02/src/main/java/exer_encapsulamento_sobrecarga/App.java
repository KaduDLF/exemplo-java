
package exer_encapsulamento_sobrecarga;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja cadastrar quantas contas?");
        int cont = scan.nextInt();
        
        Conta[] contas = new Conta[cont];
        double cod, deposito;
        String nome, opc;
        char opcao;
        
        for( int i : contas){
            System.out.println("Digite o numero da conta");
            cod = scan.nextDouble();
            scan.nextLine();
            System.out.println("Digite o nome do titular da conta:");
            nome = Scan.nextLine();
            System.out.println("Deseja fazer um deposito inicial?");
            opc = scan.next().toLowerCase();
            opcao = opc.charAt(0);
            if(opcao == 's'){
                System.out.println("Digite o valor do deposito");
                deposito = scan.nextDouble();
                
                contas[i] = new Conta(nome, cod, deposito);
                System.out.println("Conta cadastrada com sucesso!!");
                
            }else{
                contas[i] = new Conta(nome, cod);
                System.out.println("Conta cadastrada com sucesso!!");
                System.out.println("O valor da conta " + nome + " é de:" contas[i].getValor());
                
            }
            
        }
        
        
    }
}
