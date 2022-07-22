public class ReverseLinkedList {
    public static void main(String[] args) {

        LL list = new LL();
        list.addNodeAtFirst(10);
        list.addNodeAtFirst(20);
        list.addNodeAtFirst(30);
        list.addNodeAtFirst(40);
        list.reverseList();
        list.printList();
    }
}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LL{
    Node head;
    public void reverseList(){
        Node temp = head;int count=0;
        while(temp!=null){
            addNodeAtFirst(temp.data);count++;
            temp =temp.next;
        }
        temp = head;int j=1;
        while(j<count){
            j++;
            temp = temp.next;
        }
        temp.next = null;
    }
    public void addNodeAtLast(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void addNodeAtFirst(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }else {
            Node temp = head;
            head = new_node;
            new_node.next = temp;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}