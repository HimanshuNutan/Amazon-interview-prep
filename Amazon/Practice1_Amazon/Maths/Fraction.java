package Practice1_Amazon.Maths;

import java.util.HashMap;

public class Fraction {
    public static void main(String[] args) {
        int n=45,d=22,rem;

        int fix = n/d;
        int point = n%d;
        if(n%d!=0){
        double actual = (double)n/(double)d;
        double diff = actual-(double)fix;
        String s = ""+diff;
        s = s.substring(2,s.length());
        HashMap<Character,Integer> map = new HashMap<>();
        int index=0;boolean flag = false;

        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            }else{
                flag = true;
                index=i;break;
            }
        }
        String finalString="";
        if(flag)
         finalString = fix+".("+s.substring(0,index)+")";
        else
            finalString = fix+"."+s;
            System.out.println(finalString);

        }else{
            System.out.println(fix);
        }

    }
}
