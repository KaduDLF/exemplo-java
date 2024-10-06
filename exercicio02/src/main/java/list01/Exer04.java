
package list01;

import java.util.Scanner;


public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double num1 = scan.nextInt();
        System.out.print("Digite outro numero: ");
        double num2 = scan.nextInt();
        
        double media = (num1 + num2)/2;
        System.out.println("A média Aritmética desses numeros são: " + media);
    }
}
