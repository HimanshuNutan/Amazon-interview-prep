public class AddingNumberList {
    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();
        int n = 132,m=541;
        while(n >0){
            list1.addNodeAtLast(n%10);n/=10;
        }

        while(m >0){
            list2.addNodeAtLast(m%10);m/=10;
        }
        LL list3 = list1.add(list1,list2);
        list3.printList();
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
    public LL add(LL list1, LL list2){
        LL list3 = new LL();
        list1.reverseList();
        list2.reverseList();
        Node temp1 =list1.head,temp2 = list2.head;
        int carry=0,sum=0;
        while(temp1!=null&&temp2!=null){
            sum = temp1.data+temp2.data+carry;
            if(sum>9){carry = sum/10;sum=sum%10;}
            list3.addNodeAtLast(sum);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return list3;
    }
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
