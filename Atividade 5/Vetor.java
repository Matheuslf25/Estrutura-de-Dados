package Atividade_4;

public class Vetor implements iVetor{
        private Object[] objeto = new Object[2];
        private int totalObj = 0;

        public void adiciona(Object obj){
            this.garanteEspaco();
            this.objeto[this.totalObj] = obj;
            totalObj++;
        }

        public int tamanho(){
            return this.totalObj;
        }

        public boolean contem(Object obj){
            for(int i = 0; i<this.totalObj; i++){
                if(this.objeto[i] == obj){
                    return true;
                }
            }
            return false;
        }

        public boolean cheio(){
            if(totalObj == this.objeto.length){
                return true;
            }
            return false;
        }

        public void garanteEspaco(){
            if(this.cheio()){
                Object[] novosobj = new Object[this.objeto.length*2];
                for(int i=0; i<this.objeto.length; i++){
                    novosobj[i] = this.objeto[i];
                }
                this.objeto = novosobj;
            }
        }

        public boolean remove(Object obj){
            int indice = -1;
            for(int i=0; i<totalObj; i++){
                if(obj == this.objeto[i]){
                    indice = i;
                    break;
                }
            }
            if(indice != -1){
                for(int i=indice; i<(totalObj-1); i++){
                    objeto[i] = objeto[i+1];
                }
                totalObj--;
                return true;
            }
            return false;
        }
    public void imprime(){
        for(int i=0; i<totalObj; i++){
            System.out.println(this.objeto[i]);
        }
    }
}
