
package exercicio;


public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Carlos", 19, "rua 63 qd 5 ltp 21");
        Curso curso1 = new Curso("Sistemas", 4);
        Turma turma1 = new Turma("1 periodo", curso1);
        Matricula matricula1 = new Matricula(98, a1, turma1);
        
        System.out.println("a matricula do aluno: " + matricula1.verAluno().verNome() + " é " + matricula1.verNumero());
    }
}
