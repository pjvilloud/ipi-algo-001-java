package com.ipiecoles.algo001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice13 {

    List<Integer> remiseMonnaie(int montantDu, int montantVersé){
        int reste = montantVersé - montantDu;
        int nbrB10 = reste / 10;
        reste = reste % 10;
        int nbrB5 = reste / 5;
        int nbrP1 = reste % 5;
        return Arrays.asList(nbrB10, nbrB5, nbrP1);
    }

    List<Integer> remiseMonnaie2(int montantDu, int montantVersé){
        int reste = montantVersé - montantDu;
        int nbrB10 = 0;
        int nbrB5 = 0;
        int nbrP1 = 0;
        while(reste >= 10){
            reste = reste - 10;
            nbrB10++;
        }
        while(reste >= 5){
            reste = reste - 5;
            nbrB5++;
        }
        nbrP1 = reste;
        return Arrays.asList(nbrB10, nbrB5, nbrP1);
    }

}
