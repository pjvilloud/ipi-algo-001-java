package com.ipiecoles.algo001;

public class Exercice8 {

    public int min3(int a, int b, int c) {
        int minAB = Math.min(a,b);
        if(minAB > c){
            return c;
        }
        return minAB;
    }

    public int min3_2(int a, int b, int c) {
        return Math.min(Math.min(a,b),c);
    }

    public int min3_3(int a, int b, int c) {
        if(a <= b && a <= c) {
            return a;
        } else if(b <= c && b <= a){
            return b;
        } else {
            return c;
        }
    }

}
