package com.ipiecoles.algo001;

public class Date {
    public int jour;
    public int mois;
    public int annee;

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Date{" +
                "jour=" + jour +
                ", mois=" + mois +
                ", annee=" + annee +
                '}';
    }
}
