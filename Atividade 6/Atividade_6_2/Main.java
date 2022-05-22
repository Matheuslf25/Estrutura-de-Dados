package Atividade_6_2;

public class Main {
    public static void main(String args[]){
        LDE vetAlunos = new LDE();

        Aluno aluno1 = new Aluno("Matheus", 19, 9);
        Aluno aluno2 = new Aluno("Reyna", 25, 8);

        vetAlunos.insereInicio(aluno1);
        vetAlunos.insereFim(aluno2);
        
        System.out.println("Vazia:"+vetAlunos.estahVazia());
        System.out.println("Tamanho:"+vetAlunos.tamanho());

        Aluno aluno3 = new Aluno("Neon", 25, 8);
        vetAlunos.insereInicio(aluno3);
        vetAlunos.imprime();
        System.out.println("");
        System.out.println("Remover aluno 2:"+vetAlunos.remove(aluno2));
        vetAlunos.imprime();
    }
}
