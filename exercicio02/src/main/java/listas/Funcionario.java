
package listas;

public class Funcionario {
    private int id;
    private String nome;
    private int salario;
    
    Funcionario(int id, String nome, int salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }
    
    
    
    public void aumentarSal(int porcentagem){
        this.salario += this.salario * porcentagem/100;
        System.out.println("O Sálario agora é de: " + this.salario);
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "nome: " + this.nome + "\n" +
                "salario: " + this.salario;
    }
    
    
}
