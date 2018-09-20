package com.ipiecoles.algo001;

public class Exercice5 {
    public Boolean bissextile(Integer annee) {
        if(annee % 4 != 0){
            return false;
        }
        else if(annee % 100 == 0 && annee % 400 != 0){
            return false;
        }
        else {
            return true;
        }
    }

    public Boolean bissextile2(Integer annee) {
        return annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0);
    }
}
