/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CrazY MediA FilM
 */
public class BinaryTree {
    
     Node root;
        public BinaryTree(Node r){
            root=r;    
        }
        public Node getRoot(){
            return root;
        }
        public void SetRoot(Node r){
            root=r;
        }
        public void Display(){
            root.Output();
        }
    
}
