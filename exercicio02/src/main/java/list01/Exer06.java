
package list01;
import java.util.Scanner;
public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = scan.nextLine();
        char vetorAt;
        int qtdPosicoes = nome.length();
        char[] vetor = new char[qtdPosicoes];
        for(int i = 0; i < qtdPosicoes; i++){
            vetorAt = nome.charAt(i);
            vetor[i] = vetorAt;
        }
        String nomeContrario = "";
        
        for(int i = (qtdPosicoes - 1); i>=0 ; i--){
            vetorAt = vetor[i];
            nomeContrario += vetorAt;
        }
        System.out.println("Esse é o nome: " + nome);
        System.out.println("Esse é o nome ao Contrario : " + nomeContrario);
    }
}
