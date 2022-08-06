package Atividade_16;

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

    public NohAB delete(int value) {
        NohAB curr = this.raiz;
        NohAB pai = null;

        while (curr != null && curr.valor != value)
        {
            pai = curr;
            if (value < curr.valor) {
                curr = curr.esq;
            }
            else {
                curr = curr.dir;
            }
        }

        if (curr == null) {
            return this.raiz;
        }

        if (curr.esq == null && curr.dir == null)
        {
            if (curr != raiz)
            {
                if (pai.esq == curr) {
                    pai.esq = null;
                }
                else {
                    pai.dir = null;
                }
            }
            else {
                raiz = null;
            }
        }
        else if (curr.esq != null && curr.dir != null)
        {
            NohAB successor = getMinimumKey(curr.dir);

            int val = successor.valor;
 
            delete(successor.valor);

            curr.valor = val;
        }
        else {
            NohAB child = (curr.esq != null)? curr.esq: curr.dir;
 
            if (curr != raiz)
            {
                if (curr == pai.esq) {
                    pai.esq = child;
                }
                else {
                    pai.dir = child;
                }
            }
            else {
                raiz = child;
            }
        }
        return raiz;
    }

        
    public static NohAB getMinimumKey(NohAB current)
        {
            while (current.esq != null) {
                current = current.esq;
            }
            return current;
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
