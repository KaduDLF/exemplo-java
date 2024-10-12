
package exercicio;

import java.util.Random;
import java.util.Scanner;

public class Apps2 {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos ao cadastro de 3 novos alunos.");
        Aluno[] alunos = new Aluno[3];
        String nome, endereco;
        String opcao = " ";
        int codigo, duracao;
        System.out.println("Cadastro de Alunos.");
        for(int i = 0; i < 3;i++){
            System.out.println("Vamos ao cadastro do " + (i + 1) + " Aluno");
            System.out.println("Digite o nome do aluno");
            nome = scan.nextLine();
            System.out.println("Digite o logradouro do " + nome);
            endereco = scan.nextLine();
            codigo = rn.nextInt(0,100);
            codigo += i;
            
            alunos[i] = new Aluno(nome, codigo, endereco); 
            System.out.println("Cadastro Feito!!");
            scan.nextLine();
            for(int j = 0;j<10;j++){
                System.out.println(" ");
            }
        }
        System.out.println("Deseja ver os alunos?");
        opcao = scan.nextLine().toLowerCase();
        char opc = opcao.charAt(0);
        if(opc == 's'){
            for(int i = 0; i < 3; i++){
                System.out.println(alunos[i]);
            }
        }
        
        scan.nextLine();
        Curso[] cursos = new Curso[3];
        System.out.println("Cadastro de cursos");
        for(int i = 0; i < 3;i++){
            System.out.println("vamos ao " + (i + 1) + " cadastro");
            System.out.println("Digite o nome do curso");
            nome = scan.nextLine();
            System.out.println("Digite a duracao do curso de " + nome + ", em anos");
            duracao = scan.nextInt();
            cursos[i] = new Curso(nome, duracao);
            
            scan.nextLine();
            System.out.println("Curso Cadastrado");
            scan.nextLine();
            for(int j = 0;j<10;j++){
                System.out.println(" ");
            }
        }
        
        System.out.println("Deseja ver os cursos?");
        opcao = scan.nextLine().toLowerCase();
        opc = opcao.charAt(0);
        if(opc == 's'){
            for(int i = 0; i < 3; i++){
                System.out.println(cursos[i]);
            }
        }
        
        System.out.println("------------------------------------------");
    }
}
