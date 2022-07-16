package Atividade11;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Matheus", 19, 9);
        Aluno aluno2 = new Aluno("Reyna", 25, 8);
        Aluno aluno3 = new Aluno("Neon", 25, 8);
        FilaVet fila = new FilaVet();
        System.out.println(fila.isEmpty());
        fila.add(aluno1);
        System.out.println(fila.size());
        fila.add(aluno2);
        System.out.println(fila.size());
        fila.add(aluno3);
        System.out.println(fila.isEmpty());
        fila.print();
    }
}
