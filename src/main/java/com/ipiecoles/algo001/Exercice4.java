package com.ipiecoles.algo001;

public class Exercice4 {

    public Boolean boulangerieOuverte(Integer heure, String jour) {
        if("lundi".equalsIgnoreCase(jour)) {
            return false;
        }
        else if ("dimanche".equalsIgnoreCase(jour)) {
            if (heure < 7 || heure >= 13) {
                return false;
            } else {
                return true;
            }
        }
        else if(heure < 7 || ((heure >= 13 && heure < 16) || heure >= 19)) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean boulangerieOuverte2(Integer heure, String jour) {
        Boolean ouvert = false;
        if(!"lundi".equalsIgnoreCase(jour) && heure >= 7 && heure < 13) {
            ouvert = true;
        } else if(!"lundi".equalsIgnoreCase(jour) && !"dimanche".equalsIgnoreCase(jour) && heure >= 16 && heure < 19) {
            ouvert = true;
        }
        return ouvert;
    }

    public Boolean boulangerieOuverte3(Integer heure, String jour) {
        return (!"lundi".equalsIgnoreCase(jour) && heure >= 7 && heure < 13)
        || (!"lundi".equalsIgnoreCase(jour) && !"dimanche".equalsIgnoreCase(jour) && heure >= 16 && heure < 19);
    }

}
