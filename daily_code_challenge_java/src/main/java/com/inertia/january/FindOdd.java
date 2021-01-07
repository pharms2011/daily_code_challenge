package com.inertia.january;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    // First Attempt
    public static int findIt(int[] a) {
        int odd = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int j: map.keySet()){
            if(map.get(j)%2 == 1){
                return j;
            }
        }
        return odd;
    }
}
