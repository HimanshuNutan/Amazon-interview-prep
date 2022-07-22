package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
write an algo to select 2 movies that select 30mins before the flight lands.
Input is list of movie durations and flight duration
Select the 2 movies that make the longest duration
Input -   1 flight duration  2 list of movie durations
 */
public class InFlightMedia {
    public static void main(String[] args) {
        int flightDuration = 90;
        List<Integer> list = Arrays.asList(1,10,25,35,60);
        List<Integer> moviesList =chooseMovie(flightDuration,list);
        moviesList.stream().forEach(System.out::println);
    }

    private static List<Integer> chooseMovie(int flightDuration, List<Integer> list) {
        int desiredDuration = flightDuration-30;
        int diff=Integer.MAX_VALUE,diff1=0;
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
              if(list.get(i)+list.get(j)<=desiredDuration){
                  diff1 = desiredDuration - (list.get(i)+list.get(j));
                  if(diff1<diff){
                      diff = diff1;
                      if(!list1.isEmpty())
                      {list1.removeAll(list);}
                        list1.add(list.get(i));
                        list1.add(list.get(j));
                  }
              }
            }
        }
return list1;
    }


}
