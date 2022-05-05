public class PontoCartesiano {
    private Ponto pontosA;
    private Ponto pontosB;

    public PontoCartesiano(Ponto pontosA, Ponto pontosB){
        this.pontosA = pontosA;
        this.pontosB = pontosB;
    }

    public Ponto getPontosA() {
        return this.pontosA;
    }

    public void setPontosA(Ponto pontosA) {
        this.pontosA = pontosA;
    }

    public Ponto getPontosB() {
        return this.pontosB;
    }

    public void setPontosB(Ponto pontosB) {
        this.pontosB = pontosB;
    }

    public double dE(){
        double xA = pontosA.getX();
        double xB = pontosB.getX();

        double yA = pontosA.getY();
        double yB = pontosB.getY();

        double xAB = xB-xA, yAB = yB-yA;
        double xQ = Math.pow(xAB, 2);
        double yQ = Math.pow(yAB, 2);

        double DE = Math.sqrt(xQ+yQ);
        return DE;
    }
}
