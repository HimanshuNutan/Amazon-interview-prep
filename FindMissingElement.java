package amazon;

public class FindMissingElement {
    public static void main(String[] args) {

        int ar[] = {6,7,8,4,1,2,3};
        int sum=0,expSum=0;
        for(int i=0;i<ar.length;i++){
            sum = sum +ar[i];
        }
        expSum = ((ar.length+1)*(ar.length+2))/2;
        System.out.println(expSum-sum);
    }
}
