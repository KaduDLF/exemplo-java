
package exercicio;


public class Aluno {
    private int codigo;
    private String nome;
    private String endereco;
    
    Aluno(String nome, int codigo, String endereco){
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }
    public String verNome(){
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome + " codigo: " + this.codigo;
    }
    
    
}
