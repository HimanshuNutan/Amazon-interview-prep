import java.util.*;

public class LRUCache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Capacity");
        int capacity = sc.nextInt();
        LRUCacheUtil cache = new LRUCacheUtil(capacity);
        System.out.println("Test Cases");
        int q = sc.nextInt();
        while(q-->0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            cache.query(i,j);
        }
    }
}
class LRUCacheUtil{
    HashMap<Integer,Integer> map = new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();
    int capacity;
    public LRUCacheUtil(int c){
        capacity = c;
    }
    public void query(int a,int b){
        if(a==-1){
            if(map.containsKey(b))
            { System.out.println(map.get(b));
            return;
            }
            System.out.println("-1");
        }else{
            if(list.size()>=capacity){
               int k = list.removeLast();
               map.remove(k);
            }
            list.addFirst(a);
            map.put(a,b);
        }

    }
}