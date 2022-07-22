package amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.

Example :

Input : [2, 1, 2]
Return  : 2 which occurs 2 times which is greater than 3/2.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int ar[]={2,1,2,1,1,3,3,3,3,3,3};
        System.out.println(majority(ar));
    }
    public static int majority(int A[]){
        Map<Integer, Long> map = new HashMap();
        int element=-1;
        map = Arrays.stream(A).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(int i: map.keySet()){
            if(map.get(i)>A.length/2){
                element=i;
            }
        }
        return element;
    }
}
