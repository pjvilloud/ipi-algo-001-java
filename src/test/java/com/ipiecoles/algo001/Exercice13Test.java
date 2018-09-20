package com.ipiecoles.algo001;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class Exercice13Test {

    @Parameterized.Parameter(value = 0)
    public int montantDu;
    @Parameterized.Parameter(value = 1)
    public int montantVerse;
    @Parameterized.Parameter(value = 2)
    public List<Integer> rendu;

    @Parameterized.Parameters(name = "Montant du : {0}, montant versé : {1}, rendu : {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 10, Arrays.asList(0,0,0)},
                {15, 50, Arrays.asList(3,1,0)},
                {18, 20, Arrays.asList(0,0,2)},
                {23, 60, Arrays.asList(3,1,2)},
                {10, 20, Arrays.asList(1,0,0)},
                {15, 20, Arrays.asList(0,1,0)}
        });
    }

    @Test
    public void remiseMonnaie() {
        Assertions.assertThat(new Exercice13().remiseMonnaie(montantDu, montantVerse)).isEqualTo(rendu);
    }

    @Test
    public void remiseMonnaie2() {
        Assertions.assertThat(new Exercice13().remiseMonnaie2(montantDu, montantVerse)).isEqualTo(rendu);
    }
}