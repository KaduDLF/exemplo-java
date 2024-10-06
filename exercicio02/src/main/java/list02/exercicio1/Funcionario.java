
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

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
