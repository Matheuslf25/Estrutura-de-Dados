package Atividade_12_1;

public class PilhaVet implements IPilha {
    private Object[] pilha;
    private int numElem;

    public PilhaVet (int tamanhoVetor){ //construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean Push(Object info){ //empilha
        if (this.numElem == pilha.length){
            System.out.println("pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    public Object Pop(){ //desempilha
        Object o = null;
        if(this.isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem-1];
        this.pilha[numElem-1] = null;
        this.numElem--;
        return o;
    }

    public boolean isEmpty(){
        if(this.numElem == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return this.numElem;
    }

    public Object top(){ 
        return this.pilha[numElem-1];
    }

    public boolean isPalindromo(){
        String dir = "", esq = "";
        for(int i = 0;i<this.numElem; i++){
            dir += this.pilha[i];
        }
        for(int i = this.numElem-1; i>=0; i--){
            esq += this.pilha[i];
        }
        if(dir.equals(esq)){
            return true;
        }
        else{
            return false;
        }
    }

    public void imprimeEstado(){
        for(int i = 0; i<this.numElem; i++)
        {
            System.out.println("Índice: "+i+" Valor: "+this.pilha[i]);
        }
    }
}
