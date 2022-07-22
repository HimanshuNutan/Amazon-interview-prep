package amazon;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesPrime {
    public static void main(String[] args) {
        int ar[] = {2,3,5,7,7,13,13,3,3,3};
        removeDuplicates(ar).stream().forEach(System.out::println);
    }
    public static List<Integer> removeDuplicates(int ar[]){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(!list.contains(ar[i])){
                list.add(ar[i]);
            }
        }
        return list;
    }
}

