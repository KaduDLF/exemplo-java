
import java.util.Scanner;


public class Atividade4 {
    
    public static void main(String[] args) {
        System.out.println("4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:\n" +
                            "• SP – R$67.836,43\n" +
                            "• RJ – R$36.678,66\n" +
                            "• MG – R$29.229,88\n" +
                            "• ES – R$27.165,48\n" +
                            "• Outros – R$19.849,53\n" +
                            "\n" +
                            "Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  ");
        
        double[] estados = new double[5];
        
        Scanner scan = new Scanner(System.in);
        
        estados[0] = 67836.43; // SP
        estados[1] = 36678.66; // RJ
        estados[2] = 29229.88; // MG
        estados[3] = 27165.48; // ES
        estados[4] = 19849.53; // OUTROS
        
        
        double valorMensal = 0;
        for(int i = 0; i < estados.length;i++){
            valorMensal += estados[i];
        }
        
        String[] nomesEstados = {"SP", "RJ", "MG", "ES", "OUTROS"};
        
        System.out.println("Porcentagem de faturamento por estado:");
        for (int i = 0; i < estados.length; i++) {
            double porcentagem = (estados[i] / valorMensal) * 100;
            System.out.println("estado: " + nomesEstados[i]);
            System.out.printf("porcentagem: %.2f%n", porcentagem);
            System.out.println("--------");
        }
        
        scan.nextLine(); // aguardar enter para finalizar
        
    }
}
