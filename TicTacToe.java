import java.util.Scanner;

public class TicTacToe {
    static Scanner scanner = new Scanner(System.in);
    static String winner="";static boolean game = true;static int turn =0;
    public static void main(String[] args) {

        int n = 3;
        int ar[][]= new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ar[i][j]=-1;
            }
        }
        while(game){
            if(turn%2==0&&winner.equals("")) {
                ar = turnForX(ar);turn++;
                printArray(ar);
            }else{
                if(winner.equals(""))
                {ar = turnForO(ar);turn++;
                    printArray(ar);
                }
                else{
                    System.out.println("Winner - "+winner);
                }
            }
        }
    }

    private static void printArray(int[][] ar) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(ar[i][j]==1)
                System.out.print("X ");
                else if(ar[i][j]==0)
                    System.out.print(ar[i][j]+" ");

                else
                    System.out.print("| ");
            }
            System.out.println("");
        }
    }

    private static int[][] turnForO(int[][] ar) {
        System.out.println("Choose Index for 0");
        boolean played = false;
        while(!played) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (ar[a][b] != 0 || ar[a][b] != 1)
            {
                ar[a][b] = 0;played=true;
            }
        }
        if(winForO(ar)){winner = "Player O";System.out.println(winner);game=false;}
        return ar;
    }

    private static boolean winForO(int[][] ar) {
        int n=ar.length,i,j=0;boolean vertical =false,horizontal=false,diagonal1=true
                ,diagonal2=true;
        for(i=0;i<n;i++){
            while(j<n&&ar[i][j]==0){
                j++;
            }
            if(j==n){vertical=true; break;}
            else j=0;
        }i=0;j=0;
        for(j=0;j<n;j++){
            while(i<n&&ar[i][j]==0){
                i++;
            }
            if(i==n){horizontal=true; break;}
            else i=0;
        }i=0;j=0;
        for(i=0;i<n;i++){
            j=i;
            if(ar[i][j]!=0){
                diagonal1=false;break;
            }
        }i=0;j=0;
        for(i=0;i<n;i++){
            j=2-i;
            if(ar[i][j]!=0){
                diagonal2=false;break;
            }
        }i=0;j=0;
        return (horizontal||vertical||diagonal1||diagonal2);
    }

    private static boolean winForX(int[][] ar) {
        int n=ar.length,i,j=0;boolean vertical =false,horizontal=false,diagonal1=true
                ,diagonal2=true;
        for(i=0;i<n;i++){
            while(j<n&&ar[i][j]==1){
                j++;
            }
            if(j==n){vertical=true; break;}
            else j=0;
        }i=0;j=0;
        for(j=0;j<n;j++){
            while(i<n&&ar[i][j]==1){
                i++;
            }
            if(i==n){horizontal=true; break;}
            else i=0;
        }i=0;j=0;
        for(i=0;i<n;i++){
            j=i;
            if(ar[i][j]!=1){
                diagonal1=false;break;
            }
        }i=0;j=0;
        for(i=0;i<n;i++){
            j=2-i;
            if(ar[i][j]!=1){
                diagonal2=false;break;
            }
        }i=0;j=0;
        return (horizontal||vertical||diagonal1||diagonal2);
    }

    private static int[][] turnForX(int[][] ar) {
        System.out.println("Choose Index for X");
        boolean played = false;
        while(!played) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (ar[a][b] != 0 || ar[a][b] != 1)
            {
                ar[a][b] = 1;played=true;
            }
        }
        if(winForX(ar)){winner = "Player X";
            System.out.println(winner);game=false;}
        return ar;
    }
}
