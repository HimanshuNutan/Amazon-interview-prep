public class FindMatchingElementsInSortedArray {
    public static void main(String[] args) {
        int ar1[] ={13,27,35,40,49,55,59};
        int ar2[] ={17,35,39,40,55,58,60};
        int j=0;
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]==ar2[j]){
                System.out.println(i+" "+j+" "+ar1[i]);
                j++;
            }else{
                while(ar1[i]>ar2[j])
                j++;
                if(ar1[i]==ar2[j])
                    System.out.println(i+" "+j+" "+ar1[i]);
            }
        }
    }
}
