package Practice1_Amazon.Maths;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int ar[] = {8,5,1,2,9,4,6,7};
        int sum = Arrays.stream(ar).sum();
        int n =ar.length+1;
        int expSum = (n*(n+1))/2;
        System.out.println(expSum-sum);
    }
}
