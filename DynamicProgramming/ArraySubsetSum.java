package amazon.DynamicProgramming;

public class ArraySubsetSum {
    public static void main(String[] args) {
        int ar[] = {1,2,3,5,7,8,11,19};
        int sum=11;
        int n=ar.length;
        int t[][] = new int[n + 2][sum + 2];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j]=0;
                }
                if(j==0){
                    t[i][j]=1;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(ar[i-1]<=j){
                    t[i][j]=t[i-1][j-ar[i-1]]+t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        System.out.println(t[n][sum]);
    }
}
