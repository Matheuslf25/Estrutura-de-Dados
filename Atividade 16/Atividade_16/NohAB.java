package Atividade_16;

public class NohAB {
    int valor;
	NohAB esq;
	NohAB dir;
    NohAB pai;

    NohAB(int valor){
        this.valor = valor;
        dir = null;
        esq = null;
        pai = null;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NohAB getEsq() {
        return this.esq;
    }

    public void setEsq(NohAB esq) {
        this.esq = esq;
    }

    public NohAB getDir() {
        return this.dir;
    }

    public void setDir(NohAB dir) {
        this.dir = dir;
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
