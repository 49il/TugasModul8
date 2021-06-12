/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8;

/**
 *
 * @author user
 */
public class No1_APP {
    public static void main(String[] args) {
        No1 tree = new No1();
    
        No1_Node node;
    
        node = new No1_Node('D');
        tree.insert(node);
    
        node = new No1_Node('B');
        tree.insert(node);
    
        node = new No1_Node('A');
        tree.insert(node);
    
        node = new No1_Node('C');
        tree.insert(node);
    
        node = new No1_Node('F');
        tree.insert(node);
    
        node = new No1_Node('E');
        tree.insert(node);
    
        node = new No1_Node('G');
        tree.insert(node);
    
        System.out.print("Traversal dengan preorder : ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder : ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inorder : ");
        tree.inOrder();
        System.out.println();
        
        System.out.println("");
        System.out.println("Agil said Ramadon");
        System.out.println("Nim:20090061");
        System.out.println("Kelas:2A");
    }
}
