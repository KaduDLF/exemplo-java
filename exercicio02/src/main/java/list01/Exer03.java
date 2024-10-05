
package list01;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome completo");
        nome = scan.nextLine(); // armazena o nome
        
        System.out.println("A quantidade total de letras é de: " + nome.length());
    }
}
