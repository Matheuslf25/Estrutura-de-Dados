package Atividade_2;
public class Aluno {
    private String nome;
    private int idade;
    private float nota;
 
     public Aluno(String nome, int idade, float nota) {
         this.nome = nome;
         this.idade = idade;
         this.nota = nota;
     }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return this.nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
     
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
