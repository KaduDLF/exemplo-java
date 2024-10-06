
package list01;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, nome2;
        int qtdLetras; // variavel que armazena a quantidade de Letras
        int qtdVogais; // variavel que armazena a quantidade de vogais
        System.out.println("Digite seu nome completo");
        nome = scan.nextLine(); // armazena o nome
        nome2 = nome;
        nome = nome.replace(" ", ""); // substituindo espaço por 'vazio' para não impactar na contagem de letras
        qtdLetras = nome.length();
        System.out.println("A quantidade total de letras é de: " + qtdLetras);
        nome = nome.toLowerCase();
        nome = nome.replace("a", "");
        nome = nome.replace("e", "");
        nome = nome.replace("i", "");
        nome = nome.replace("o", "");
        nome = nome.replace("u", "");
        qtdVogais = qtdLetras - nome.length();
        System.out.println("A quantidade de vogais é de: " + qtdVogais);
        System.out.println("A quantidade de Consoantes é de: " + (qtdLetras - qtdVogais));
        // esse codigo de cima, tira todas as vogais do nome e subtrai as letras totais pelas total de letra sem vogal
        // Depois ele subtrai o total de letras, menos o total de vogais e descobre o resultado de Consoantes
        
        // agora vou fazer usando estrutura de repetição e condicional
        
        System.out.println(" ------------------------------ ");
        char vazio;
        int qtdVazio = 0;
        for(int i = 0;i < nome2.length(); i++){
            vazio = nome2.charAt(i);
            if(vazio == ' '){
                qtdVazio++;
            }
        }
        int nome2SemEspaco = nome2.length() - qtdVazio;
        System.out.println("A quantidade de Letras é de: " + nome2SemEspaco);
        char vogal; 
        int qtdVogal = 0;
        for(int i = 0; i< nome2.length(); i++){
            vogal = nome2.charAt(i);
            if(vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u'){
                qtdVogal++;                    
            }
        }
        System.out.println("A quantidade de Vogal é de: " + qtdVogal);
        System.out.println("A quantidade de consoante é de: " + (nome2SemEspaco - qtdVogal));
        
    }
}
