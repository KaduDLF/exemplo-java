
package list01;

import java.util.Scanner;


public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.print("Digite seu nome completo:");
        nome = scan.nextLine();
        String[] vetor = nome.split(" ");
        String nomeConc = vetor[0];
        // System.out.println(vetor[0] + vetor[1] + vetor[2] + vetor[3] + "@gmail.com");
        for(int i = 1; i < vetor.length; i++){
            nomeConc = nomeConc + vetor[i];
        }
        
        String email = nomeConc.concat("@gmail.com");
        email = email.toLowerCase();
        System.out.println(email);
    }
}
