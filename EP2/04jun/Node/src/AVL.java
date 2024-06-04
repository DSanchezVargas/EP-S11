public class AVL {

    public static void main(String[] args) { 
        AVLTree tree = new AVLTree(); 
  
        /* Constructing tree given in the above figure */
        tree.insert(10); 
        tree.insert(20); 
        tree.insert(30); 
        tree.insert(40); 
        tree.insert(50); 
        tree.insert(25); 
        System.out.println("Resultado: ");
  
        /* The constructed AVL Tree would be 
             30 
            /  \ 
          20   40 
         /  \     \ 
        10  25    50 
        ---------------------------------------------------------
             2 
            /  \ 
           1    3 
        Orden 1-2-3
        Preordem: 2-1-3
        PostOrden: 1-3-2*/

        tree.preOrder(); 
        System.out.println("Max: "+tree.max());

    } 

//multiples caminos se usa recursividad o colas
/*un solo camino se usa iterator */
} 