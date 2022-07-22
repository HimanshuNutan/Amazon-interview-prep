package Practice1_Amazon.Maths;

public class NthNaturalNumberWithoutADigit {
    //Nth natural number without a digit i is equal to N converted to base i number
    public static void main(String[] args) {
        int N=20,res=0,p=1;
        //first method for base conversion
//        while(N>0){
//            res = res + p*(N%9);
//            N=N/9;
//            p=p*10;
//        }
        //2nd method for base conversion
        String s = Integer.toString(Integer.parseInt(N+"",10),9);
        System.out.println(s);
    }
}
