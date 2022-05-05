package Atividade_2;
public class Main {
    public static void main(String args[]){
        Vetor vetAlunos = new Vetor();
        Aluno aluno1 = new Aluno("Matheus", 19, 9);
        Aluno aluno2 = new Aluno("Reyna", 25, 8);
        vetAlunos.adiciona(aluno1);
        vetAlunos.adiciona(aluno2);
        System.out.println(vetAlunos.tamanho());
        if(vetAlunos.contem(aluno1.getNome())){
            System.out.println("O Aluno "+aluno1.getNome()+" existe!");
        }
        else{
            System.out.println("O Aluno informado não existe!");
        }
    }
}
