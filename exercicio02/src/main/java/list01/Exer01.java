
package list01;

import java.util.Scanner;


public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuario;
        System.out.println("Digite um nome.");
        usuario = scan.nextLine();
        
        System.out.println("o nome em Maiusculo é " + usuario.toUpperCase());
        
    }
}
