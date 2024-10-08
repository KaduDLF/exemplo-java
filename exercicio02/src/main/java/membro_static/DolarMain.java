
package membro_static;

import java.util.Locale;
import java.util.Scanner;


public class DolarMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual a cotação do dolar hoje: ");
        double dolar = scan.nextDouble();
        
        System.out.print("quantos dolares você vai usar?");
        double qtd = scan.nextDouble();
        
        double valorEmReais = DolarConverter.calcConvert(dolar, qtd);
        System.out.println("Você vai pagar em reais R$: " + valorEmReais);
        
    }
}
