
package list02.exerconta;


public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente propietario;
    
    Conta(int nmr, Cliente proprietario, double saldo, double limite){
        this.numero = nmr;
        this.propietario = proprietario;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    boolean saque(double valor){
        if(valor <= (this.saldo + this.limite)){
            if(valor <= this.saldo){
                this.saldo = this.saldo - valor;
                return true;
            }else{
                valor = valor - this.saldo;
                this.saldo = 0;
                this.limite = this.limite - valor;
                return true;
            }
        }else{
            return false;
        }         
    }
    boolean deposito(double valor){
        this.saldo = this.saldo + valor;
        return true;
    }
}
