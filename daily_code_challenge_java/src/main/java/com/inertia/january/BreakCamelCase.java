// 01-04-21
package com.inertia.january;

public class BreakCamelCase {
    // First Attempt
    //    public static String camelCase(String input) {
//        StringBuilder result = new StringBuilder();
//        for(Character c: input.toCharArray()){
//            if(!Character.isLowerCase(c)){
//                result.append(' ');
//            }
//            result.append(c);
//        }
//        return result.toString();
//    }
    // Kata Example
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
