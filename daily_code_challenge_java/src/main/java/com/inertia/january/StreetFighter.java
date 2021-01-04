// 01-03-21
package com.inertia.january;
/*
* Input

    the list of game characters in a 2x6 grid;
    the initial position of the selection cursor (top-left is (0,0));
    a list of moves of the selection cursor (which are up, down, left, right);

*Output

    the list of characters who have been hovered by the selection cursor after all the moves (ordered and with
    repetition, all the ones after a move, wether successful or not, see tests);

*Rules

Selection cursor is circular horizontally but not vertically!

As you might remember from the game, the selection cursor rotates horizontally but not vertically; that means that if
I'm in the leftmost and I try to go left again I'll get to the rightmost (examples: from Ryu to Vega, from Ken to
M.Bison) and vice versa from rightmost to leftmost.

Instead, if I try to go further up from the upmost or further down from the downmost, I'll just stay where I am located
(examples: you can't go lower than lowest row: Ken, Chun Li, Zangief, Dhalsim, Sagat and M.Bison in the above image; you
can't go upper than highest row: Ryu, E.Honda, Blanka, Guile, Balrog and Vega in the above image).

*Test

For this easy version the fighters grid layout and the initial position will always be the same in all tests, only the
list of moves change.

Notice: changing some of the input data might not help you.
* */
public class StreetFighter {
    // First Attempt
//    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
//        String[] choices = new String[moves.length];
//        int k = 0;
//        int i = position[0];
//        int j = position[1];
//        for (String move : moves) {
//            switch (move) {
//                case ("left"):
//                    if (i == 0) {
//                        i = fighters[0].length-1;
//                    }
//                    else{
//                        i--;
//                    }
//                    break;
//                case ("right"):
//                    if(i == fighters[0].length-1){
//                        i=0;
//                    }
//                    else{
//                        i++;
//                    }
//                    break;
//                case ("up"):
//                    j = 0;
//                    break;
//                case ("down"):
//                    j = 1;
//                    break;
//            }
//            System.out.println("i: " + i + " j: " + j);
//            System.out.println(fighters[j][i]);
//            choices[k] = fighters[j][i];
//            k++;
//        }
//        return choices;
//    }
    // Kata Example
    /*
    * Pretty much the same answer, assuming the grid has 6 characters per row, which is true given but could be expanded
    * since the character array is given
    * */
//    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
//        int x = position[1];
//        int y = position[0];
//        String[] result = new String[moves.length];
//
//        for (int i = 0; i < moves.length; i++) {
//            String mv = moves[i];
//            switch(mv) {
//                case "up":    y = 0; break;
//                case "right": x = (x + 1) % 6; break;
//                case "down":  y = 1; break;
//                case "left":  x = (x + 5) % 6; break;
//                default: break;
//            }
//
//            result[i] = fighters[y][x];
//        }
//        return result;
//    }

    // Second Attempt
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
        int x = position[1];
        int y = position[0];
        int numChar = fighters[0].length;
        String[] result = new String[moves.length];

        for (int i = 0; i < moves.length; i++) {
            String mv = moves[i];
            switch(mv) {
                case "up":    y = 0; break;
                case "right": x = (x + 1) % numChar; break;
                case "down":  y = 1; break;
                case "left":  x = (x + numChar-1) % numChar; break;
                default: break;
            }

            result[i] = fighters[y][x];
        }
        return result;
    }
}
