package Atividade_17;

public class Main {
    public static void main(String args[]){
        AVL tree = new AVL();

        for(int i = 0; i < 50; i++){
            tree.insertValue(i+1);
        }
        tree.printTree(tree.root, "", true);
    }
}
