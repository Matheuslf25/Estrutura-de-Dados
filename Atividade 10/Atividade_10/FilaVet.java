package Atividade_10;

public class FilaVet implements IFila {
    private int nElemFila;
    private int inicio;
    private Aluno[] vetFila;

    public FilaVet (int tamFila){
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Aluno[tamFila];
    }

    public boolean add(Aluno info){ //método que insere na fila
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public boolean remove(){
        if (this.isEmpty()){ 
            System.out.println("Fila estah vazia");
            return false;
        }
            this.inicio = (this.inicio + 1) % this.vetFila.length;
            this.nElemFila--;
            return true;
        }
    
    public int size(){
        return nElemFila;
    }

    public boolean isEmpty(){
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        
        if(this.inicio == fim){
            return true;
        }
        else{
            return false;
        }
    }

    public void print(){
        for(int i = 0; i <= this.nElemFila; i++){
            System.out.println(this.vetFila[i].getNome());
        }
    }
}
