
package list01;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int qtdLetras; // variavel que armazena a quantidade de Letras
        int qtdVogais; // variavel que armazena a quantidade de vogais
        System.out.println("Digite seu nome completo");
        nome = scan.nextLine(); // armazena o nome
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
        System.out.println("A quantidade de vogais é de: " + (qtdLetras - qtdVogais));
        
    }
}
