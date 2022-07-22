//package amazon;
//
//public class NearestElementBST {
//    public static void main(String[] args) {
//        BinarySearchTreePractice tree = new BinarySearchTreePractice();
//        Node root = new Node(10);
////        tree.root = root;
////        tree.insertNode(4);
////        tree.insertNode(44);
////        tree.insertNode(14);
//////        tree.InOrder(tree.root);
////        tree.findClosestNode(13);
//    }
//}
//class Node{
//    Node left;
//    int data;
//    Node right;
//
//    public Node(int data) {
//        this.data = data;
//        this.left=null;
//        this.right=null;
//    }
//}
//class BinarySearchTree{
//    Node root;
//    Node closest = null;int diff=0,diff1=Integer.MAX_VALUE;boolean flag = false;
//    public boolean isEmpty(){
//        return (root == null);
//    }
//public void insertNode(int data){
//    if(isEmpty()){
//        root = new Node(data);
//    }else{
//        insertNode(data,root);
//    }
//    }
//    public void insertNode(int data, Node node){
//        if(data<node.data){
//            if(node.left==null) {
//            Node new_node = new Node(data);
//            node.left = new_node;
//            }
//            else{
//                insertNode(data,node.left);
//            }
//        } else if(data>node.data){
//            if(node.right==null){
//                Node new_node = new Node(data);
//                node.right = new_node;
//            }
//            else{
//                insertNode(data,node.right);
//            }
//        }
//}
//public void InOrder(Node node){
//        if(node!=null){
//            InOrder(node.left);
//            System.out.println(node.data);
//            InOrder(node.right);
//        }
//}
//public void findClosestNode(int n){
//    findClosestNode(n,root);
//    System.out.println("Closest node is "+closest.data+" and difference is "+diff1);
//
//}
//public void findClosestNode(int n,Node node){
//
//        if(isEmpty()){
//            System.out.println("Not found");
//        }else{
//            if(node.data==n){
//                System.out.println("Node found in tree "+node.data);flag = true;
//            }else{
//                diff = Math.abs(node.data-n);
//                if(diff<diff1){
//                    diff1=diff;
//                    closest=node;}
//                if(node.left!=null)
//                findClosestNode(n,node.left);
//                if(node.right!=null)
//                findClosestNode(n,node.right);
//            }
//        }
//}
//}
