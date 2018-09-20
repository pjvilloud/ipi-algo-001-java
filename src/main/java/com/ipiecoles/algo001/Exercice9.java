package com.ipiecoles.algo001;

public class Exercice9 {

    public Boolean avant(Date d1, Date d2){
        if( d1.annee < d2.annee) {
            return true;
        }
	    else if(d1.annee == d2.annee) {
            if (d1.mois < d2.mois) {
                return true;
            } else if (d1.mois == d2.mois) {
                if (d1.jour < d2.jour) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
	    else {
	        return false;
	    }
    }

    public Boolean avant2(Date d1, Date d2){
        if( d1.annee < d2.annee) {
            return true;
        }
        else if(d1.annee == d2.annee) {
            if (d1.mois < d2.mois) {
                return true;
            } else if (d1.mois == d2.mois) {
                if (d1.jour < d2.jour) {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean avant3(Date d1, Date d2){
        return (d1.annee < d2.annee) || (d1.annee == d2.annee && d1.mois < d2.mois)
        || (d1.annee == d2.annee && d1.mois == d2.mois && d1.jour < d2.jour);
    }


}
