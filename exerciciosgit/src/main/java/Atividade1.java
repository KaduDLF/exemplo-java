
public class Atividade1 {
    public static void main(String[] args) {
        System.out.println("1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;\n" +
                            "Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }\n" +
                            "Imprimir(SOMA);\n" +
                            "Ao final do processamento, qual será o valor da variável SOMA?");
        
        int indice = 13;
        int soma = 0;
        
        
        for(int k = 0; k < indice; k++){
            soma += k;
        }
        System.out.println("o valor de soma é: " + soma);
    }
}
