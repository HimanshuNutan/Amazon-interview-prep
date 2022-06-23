package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InFlightMediaByBinarySearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,25,35,60);
        findMovies(90,list).stream().forEach(System.out::println);
    }
    public static List<Integer> findMovies(int duration,List<Integer> mDurations){
        List<Integer> returnList = new ArrayList<>();
        Collections.sort(mDurations);

        int first =mDurations.get(0),second = mDurations.get(1);
        boolean flag = false;int j=2;
        for(int i=2;i<mDurations.size();i++){
            if(mDurations.get(i)>first&&(mDurations.get(i)+second)<=duration-30){
                first = mDurations.get(i);
                flag = true;
            }else if(mDurations.get(j)>second&&(first+mDurations.get(j))<=duration-30&&mDurations.get(j)!=first){
                second = mDurations.get(j);j++;
                flag = true;
            }
        }
        if(!flag){
            returnList.add(-1);
            returnList.add(-1);
        }else{
            returnList.add(first);
            returnList.add(second);
        }
        return returnList;
        }

}
