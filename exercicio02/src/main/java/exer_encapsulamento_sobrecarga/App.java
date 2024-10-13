
package exer_encapsulamento_sobrecarga;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja cadastrar quantas contas?");
        int cont = scan.nextInt();
        byte operacao;
        boolean encontrado = false;
        
        Conta[] contas = new Conta[cont];
        double cod, deposito;
        String nome, opc;
        char opcao;
        
        for( int i = 0; i < cont; i++){
            System.out.println("Digite o numero da conta");
            cod = scan.nextDouble();
            scan.nextLine();
            System.out.println("Digite o nome do titular da conta:");
            nome = scan.nextLine();
            System.out.println("Deseja fazer um deposito inicial?");
            opc = scan.next().toLowerCase();
            opcao = opc.charAt(0);
            if(opcao == 's'){
                System.out.println("Digite o valor do deposito");
                deposito = scan.nextDouble();
                
                contas[i] = new Conta(nome, cod, deposito);
                System.out.println("Conta cadastrada com sucesso!!");
                scan.nextLine();
                
            }else{
                contas[i] = new Conta(nome, cod);
                System.out.println("Conta cadastrada com sucesso!!");
                scan.nextLine();
                System.out.println("O valor da conta do " + contas[i].getTitular() + " é de:" + contas[i].getValor());
                
            }
            
        }
        
        System.out.println("Deseja fazer um deposito ou saque em alguma conta?");
        opc = scan.next().toLowerCase();
        opcao = opc.charAt(0);
        scan.nextLine();
        System.out.println("Qual o cod da conta?");
        double busca = scan.nextDouble();
        for(int i = 0; i < cont; i++){
                if(busca == contas[i].getCod()){
                    encontrado = true;
                }
        }
        String encontrar = (encontrado) ? "codigo encontrado" : "codigo não encontrado";
        System.out.println(encontrar);
        while(opcao == 's' && encontrado){
            for(int i = 0; i < cont; i++){
                if(busca == contas[i].getCod()){
                    System.out.println(contas[i].getTitular() + " saldo: " + contas[i].getValor());
                    encontrado = true;
                    System.out.println("Digite 1 para saque, e 2 para deposito");
                    operacao = scan.nextByte();
                    switch(operacao){
                        case 1:
                            System.out.println("Digite o valor do saque:");
                            deposito = scan.nextDouble();
                            contas[i].saque(deposito);
                            
                            System.out.println("O Valor da Conta de " + contas[i].getTitular() + " é de :" + contas[i].getValor());
                            break;
                        case 2:
                            System.out.println("Digite o valor do deposito:");
                            deposito = scan.nextDouble();
                            contas[i].deposito(deposito);
                            
                            System.out.println("O Valor da Conta de " + contas[i].getTitular() + " é de :" + contas[i].getValor());
                            break;
                            
                        default:
                           System.out.println("Valor incorreto");
                           break;
                    }   
                }
                
            }
            System.out.println("Deseja fazer outra operação?");
            opc = scan.next().toLowerCase();
            opcao = opc.charAt(0);
        }
        
    }
}
