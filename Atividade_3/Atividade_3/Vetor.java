package Atividade_3;

public class Vetor implements iVetor{
        private Aluno[] alunos = new Aluno[2];
        private int totalAluno = 0;

        public void adiciona(Aluno aluno){
            this.garanteEspaco();
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

        public boolean cheio(){
            if(totalAluno == this.alunos.length){
                return true;
            }
            return false;
        }

        public void garanteEspaco(){
            if(this.cheio()){
                Aluno[] novosAlunos = new Aluno[this.alunos.length*2];
                for(int i=0; i<this.alunos.length; i++){
                    novosAlunos[i] = this.alunos[i];
                }
                this.alunos = novosAlunos;
            }
        }

        public boolean remove(Aluno aluno){
            int indice = -1;
            for(int i=0; i<totalAluno; i++){
                if(aluno == this.alunos[i]){
                    indice = i;
                    break;
                }
            }
            if(indice != -1){
                for(int i=indice; i<(totalAluno-1); i++){
                    alunos[i] = alunos[i+1];
                }
                totalAluno--;
                return true;
            }
            return false;
        }
}
