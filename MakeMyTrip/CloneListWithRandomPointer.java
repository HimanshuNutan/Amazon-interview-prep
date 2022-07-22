import java.util.LinkedHashMap;
import java.util.Map;

public class CloneListWithRandomPointer {
    public static void main(String[] args) {
        LLR list = new LLR();
        NodeR node1 = new NodeR(10);
        NodeR node2 = new NodeR(20);
        NodeR node3 = new NodeR(30);
        NodeR node4 = new NodeR(40);
        NodeR node5 = new NodeR(50);
        list.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.random = node5;
        node2.random = node4;
        node3.random = node1;
        node5.random = node2;
        LLR list2 = list.cloneList();
        NodeR temp = list2.head;
        while(temp!=null){
            System.out.println("Data: "+temp.data);
            if(temp.next!=null)
                System.out.println("Next: " + temp.next.data);

            if(temp.random!=null)
            System.out.println("Random: "+temp.random.data);

            temp = temp.next;
            System.out.println("");
        }
    }
}
class NodeR{
    int data;
    NodeR next;
    NodeR random;

    public NodeR(int data) {
        this.data = data;
        this.next = this.random = null;
    }

}
class LLR{
    NodeR head;
    public LLR cloneList(){
        LLR list1 = new LLR();
        LinkedHashMap<NodeR,NodeR> map = new LinkedHashMap<>();
        NodeR temp = head;
        if(temp == null){
            return list1;
        }
        while(temp!=null){
            NodeR node1 = new NodeR(temp.data);
            map.put(temp,node1);temp = temp.next;
        }
        for(Map.Entry<NodeR,NodeR> e:map.entrySet()){
            e.getValue().next = map.get(e.getKey().next);
            e.getValue().random = map.get(e.getKey().random);
        }
        for(Map.Entry<NodeR,NodeR> e:map.entrySet()){
            if(list1.head==null){
                list1.head = e.getValue();
            }
        }
        return list1;
    }
}
