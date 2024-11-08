
import java.util.Scanner;


public class Atividade5 {
    public static void main(String[] args) {
        
        System.out.println("5) Escreva um programa que inverta os caracteres de um string.\n" +
                            "\n" +
                            "IMPORTANTE:\n" +
                            "a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;\n" +
                            "b) Evite usar funções prontas, como, por exemplo, reverse;");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um nome: ");
        String nome = scan.nextLine();
        
        char vetorAtual;
        int qtdPosicoes = nome.length();
        char[] vetor = new char[qtdPosicoes];
        for(int i = 0; i < qtdPosicoes; i++){
            vetorAtual = nome.charAt(i);
            vetor[i] = vetorAtual;
        } // adiciona cada letra do nome em uma posição do vetor
        String nomeContrario = "";
        
        for(int i = (qtdPosicoes - 1); i>=0 ; i--){
            vetorAtual = vetor[i];
            nomeContrario += vetorAtual;
        } // grava cada letra do vetor ao contrario na variavel
        System.out.println("Esse é o nome: " + nome);
        System.out.println("Esse é o nome ao Contrario : " + nomeContrario);
        
        scan.nextLine(); // aguarda enter para finalizar
        
    }
}
