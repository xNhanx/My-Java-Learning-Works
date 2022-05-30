package com.beginner.loops;

public class LoopsApps {
    public static void main(String[] args) {

        for (int i = 99; i >= 0; i--) {
//            if (i == 1) {
//                System.out.print(i + " bottle of beer on the wall, you take one out and pass around.\n");
//                continue;
//            }
//            if (i == 0) {
//                System.out.print("0 bottles of beer on the wall.\n");
//                break;
//            }
//            System.out.print(i + " bottles of beers on the wall, you take one out and pass around.\n");

            System.out.println(i + " " + (
                    i == 1 ? "bottle" : "bottles"
            ) + " of beer on the wall" + (
                    i == 0 ? "." : ", you take on our and pass it around."
            ));
        }
    }
}
