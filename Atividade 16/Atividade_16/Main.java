package Atividade_16;

public class Main {
    public static void main(String args[]){
        ABB tree = new ABB();

        for(int i = 0; i < 50; i++){
            tree.addRecursive(i+1);
        }
        tree.inorder();
        
        for(int i = 50; i >= 25; i--){
            tree.delete(i+1);
        }
        tree.inorder();
    }
}
