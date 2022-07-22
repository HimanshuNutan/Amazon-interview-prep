package amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

1. Each child must have at least one candy.
2. Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

Input Format:

The first and the only argument contains N integers in an array A.
Output Format:

Return an integer, representing the minimum candies to be given.
Example:

Input 1:
    A = [1, 2]

Output 1:
    3

Explanation 1:
    The candidate with 1 rating gets 1 candy and candidate with rating cannot get 1 candy as 1 is its neighbor.
    So rating 2 candidate gets 2 candies. In total, 2 + 1 = 3 candies need to be given out.

Input 2:
    A = [1, 5, 2, 1]

Output 2:
    7

Explanation 2:
    Candies given = [1, 3, 2, 1]
 */
public class DistributeCandy {
    public static void main(String[] args) {
//        int ar[] = {100,102,103,99,98};
        int ar[] = {98,99,102,103,100,-100};
        System.out.println(candy(ar));
    }
    public static int candy(int[] A) {
        int candy[] = new int[A.length];
        Arrays.fill(candy,1);
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                while(candy[i]<=candy[i-1]){
                    candy[i]++;
                }
            }
        }
        for(int i=A.length-2;i>=0;i--){
            if(A[i]>A[i+1]){
                while (candy[i] <= candy[i+1]){
                    candy[i]++;
                }
            }
        }
       return Arrays.stream(candy).sum();
    }
}
