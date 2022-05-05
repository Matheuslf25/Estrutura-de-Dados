package Atividade_2;
public class Vetor {
        private Aluno[] alunos = new Aluno[5];
        private int totalAluno = 0;

        public void adiciona(Aluno aluno){
            this.alunos[this.totalAluno] = aluno;
            totalAluno++;
        }

        public int tamanho(){
            return this.totalAluno;
        }

        public boolean contem(String nome){
            for(int i = 0; i<this.totalAluno; i++){
                if(nome.equals(this.alunos[i].getNome())){
                    return true;
                }
            }
            return false;
        }
}
