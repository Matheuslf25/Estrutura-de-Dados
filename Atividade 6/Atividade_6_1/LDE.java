package Atividade_6_1;

public class LDE implements iLista {//TAD Lista simplesmente encadeada
    private Noh inicio;
    private Noh fim;
    public LDE (){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        Noh novo = new Noh(info);
        if (inicio == null){
            inicio = novo;
            fim = novo;
        }
        else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
     }

    public void insereFim(int info) { 
        Noh novo = new Noh(info);
        if (fim == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }

    public boolean estahVazia() {
        if(tamanho() == 0){
            return true;
        }
        return false;
     }

    public boolean remove(int info) {
        Noh p = inicio;
        p = busca(p, info);
        if (p==null){ 
            return false;
        }
        if (p.getAnt() == null){ 
            inicio = p.getProx();
            inicio.setAnt(null);
        } 
        else if (p.getProx() == null){ 
            p.getAnt().setProx(null);
            fim = p.getAnt();
        } 
        else { 
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;
     }

    public int tamanho() {         
        Noh p = inicio;
        int i = 0;
        while (p!=null){ 
            p = p.getProx();
            i++;
        }
        return i;
    }
    
    public Noh busca(Noh p, int info){
        while (p!=null && p.getInfo() != info){//busca
            p = p.getProx();
        }
        return p;
    }

    public void imprime()
    {
        Noh p = inicio;
        while (p!=null){
            System.out.println(p.getInfo());
            p = p.getProx();
        }

        Noh f = fim;
        while (f!=null){
            System.out.println(f.getInfo());
            f = f.getAnt();
        }
    }
}
