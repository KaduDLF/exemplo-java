
package list02.exerconta;

public class Cliente {
    private int idade;
    private String cpf, sobrenome, nome, logradouro;
    
    Cliente(){
    }
    
    Cliente(String nomeC, String cpfC, String endereco){
        this.nome = nomeC;
        this.cpf = cpfC;
        this.logradouro = endereco;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    
    
}
