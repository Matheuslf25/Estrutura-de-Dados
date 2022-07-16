package Atividade_12_2;

public class PilhaLista implements IPilha {
    private Noh topo;
    private int numElem;

    public PilhaLista (){ //construtor
        this.topo = null;
    }
    
    public boolean isEmpty(){
        if(this.topo == null){
            return true;
        }
        else{ 
            return false;
        }
    }

    public int size(){
        return this.numElem;
    }

    public boolean Push(Object info){ //empilha
        Noh novo = new Noh(info);
        if (this.isEmpty())
            {
                topo = novo;
                this.numElem = 1;
            }
        else 
            {
                novo.setProx(topo);
                topo = novo;
                this.numElem++;
            }

        return true;
    }

    public Object Pop(){ //desempilha
        Object info = null;
        if (!this.isEmpty()){
            info = topo.getInfo();
            topo = topo.getProx();
            this.numElem--; 
        }
        return info;
    }

    public Object top(){
        return this.topo;
    }

    public void imprimeEstado(){
        for(int i = 0; i<this.size(); i++){
            Aluno aluno = (Aluno) topo.getInfo();
            System.out.println("Índice: "+i+" Valor: "+aluno.getNome());
            topo = topo.getProx();
        }
    }
}
