package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionLogs {
    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        logs.add("88 99 200");
        logs.add("88 99 300");
        logs.add("99 32 100");
        logs.add("12 12 15");
        System.out.println(processLogs(logs,2));
    }

    public static List<String> processLogs(List<String> logs,int thrashold){
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(String s:logs){
            String ar[] = s.split(" ");
            String k = ar[0];
            String k1 = ar[1];
            map.put(k,map.getOrDefault(k,0)+1);
            map.put(k1,map.getOrDefault(k1,0)+1);
            if(k1.equals(k)){
                map.put(k,map.get(k)-1);
            }

        }
        for(String k:map.keySet()){
            if(map.get(k)>=thrashold){
                list.add(k);
            }
        }
        list = list.stream().sorted().collect(Collectors.toList());
        return list;
    }
}
