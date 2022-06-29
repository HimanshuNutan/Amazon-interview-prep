package Practice1_Amazon.Maths;

import java.util.Arrays;

/*
Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
 */
public class SmallestPossibleInteger {
    public static void main(String[] args) {
        int arr2[] = {1, 2, 6, 10, 11, 15};
        System.out.println(smallestPossibleInt(arr2));

    }

    public static int smallestPossibleInt(int ar[]) {
        Arrays.sort(ar);
        int res = 1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > res) {
                return res;
            } else {
                res = res+ar[i];
            }
        }
        return res;
    }
}
