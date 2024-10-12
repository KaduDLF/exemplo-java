
package exercicio;


public class Curso {
    private String nome;
    private int duracao;
    
    Curso(String nome, int duracao){
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
    
    
}
