package Atividade_15;

public class ABB {
    private NohAB raiz;

    public ABB() {
        this.raiz = null;
    }

    public boolean isEmpty(){
        return this.raiz == null;
    }

    public void addRecursive(int element) {
        if (isEmpty())
        {
            this.raiz = new NohAB(element);
        }
        else {
            addRecursive(this.raiz, element);
        }
    }

    private void addRecursive(NohAB current, int valor) {
        if (valor < current.valor) {
            if (current.esq == null) {
                NohAB newNoh = new NohAB(valor);
                current.esq = newNoh;
                newNoh.pai = current;
                return;
            }
            addRecursive(current.esq, valor);
        }
        else {
            if (current.dir == null) {
                NohAB newNoh = new NohAB(valor);
                current.dir = newNoh;
                newNoh.pai = current;
                return;
            }
            addRecursive(current.dir, valor);
        }
    }

    public NohAB buscaRec(int element) {
        return buscaRec(this.raiz, element);
    }
    
    private NohAB buscaRec(NohAB current, int valor) {
        if (current == null) 
        {   
            return null;
        }
        if (valor == current.valor) 
        {
            return current;
        }
        if (valor < current.valor){
            return buscaRec(current.esq, valor);
        }
        else{
            return buscaRec(current.dir, valor);
        }
    }

    public NohAB raiz(){
        return this.raiz;
    }

    public int tamanho(NohAB raiz){
		if(raiz==null){
			return 0;
		}
		return 1 + tamanho(raiz.esq) + tamanho(raiz.dir);
	}

    public void inorder()
    {
        if (this.raiz == null) {
            return;
        }
 
        inorder(raiz.esq);
        System.out.print(raiz.toString() + "\n");
        inorder(raiz.dir);
    }

    private static void inorder(NohAB current){
        if (current == null) {
            return;
        }
        inorder(current.esq);
        System.out.print(current.toString() + "\n");
        inorder(current.dir);
    }
}
