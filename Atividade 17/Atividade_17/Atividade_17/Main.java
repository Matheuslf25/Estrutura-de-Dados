package Atividade_17;

public class Main {
    public static void main(String args[]){
        AVL tree = new AVL();

        tree.insertValue(51);
        tree.insertValue(57);
        tree.insertValue(98);
        tree.insertValue(19);
        tree.insertValue(11);
        tree.insertValue(45);
        tree.insertValue(79);
        tree.printTree(tree.root, "", true);
    }
}
