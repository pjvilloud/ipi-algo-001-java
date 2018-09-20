package com.ipiecoles.algo001;

public class Exercice10 {

    int sommeNombre(int nb){
       int res = 0;
       int n = 1;
       while(n <= nb) {
           res += n;
           n++;
       }
       return res;
    }

    int sommeNombre2(int nb){
        int res = 0;
        int n = nb;
        while(n > 0) {
            res += n;
            n--;
        }
        return res;
    }

}
