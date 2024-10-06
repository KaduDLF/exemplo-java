
package list02.exerconta;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String nome, sobrenome, CPF; // variaveis para armazenar
        int idade, opc; // opc para escolher qual ação realizar
        double valor; // valor para deposito ou saque
        String verificar;
        double saldo, limite;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da conta");
        nome = scan.nextLine();
        System.out.println("Digite o Sobrenome");
        sobrenome = scan.nextLine();
        System.out.println("Digite seu CPF");
        CPF = scan.nextLine();
        System.out.println("Digite sua idade");
        idade = scan.nextInt();
        
        Cliente c1 = new Cliente(nome, CPF, idade);
        c1.sobrenome = sobrenome;
        
        
        System.out.println("Qual o saldo da sua conta?");
        saldo = scan.nextDouble();
        
        System.out.println("Qual o limite da sua conta?");
        limite = scan.nextDouble();
        
        Conta c1C = new Conta(12, c1, saldo, limite);
        
        System.out.println("Deseja fazer um deposito ou um saque?");
        System.out.println("Digite 1 para sim e 2 para não");
        opc = scan.nextInt();
        
        while(opc == 1 && opc != 2){
            System.out.println("Digite a operacao que você deseja, 1 para saque e 2 para deposito");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Digite quantos você deseja sacar");
                    valor = scan.nextDouble();
                    scan.nextLine();
                    verificar = (c1C.saque(valor)) ? " Saque foi concluido " : " Saque não foi realizado ";
                    System.out.println(c1C.propietario.nome + " o" + verificar + "E agora seu saldo é: " + "R$" + c1C.saldo + " e o limite é: " + "R$" + c1C.limite);
                    scan.nextLine();
                    for(int i = 0; i<50; i++){
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Digite quantos você deseja depositar");
                    valor = scan.nextDouble();
                    scan.nextLine();
                    verificar = (c1C.deposito(valor)) ? " Deposito foi concluido " : " Deposito não foi realizado ";
                    System.out.println(c1C.propietario.nome + " o" + verificar + "E agora seu saldo é: " + "R$" + c1C.saldo + " e o limite é: " + "R$" + c1C.limite);
                    scan.nextLine();
                    for(int i = 0; i<50; i++){
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Codigo incorreto");
                    break;
            }
            System.out.println("Deseja fazer outro deposito ou outro saque?");
            System.out.println("Digite 1 para sim e 2 para não");
            opc = scan.nextInt();
            scan.nextLine();
        }
        scan.close();
            
    }
}
