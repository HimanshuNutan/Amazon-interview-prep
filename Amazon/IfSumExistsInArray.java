package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class IfSumExistsInArray {
    static boolean flag = false;
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,8,9,11};
        int sum = 21;
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
        set.addAll(list);
        list.stream().filter(i->set.contains(sum-i)).forEach(i->{
            setFlagTrue();
        });
        if(flag)
            System.out.println("sum possible");
            else
            System.out.println("sum not possible");
        }


    private static void setFlagTrue() {
        flag = true;
    }
}
