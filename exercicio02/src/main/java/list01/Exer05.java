
package list01;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome1 = scan.nextLine();
        System.out.print("Digite outro nome: ");
        String nome2 = scan.nextLine();
        
        nome1 = nome1.toLowerCase();
        nome2 = nome2.toUpperCase();
        
//        System.out.println(nome1 + " " + nome2);
        String nomeConcat = nome1 + " " + nome2;
        System.out.println(nomeConcat);
    }
}
