package Atividade_17;

class AVL {
    NohAB root;
  
    int height(NohAB N) {
      if (N == null)
        return 0;
      return N.height;
    }
  
    int max(int a, int b) {
      return (a > b) ? a : b;
    }
  
    NohAB rightRotate(NohAB y) {
      NohAB x = y.left;
      NohAB T2 = x.right;
      x.right = y;
      y.left = T2;
      y.height = max(height(y.left), height(y.right)) + 1;
      x.height = max(height(x.left), height(x.right)) + 1;
      return x;
    }
  
    NohAB leftRotate(NohAB x) {
      NohAB y = x.right;
      NohAB T2 = y.left;
      y.left = x;
      x.right = T2;
      x.height = max(height(x.left), height(x.right)) + 1;
      y.height = max(height(y.left), height(y.right)) + 1;
      return y;
    }
  
    int getBalanceFactor(NohAB N) {
      if (N == null)
        return 0;
      return height(N.left) - height(N.right);
    }
    public void insertValue(int valor){
        this.root = insertNohAB(this.root, valor);
    }
    private NohAB insertNohAB(NohAB NohAB, int valor) {
  
      if (NohAB == null)
        return (new NohAB(valor));
      if (valor < NohAB.valor)
        NohAB.left = insertNohAB(NohAB.left, valor);
      else if (valor > NohAB.valor)
        NohAB.right = insertNohAB(NohAB.right, valor);
      else
        return NohAB;
  
      NohAB.height = 1 + max(height(NohAB.left), height(NohAB.right));
      int balanceFactor = getBalanceFactor(NohAB);
      if (balanceFactor > 1) {
        if (valor < NohAB.left.valor) {
          return rightRotate(NohAB);
        } else if (valor > NohAB.left.valor) {
          NohAB.left = leftRotate(NohAB.left);
          return rightRotate(NohAB);
        }
      }
      if (balanceFactor < -1) {
        if (valor > NohAB.right.valor) {
          return leftRotate(NohAB);
        } else if (valor < NohAB.right.valor) {
          NohAB.right = rightRotate(NohAB.right);
          return leftRotate(NohAB);
        }
      }
      return NohAB;
    }
  
    NohAB NohABWithMimumValue(NohAB NohAB) {
      NohAB current = NohAB;
      while (current.left != null)
        current = current.left;
      return current;
    }

    NohAB deleteNohAB(NohAB root, int valor) {
      if (root == null)
        return root;
      if (valor < root.valor)
        root.left = deleteNohAB(root.left, valor);
      else if (valor > root.valor)
        root.right = deleteNohAB(root.right, valor);
      else {
        if ((root.left == null) || (root.right == null)) {
          NohAB temp = null;
          if (temp == root.left)
            temp = root.right;
          else
            temp = root.left;
          if (temp == null) {
            temp = root;
            root = null;
          } else
            root = temp;
        } else {
          NohAB temp = NohABWithMimumValue(root.right);
          root.valor = temp.valor;
          root.right = deleteNohAB(root.right, temp.valor);
        }
      }
      if (root == null)
        return root;
  
      root.height = max(height(root.left), height(root.right)) + 1;
      int balanceFactor = getBalanceFactor(root);
      if (balanceFactor > 1) {
        if (getBalanceFactor(root.left) >= 0) {
          return rightRotate(root);
        } else {
          root.left = leftRotate(root.left);
          return rightRotate(root);
        }
      }
      if (balanceFactor < -1) {
        if (getBalanceFactor(root.right) <= 0) {
          return leftRotate(root);
        } else {
          root.right = rightRotate(root.right);
          return leftRotate(root);
        }
      }
      return root;
    }
  
    void preOrder(NohAB NohAB) {
      if (NohAB != null) {
        System.out.print(NohAB.valor + " ");
        preOrder(NohAB.left);
        preOrder(NohAB.right);
      }
    }

    public void printTree(NohAB currPtr, String indent, boolean last) {
      if (currPtr != null) {
        
        if (last) {
          System.out.print("Direita:");
        } else {
          System.out.print("Esquerda:");
        }
        System.out.println(currPtr.valor);
        printTree(currPtr.left, indent, false);
        printTree(currPtr.right, indent, true);
      }
    }
}
