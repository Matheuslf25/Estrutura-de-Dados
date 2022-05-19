package Atividade_5;

public class LSE implements iLista {//TAD Lista simplesmente encadeada
    private Noh inicio;
    public LSE (){
        this.inicio = null;
    }
    public void insereInicio(Object objeto) { 
        Noh novo = new Noh(objeto);
        if (inicio == null){
            inicio = novo;
        }
        else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public void insereFim(Object objeto) { 
        Noh novo = new Noh(objeto);
        if (inicio == null){
            inicio = novo;
        }
        else {
        Noh ultimo;
            for(Noh i=inicio; i != null; i=i.getProx()){
                ultimo = i;
                ultimo.setProx(novo);
            }
        }
    }

    public boolean remove(Object objeto) { 
        Noh ant, p;
        p = inicio;
        ant = null;
        while (p!=null && p.getInfo() != objeto){ //busca
            ant = p;
            p = p.getProx();
        }
        if (p==null){
            return false;
        }
        if (ant == null){//retira info do início
            inicio = p.getProx();
        }
        else{
            ant.setProx(p.getProx());
        }
        return true;
    }

    public void imprime(){
        Noh p = inicio;
        while (p!=null){ //busca
            
            System.out.println("Teste"+p);
            p = p.getProx();
        }
    }
}
