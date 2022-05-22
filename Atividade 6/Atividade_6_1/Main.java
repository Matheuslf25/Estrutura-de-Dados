package Atividade_6_1;

public class Main {
    public static void main(String args[]){
        LDE l = new LDE();
        l.insereInicio(10);
        l.insereFim(15);
        l.insereFim(30);
        System.out.println(l.estahVazia());
        System.out.println(l.tamanho());
        l.imprime();
        l.remove(30);
        l.remove(15);
        System.out.println(l.tamanho());
        l.insereInicio(14);
        l.imprime();
        System.out.println(l.estahVazia());
    }
}
