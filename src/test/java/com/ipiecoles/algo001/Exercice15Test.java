package com.ipiecoles.algo001;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class Exercice15Test {

    @Parameterized.Parameter(value = 0)
    public String phraseMin;
    @Parameterized.Parameter(value = 1)
    public String phraseMaj;

    @Parameterized.Parameters(name = "{0} => {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"bonjour tout le monde", "Bonjour Tout Le Monde"},
                {" bonjour tout le monde", " Bonjour Tout Le Monde"},
                {"bonjour  tout le monde", "Bonjour  Tout Le Monde"},
                {"bonjour tout le monde ", "Bonjour Tout Le Monde "},
                {"bonjour", "Bonjour"},
                {"bonjour !", "Bonjour !"},
                {"bonjour a", "Bonjour A"},
        });
    }

    @Test
    public void majusculePhrase() {
        char[] phrase = phraseMin.toCharArray();
        new Exercice15().majusculePhrase(phrase);
        Assertions.assertThat(phrase).isEqualTo(phraseMaj.toCharArray());
    }

    @Test
    public void majusculePhrase2() {
        char[] phrase = phraseMin.toCharArray();
        new Exercice15().majusculePhrase2(phrase);
        Assertions.assertThat(phrase).isEqualTo(phraseMaj.toCharArray());
    }
}