
package list01;

import java.util.Scanner;
public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros;
        numeros = new int[5];
        System.out.println("Digite 5 numeros");
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + " numero");
            numeros[i] = scan.nextInt();
            
        }
        int menorN = numeros[0];
        int maiorN = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] < menorN) {
                menorN = numeros[i];
            }
            if (numeros[i] > maiorN) {
                maiorN = numeros[i];
            }
        }
        
        System.out.println("O menor N é: " + menorN + " e o maior N é: " + maiorN);
    }
}
