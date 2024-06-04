public class AVLTree { 
    Node root; 
    Node Iterator;          //Se encarga de recorrer las direcciones de memoria de los nodos (Nodo por nodo). 
    int height(Node N) { 
        if (N == null) 
            return 0; 
        return N.height; 
    } 
  public  AVLTree(){   
    root= Iterator = null;
    }
    int max(int a, int b) { 
        return (a > b) ? a : b; 
    } 
  
    Node rightRotate(Node y) { 
        Node x = y.left; 
        Node T2 = x.right; 
  
        x.right = y; 
        y.left = T2; 
  
        y.height = max(height(y.left), height(y.right)) + 1; 
        x.height = max(height(x.left), height(x.right)) + 1; 
  
        // Return new root 
        return x; 
    } 
  
    Node leftRotate(Node x) { 
        Node y = x.right; 
        Node T2 = y.left; 
  
        y.left = x; 
        x.right = T2; 
  
        x.height = max(height(x.left), height(x.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 
  
        return y; 
    } 
  
    private int getBalance(Node N) { 
        if (N == null) 
            return 0; 
  
        return height(N.left) - height(N.right);  // This is the line that is different from the original code snippet (Español: Esta es la línea que es diferente del fragmento de código original)  
    } 
  
    public void insert (int key) { 
        if (root==null) 
        root= new Node(key); 
        else { 
            root = insert(root, key);

        } 
    }
    private Node insert(Node node, int key) { 
  
        if (node == null) 
            return (new Node(key)); 
  
        if (key < node.key) 
            node.left = insert(node.left, key); 
        else if (key > node.key) 
            node.right = insert(node.right, key); 
        else 
            return node; 
  
        node.height = 1 + max(height(node.left), 
                              height(node.right)); 

        int balance = getBalance(node); 

        if (balance > 1 && key < node.left.key) // Left Left Case: Significa que el nodo insertado es el hijo izquierdo del hijo izquierdo del nodo actual, por lo que se realiza una rotación a la derecha
            return rightRotate(node); 
  
        if (balance < -1 && key > node.right.key) //Significa que la rotación es a la izquierda porque el nodo insertado es el hijo derecho del hijo derecho del nodo actual
            return leftRotate(node); 
  
        if (balance > 1 && key > node.left.key) { //Signiifca que la rotación es a la izquierda porque el nodo insertado es el hijo derecho del hijo izquierdo del nodo actual
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
  
        if (balance < -1 && key < node.right.key) { //Significa que la rotación es a la derecha porque el nodo insertado es el hijo izquierdo del hijo derecho del nodo actual.
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
  
        return node; 
    } 
   
    public void preOrder() {                            //Método que se encarga de recorrer el árbol en preorden.
        preOrder(root);                                 //Se llama al método preOrder con el nodo raíz como parámetro.  
    }

    private void preOrder(Node node) {                  //Recorrido en preorden: Se imprime el valor del nodo actual, luego se mueve a la izquierda y a la derecha.
        if (node != null) {                            //Si el nodo actual es diferente de null, entonces se imprime el valor del nodo actual y se mueve a la izquierda y a la derecha.
            System.out.print(node.key + " ");         //Imprime el valor del nodo actual.
            preOrder(node.left); 
            preOrder(node.right); 
        } 
    }  

    public int max() { 
        return max(root); 
    } 
    private int max(Node node) { 
        if (node.right == null) 
            return node.key; 
        return max(node.right); 
    } 
    public void InOrder() { 
        preOrder(root); 
    }
}
    /* Function to do inorder traversal of AVL tree 
    private void InOrder(Node node) { 
        if (node != null) { 
            InOrder(node.left); 
            System.out.print(node.key + " "); 
            InOrder(node.right); 
        } 
    }
    /*public int max(){
        Iterator = root;
        while(Iterator.right != null){                  //Iterador derecha sea diferente de null, siempre y cuando iterador sea diferente a nul  se mueve/accede  a la derecha.
            Iterator = Iterator.right;                  //que significa derecha sea nula: Significa que no hay un nodo a la derecha del nodo actual.
        }
        return Iterator.key;                            //Retorna el valor del nodo actual.
    }
} 
/*Recursivamente la busqueda  del "max"

*/
/*    private void InOrder(Node node) { 
        if (node != null) { 
            InOrder(node.left); 
            System.out.print(node.key + " "); 
            InOrder(node.right); 
        } 
    }  
} 
 */