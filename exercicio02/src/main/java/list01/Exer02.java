
package list01;

import java.util.Random; // importa a classe random
import java.util.Scanner; // importa a classe scanner


public class Exer02 {
    public static void main(String[] args) { // metodo main
        Scanner scan = new Scanner(System.in); // objeto que permite pegar o que o usuario digitou
        Random rdn = new Random(); // objeto para gerar um numero aleatorio e adicionar ao email
        String nome; // variavel que armazena o nome digitado
        int nmr; // variavel que armazena o numero aleatorio
        System.out.print("Digite seu nome completo:");
        nome = scan.nextLine();
        String[] vetor = nome.split(" "); // separa as palavras por espaço e transforma cada palavra separada em um vetor
        String nomeConc = vetor[0]; // define o primeiro nome como a primeira posição do vetor
        // System.out.println(vetor[0] + vetor[1] + vetor[2] + vetor[3] + "@gmail.com");
        for(int i = 1; i < vetor.length; i++){
            nomeConc = nomeConc + vetor[i];
        } // concatena cada posição do vetor ao nome
        
        String email = nomeConc.concat("@gmail.com"); // concatena o nome concatenado com @gmail.com
        email = email.toLowerCase(); // transforma o email em minusculo
        System.out.println("Email usando .split .concat e vetor: " +  email);
        
        nmr = rdn.nextInt(0,100); // gera um numero aleatorio de 0 a 100 para colocar no final do email
        
        // metodo que eu inventei kkk //
        
        // metodo com .replace()
        
        email = nome.replace(" ", "").toLowerCase() + nmr + "@gmail.com"; // transforma substitui o espaço em branco por nada e transforma o texto em minusculo, depois coloca o numero que foi gerado aleatoriamente
        System.out.println("Email usando o .replace: " + email);
        
        
    }
}
