
import java.util.Scanner;


public class Atividade3 {
    public static void main(String[] args) {
        System.out.println("3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:\n" +
                            "• O menor valor de faturamento ocorrido em um dia do mês;\n" +
                            "• O maior valor de faturamento ocorrido em um dia do mês;\n" +
                            "• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.\n" +
                            "\n" +
                            "IMPORTANTE:\n" +
                            "a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;\n" +
                            "b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;");

                            
        Scanner scan = new Scanner(System.in);
        // Dados de faturamento diário em um array
        double[] faturamentoDiario = {
            24213.23, 22174.16, 24537.66, 0, 26139.61, 0, 0,
            42889.22, 46251.17, 11191.47, 0, 0,
            3847.48, 373.78, 2659.75, 48924.24, 18419.26,
            0, 0, 35240.18, 43829.16, 18235.68, 4355.06,
            0, 0, 0, 25681.83, 17137.90, 0, 0
        };

        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = 0;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        // Calcular menor e maior faturamento, e soma para média
        for (int i = 0;i < faturamentoDiario.length;i++){
            if (faturamentoDiario[i] > 0) {  // Ignorar dias sem faturamento
                if (faturamentoDiario[i] < menorFaturamento) {
                    menorFaturamento = faturamentoDiario[i];
                }
                if (faturamentoDiario[i] > maiorFaturamento) {
                    maiorFaturamento = faturamentoDiario[i];
                }
                somaFaturamento += faturamentoDiario[i];
                diasComFaturamento++;
            }
        }

        // Calcular média mensal de faturamento
        double mediaMensal = somaFaturamento / diasComFaturamento;

        // Contar dias com faturamento acima da média
        int diasAcimaMedia = 0;
        for (int i = 0;i < faturamentoDiario.length;i++) {
            if (faturamentoDiario[i] > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        // Exibir resultados
        System.out.printf("Media de faturamento: %.2f%n", mediaMensal);
        scan.nextLine(); // aguardar enter pra prosseguir
        System.out.printf("Menor valor de faturamento: %.2f%n", menorFaturamento);
        scan.nextLine(); // aguardar enter pra prosseguir
        System.out.printf("Maior valor de faturamento: %.2f%n", maiorFaturamento);
        scan.nextLine(); // aguardar enter pra prosseguir
        System.out.printf("Número de dias com faturamento acima da média: %d%n", diasAcimaMedia);
        scan.nextLine(); // aguardar enter pra finalizar
    }
}
