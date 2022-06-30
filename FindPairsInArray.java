import java.util.Arrays;
import java.util.HashSet;

public class FindPairsInArray {
    /*
    Find all pairs in array where diff is 2
     */
    public static void main(String[] args) {
        int ar[] = {1,7,5,9,2,12,3};
        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.stream(ar).forEach(i->{
            if(set.contains(i-2)){
                System.out.println(i+", "+(i-2));
            }
            if(set.contains(i+2)){
                System.out.println(i+", "+(i+2));
            }
            set.add(i);
        });


    }
}
