
package exercicio;


public class Matricula {
    private int numero;
    private Aluno aluno;
    private Turma turma;
    
    Matricula(int numero, Aluno aluno, Turma turma){
        this.numero = numero;
        this.aluno = aluno;
        this.turma = turma;
    }
    public Aluno verAluno(){
        return this.aluno;
    }
    public int verNumero(){
        return this.numero;
    }
}
