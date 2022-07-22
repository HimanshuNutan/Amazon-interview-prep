package amazon;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
//        list.InOrder(list.head);

        LinkedList list1 = new LinkedList();
        list1.insertAtLast(15);
        list1.insertAtLast(25);
        list1.insertAtLast(35);
        list1.insertAtLast(45);
//        list1.InOrder(list1.head);

        LinkedList list2 = new LinkedList();
        int i=0,j=0;
        LinkedList.Node head1,head2;
        head1 = list.head;
        head2 = list1.head;
        while(head1!=null&&head2!=null){
           if(head1.data<head2.data){
               list2.insertAtLast(head1.data);
               head1 = head1.next;
           }else{
               list2.insertAtLast(head2.data);
               head2 = head2.next;
           }
        }
        while(head1!=null){
            list2.insertAtLast(head1.data);
            head1 = head1.next;
        }
        while(head2!=null){
            list2.insertAtLast(head2.data);
            head2 = head2.next;
        }
        list2.InOrder(list2.head);
    }
}
class LinkedList{
     Node head;
    static class Node{
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node next;

    }

    public void insertAtLast(int data){
        Node new_node = new Node(data);

        if(head==null){
            head=new_node;
        }else{
            Node node = head;
            while(node.next!=null){
                node = node.next;
            }
            node.next=new_node;
        }
    }

    public void InOrder(Node node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
    public int size(){
        int count =0;
        Node node = head;
        while(node!=null){
            count++;
            node = node.next;
        }
        return count;
    }
}
