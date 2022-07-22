package Practice1_Amazon.Array;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int d=3;
        int n=12;
        int gcd = GCD(n,d);
        int ar[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int k=0,j;
        for(int i=0;i<gcd;i++){
            int temp = ar[i];
            j=i;
            while(true){
                k=j+d;
                if(k>=n)k=k-n;
                if(k==i)break;
                ar[j]=ar[k];
                j=k;
            }
            ar[j]= temp;
        }
        Arrays.stream(ar).forEach(System.out::println);
    }
    public static int GCD(int a,int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
    public static int GCD1(int a,int b){
       return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
}
