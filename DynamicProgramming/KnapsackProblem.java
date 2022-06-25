package amazon.DynamicProgramming;

public class KnapsackProblem {
    static int t[][];
    public static void main(String[] args) {
        int wt[] = {2,3,2,4,5};
        int val[]={1,2,3,4,5};
        int W=12;
        int n=5;
        t=new int[W+1][n+1];
        for(int i=0;i<W+1;i++){
            for(int j=0;j<n+1;j++){
                t[i][j]=-1;
            }
        }
        System.out.println(knapsack(wt,val,W,n));
    }
    public static int knapsack(int wt[],int val[],int w,int n){
        if(n==0||w==0){
            return 0;
        }
        if(t[w][n]!=-1){
            return t[w][n];
        }
        if(wt[n-1]<=w)
            return t[w][n]=val[n-1]+knapsack(wt,val,w-wt[n-1],n-1);
        else
            return knapsack(wt,val,w,n-1);

    }
}

