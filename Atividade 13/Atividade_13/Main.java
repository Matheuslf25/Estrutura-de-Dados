package Atividade_13;

public class Main {
    public static void main(String args[]){
        Aluno aluno1 = new Aluno("Matheus", 19, 9, 807365841);
        Aluno aluno2 = new Aluno("Reyna", 25, 8, 478243081);
        Aluno aluno3 = new Aluno("Neon", 25, 8, 432424562);

        MapaHashVetor map = new MapaHashVetor();
        map.put(aluno1.getMatricula(), aluno1);
        map.put(aluno2.getMatricula(), aluno2);
        map.put(aluno3.getMatricula(), aluno3);

        map.print();
    }
}
