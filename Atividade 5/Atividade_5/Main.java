package Atividade_5;

public class Main {
    public static void main(String args[]){
        LSE vetAlunos = new LSE();
        Aluno aluno1 = new Aluno("Matheus", 19, 9);
        Aluno aluno2 = new Aluno("Reyna", 25, 8);
        vetAlunos.insereInicio(aluno1);
        vetAlunos.insereFim(aluno2);
        Aluno aluno3 = new Aluno("Neon", 25, 8);
        vetAlunos.insereInicio(aluno3);
        vetAlunos.imprime();
        System.out.println(vetAlunos.remove(aluno2));
        vetAlunos.imprime();
    }
}
