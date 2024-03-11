import java.util.Scanner;
class Node{
    int data;
    Node left ;
    Node right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class BalanceBT{
Node root;
boolean isBalanced(Node node){
    int lh;
    int rh;
    if(node==null)
    return true;
    lh=height(node.left);
    rh=height(node.right);
    if(Math.abs(lh-rh)<=1 && isBalanced(node.left) && isBalanced(node.right)){
        return true;
    }
    else 
    return false;
}
static int height(Node node){
    if(node==null)
    return 0;
    return 1+Math.max(height(node.left),height(node.right));
 }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    BalanceBT bt=new BalanceBT();
    System.out.println("Enter the tree values:");
    bt.root=new Node(sc.nextInt());
    bt.root.left=new Node(sc.nextInt());
    bt.root.right=new Node(sc.nextInt());
    bt.root.left.left=new Node(sc.nextInt());
    bt.root.left.right=new Node(sc.nextInt());
    bt.root.left.left.left=new Node(sc.nextInt());
    bt.root.right.right=new Node(sc.nextInt());
    if(bt.isBalanced(bt.root))
    System.out.println("Balanced");
    else
    System.out.println("Imbalanced");
   sc.close();

}
}