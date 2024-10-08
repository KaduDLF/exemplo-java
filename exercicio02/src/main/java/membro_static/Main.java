
package membro_static;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        double raio;
        
        System.out.println("Digite uma raio:");
        raio = scan.nextDouble();
        
        double volume = Calculadora.calcVolume(raio);
        double circ = Calculadora.calcCirc(raio);
        
        System.out.println("A circunferencia referente a este raio é: " + circ);
        System.out.println("O volume referente a este Raio é: " + volume);
        
        
        
        
    }
}
