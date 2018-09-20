package com.ipiecoles.algo001;

public class Exercice16 {

    /*
    L'idée est de réaliser une comparaison caractère après caractère de la chaîne initiale et de la chaîne recherchée. On parcourt les caractères de la chaîne initiale tant qu'ils sont différents du premier caractère de la chaîne à trouver. Dès qu'on trouve un caractère identique, on parcourt les caractères suivants tant qu'ils correspondent. Si un caractère diffère alors qu'on n'a pas atteint la fin de la chaîne recherchée, alors on reprend la recherche du premier caractère identique, à partir du caractère suivant dans la chaîne initiale. Si tous les caractères correspondent, on retourne la position du premier caractère de la chaîne trouvée dans la chaîne initiale. Enfin, si aucune occurrence de la chaîne recherchée n'apparaît dans la chaîne initiale, l'algorithme se doit de le signaler, en retournant une valeur négative par exemple.
     */

    public boolean cherche(char[] aiguille, char[] botteDeFoin) {
        int i = 0;
        while(i < botteDeFoin.length){
            if(botteDeFoin[i] != aiguille[0]){
                i++;
            } else {
                int j = 0;
                while (i < botteDeFoin.length && j < aiguille.length && botteDeFoin[i] == aiguille[j]){
                    i++;
                    j++;
                }
                if(j == aiguille.length){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean chercheMathieuPruvot(char[] aiguille, char[] botteDeFoin){
        int i,j;
        i = 0;
        j = 0;
        int longAiguille = aiguille.length;
        int longBotte = botteDeFoin.length;
        Boolean trouve = false;
        while((longBotte - i) > longAiguille || (i+j)<longBotte || trouve){
            if(botteDeFoin[i+j] == aiguille[j]) {
                if(j == longAiguille - 1){
                    return true;
                }
                else {
                    j++;
                }
            }
            else {
                j = 0;
                i++;
            }
        }
        return trouve;
    }
}
