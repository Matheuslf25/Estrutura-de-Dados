package Atividade_13;

public class MapaHashVetor {
        private Aluno[] vetor;

        public MapaHashVetor() {
            this.vetor = new Aluno[23];
        }

        private int hash(int chave) {
            return chave % this.vetor.length;
        }

        public Aluno get(int chave) {
            int hash = hash(chave);
            return this.vetor[hash];
        }

        public void put(int chave, Aluno valor) {
            int sondagem = 0;
            int hash;
            while(sondagem<vetor.length){
                hash = (hash(chave) + sondagem) % vetor.length;
                if (vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                    this.vetor[hash] = valor;
                    return;
                }
                sondagem++;
                
            }
        }
        
        public Aluno remove(int chave) {
            int hash = hash(chave);
            Aluno aluno = this.vetor[hash];
            this.vetor[hash(chave)] = null;
            return aluno;
        }
        
        public void print(){
            for(int i =0; i<vetor.length; i++){
                if(vetor[i] != null){
                    System.out.println("Indice: "+i+" Aluno: "+vetor[i].getNome()+" Hash/Matrícula: "+vetor[i].getMatricula());
                }
            }
        }
}
