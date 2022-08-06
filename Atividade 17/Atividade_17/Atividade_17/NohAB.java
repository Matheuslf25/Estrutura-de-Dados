package Atividade_17;


public class NohAB {
    int valor;
	NohAB left;
	NohAB right;
    NohAB pai;
    int height;

    NohAB(int valor){
        this.valor = valor;
        right = null;
        left = null;
        pai = null;
        height = 1;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NohAB getleft() {
        return this.left;
    }

    public void setleft(NohAB left) {
        this.left = left;
    }

    public NohAB getright() {
        return this.right;
    }

    public void setright(NohAB right) {
        this.right = right;
    }

    public NohAB getPai() {
        return this.pai;
    }

    public void setPai(NohAB pai) {
        this.pai = pai;
    }

    public String toString() {
		return String.valueOf(valor);
	}
}
