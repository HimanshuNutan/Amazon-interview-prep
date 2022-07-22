package amazon.DynamicProgramming;

public class EqualPartitionArray {
    static boolean subsetFlag=false,eqalPartFlag=false;
    static boolean t[][];
    public static void main(String[] args) {
        int ar[] = {1,5,11,5,1,1};
        System.out.println(equalPart(ar,ar.length));
    }
    public static boolean equalPart(int ar[], int n){
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+ar[i];
        }
        if(sum%2!=0){
            return false;
        }else {
            t=new boolean[ar.length+1][(sum/2)+1];
            return isSubsetPossible(ar,sum/2);
        }

    }
    public static boolean isSubsetPossible(int ar[],int sum){
        int n=ar.length;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j]=false;
                }
                if(j==0){
                    t[i][j]=true;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(ar[i-1]<=j){
                    t[i][j]=t[i-1][j-ar[i-1]]||t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

return t[n][sum];
    }
}
