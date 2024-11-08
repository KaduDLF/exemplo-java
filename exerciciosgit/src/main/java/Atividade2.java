
import java.util.Scanner;


public class Atividade2 {
    public static void main(String[] args) {
        System.out.println("2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores"
                + "\n (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde"
                + ", \n informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.\n" +
                            "\n" +
                            "IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;");
        
        int[] fibonnaci = new int[30];
        boolean encontrado = false;
        Scanner scan = new Scanner(System.in);
        
        fibonnaci[0] = 0;
        fibonnaci[1] = 1;
        
        for(int i = 2; i < fibonnaci.length; i++){
            fibonnaci[i] = fibonnaci[i - 2] + fibonnaci [i - 1];
            System.out.println(fibonnaci[i]);
        }
        
        System.out.println("informe um número");
        int numero = scan.nextInt();
        
        for(int i = 0; i < fibonnaci.length; i++){
            if(numero == fibonnaci[i]){
                encontrado = true;
            }
        }
        
        if(encontrado){
            System.out.println("o numero foi encontrado na sequência!");
            
        }else{
            System.out.println("o numero não foi encontrado");
        }
    }
}
