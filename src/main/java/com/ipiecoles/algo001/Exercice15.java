package com.ipiecoles.algo001;

public class Exercice15 {
    void majusculePhrase(char[] phrase){
        Boolean procLettreMaj = true;
        int i = 0;
        while(i < phrase.length){
            if(procLettreMaj && phrase[i] != ' '){
                phrase[i] = Character.toUpperCase(phrase[i]);
                procLettreMaj = false;
            }
            else if(phrase[i] == ' ') {
                procLettreMaj = true;
            }
            i++;
        }
    }

    void majusculePhrase2(char[] phrase){
        int i = 1;
        if(phrase.length > 0){
            phrase[0] = Character.toUpperCase(phrase[0]);
        }
        while(i < phrase.length){
            if(phrase[i-1] == ' ' && phrase[i] != ' '){
                phrase[i] = Character.toUpperCase(phrase[i]);
            }
            i++;
        }
    }
}


