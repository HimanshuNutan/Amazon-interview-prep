import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DutchNationalFlag {
    //sort an array where al elements are 0, 1 or 2
    public static void main(String[] args) {
        int ar[]={1,2,1,1,0,1,0,2,1,0,0,1,2,2,1,2,2,1,0};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<ar.length;i++){
            map.put(ar[i],map.getOrDefault((ar[i]),1)+1);
        }int j=0,count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            while(count<entry.getValue()&&j<ar.length){
                ar[j] = entry.getKey();j++;count++;
            }count=0;
        }
        System.out.println(Arrays.toString(ar));
    }
}
