package amazon;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int ar1[] = {1,3,5,7,9};
        int ar2[] = {2,4,6,8,10};
        int size1 = ar1.length,size2=ar2.length;
        int ar3[] = new int[size1+size2];
        int k=0,i=0,j=0;
        while(i<size1&&j<size2){
            if(ar1[i]<ar2[j]){
                ar3[k]=ar1[i];i++;k++;
            }else{
                ar3[k]=ar2[j];j++;k++;
            }
        }
        while(j<size1){
            ar3[k]=ar2[j];j++;k++;
        }
        while(i<size2){
            ar3[k]=ar1[i];i++;k++;
        }
        Arrays.stream(ar3).forEach(System.out::println);
    }
}
