
package exer_encapsulamento_sobrecarga;

public class Conta {
   private String titular;
   private double cod;
   private double valor;
   
   Conta(String nome, double cod){
       this.titular = nome;
       this.cod = cod;
   }
   
   Conta(String nome, double cod, double deposito){
       this.titular = nome;
       this.cod = cod;
       this.valor = deposito;
   }

    public double getValor() {
        return valor;
    }

    public String getTitular() {
        return titular;
    }

    public double getCod() {
        return cod;
    }
   
    public void saque(double valor){
        if(valor <= this.valor){
            this.valor -= 5; // taxa do banco
            this.valor -= valor;
        }else{
            System.out.println("Valor de saque excede a quantia da conta");
        }
            
    }
    public void deposito(double valor){
        this.valor += valor;
    }
    
}
