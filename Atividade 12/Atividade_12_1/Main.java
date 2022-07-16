package Atividade_12_1;

public class Main {
    public static void main(String args[]){
        PilhaVet pilhaVetPL = new PilhaVet(10);
        pilhaVetPL.Push("a");
        pilhaVetPL.Push("r");
        pilhaVetPL.Push("a");
        pilhaVetPL.Push("r");
        pilhaVetPL.Push("a");

        System.out.println(pilhaVetPL.isPalindromo()); 
        pilhaVetPL.imprimeEstado();
    }
}
