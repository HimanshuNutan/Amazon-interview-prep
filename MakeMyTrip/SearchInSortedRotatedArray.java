public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int ar[] = {4,5,6,7,1,2,3};
        int el = 3;
        int left = 0,right = ar.length-1;
        int mid = (left+right)/2;
        while(left<=right){
            mid = (left+right)/2;
            if(ar[mid] == el){
                System.out.println("Found at "+mid);
                break;
            }else if(ar[mid]>el){
                if(el>ar[left])
                    right = mid-1;
                else
                    left = mid+1;
            }
            else if(ar[mid]<el){
                if(el>ar[right])
                    right = mid-1;
                else
                    left = mid+1;
            }
        }
        if(left>right){
            System.out.println("Not found");
        }
    }
}
