package com.inertia.january;

public class EnglishBeggars {
    public static int[] beggars(int[] values, int n) {
        int[] result = new int[n];
        for(int i = 0; i<n; i++){
            int total = 0;
            for(int j=i; j<values.length; j+=n){
                total+=values[j];
            }
            result[i] = total;
        }
        return result;
    }
}
