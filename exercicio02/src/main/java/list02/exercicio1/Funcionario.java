
package list02.exercicio1;


public class Funcionario {
    private String nome;
    private String funcao;
    private double salario;
    
    Funcionario(){
        
    }
    
    Funcionario(String nome, String funcao, double salario){
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }
    
    public void promover(double valor){
        this.salario += valor;
    }
    
    public double montante(){
        this.salario *= 12;
        return this.salario;
    }
}
