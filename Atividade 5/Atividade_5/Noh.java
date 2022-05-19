package Atividade_5;

public class Noh {
    private Object objeto;
    private Noh prox;
    public Noh (Object objeto){
    this.objeto = objeto;
    this.prox = null;
    }
    public Object getInfo() { 
        return this.objeto;
     }
    public Noh getProx() { 
        return this.prox;
     }
    public void setProx(Noh n) { 
        this.prox = n; 
    }
}
