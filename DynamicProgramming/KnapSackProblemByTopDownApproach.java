package amazon.DynamicProgramming;

public class KnapSackProblemByTopDownApproach {
    static int t[][];
    public static void main(String[] args) {
        int wt[] = {2,3,2,4,5};
        int val[]={1,2,3,4,5};
        int W=12;
        int n=5;
        t=new int[n+1][W+1];
        System.out.println(knapsack(wt,val,W,n));
    }
    public static int knapsack(int wt[],int val[],int w,int n){
    for(int i=0;i<n+1;i++){
        for(int j=0;j<w+1;j++){
            if(i==0||j==0){
                t[i][j]=0;
            }
        }
    }
    for(int i=1;i<n+1;i++){
        for(int j=1;j<w+1;j++){
            if(wt[i-1]<=j){
                t[i][j]=max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
            }
            else
                t[i][j]=t[i-1][j];
        }
    }
    return t[n][w];
    }
    public static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
}
