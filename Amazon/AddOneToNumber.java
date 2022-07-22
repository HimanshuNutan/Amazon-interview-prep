import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AddOneToNumber {
    public static void main(String[] args) {
        int ar[]={9,9,9,9,9};
        int ar1[]=new int[ar.length+1];
        int carry=0,i=ar.length-1;
        ar = add(ar,0);
        Arrays.stream(ar).forEach(System.out::println);
    }
    public static int[] add(int[] ar, int k){
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(ar).forEach(i->list.add(i));
        Collections.reverse(list);int carry=1;
        for(int i=0;i<list.size();i++){
            if(carry!=0){
                list.set(i,list.get(i)+carry);
            }
            carry=list.get(i)/10;
            if(carry!=0){
                list.set(i,list.get(i)%10);
            }
        }
        if(carry != 0)
            list.add(carry);
        Collections.reverse(list);
        ar=list.stream().mapToInt(i->i).toArray();
        return ar;

    }
}
