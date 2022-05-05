public class Main {
    public static void main(String args[]){
            Ponto ponto1 = new Ponto(10, 10);
            Ponto ponto2 = new Ponto(12, 12);

            PontoCartesiano pontos = new PontoCartesiano(ponto1, ponto2);
            System.out.println(pontos.dE());

        }
}
