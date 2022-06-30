import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8};
        int d=3,j,k,m=ar.length;
        int n=gcd(ar.length,d);
        for(int i=0;i<n;i++){
            int temp = ar[i];
            j=i;
            while(true){
             k=j+d;
             if(k>=m)k=k-m;
             if(k==i)break;
             ar[j]=ar[k];
             j=k;
            }
            ar[j]=temp;
        }
        System.out.println(Arrays.toString(ar));
    }

    private static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
