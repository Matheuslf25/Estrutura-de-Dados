package Atividade_12_2;

public class Main {
    public static void main(String args[]){
        PilhaLista p = new PilhaLista();

        Aluno aluno1 = new Aluno("Matheus", 19, 9);
        Aluno aluno2 = new Aluno("Reyna", 25, 8);
        Aluno aluno3 = new Aluno("Neon", 25, 8);
        LSE vetAlunos = new LSE();
        vetAlunos.insereInicio(aluno1);
        vetAlunos.insereFim(aluno2);
        vetAlunos.insereFim(aluno3);

        System.out.println("LSE");
        vetAlunos.imprime();

        p.Push(vetAlunos.returnNoh(0));
        p.Push(vetAlunos.returnNoh(1));
        p.Push(vetAlunos.returnNoh(2)); 
        System.out.println("Pilha Inversa");
        p.imprimeEstado();
    }
}
