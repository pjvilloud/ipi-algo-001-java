package com.ipiecoles.algo001;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class Exercice4Test {

    @Parameterized.Parameter(value = 0)
    public Integer heure;
    @Parameterized.Parameter(value = 1)
    public String jour;
    @Parameterized.Parameter(value = 2)
    public Boolean ouvert;

    @Parameterized.Parameters(name = "boulangerie ouverte à {0}h le {1} : {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {6, "lundi", false},
                {7, "lundi", false},
                {13, "lundi", false},
                {15, "lundi", false},
                {16, "lundi", false},
                {17, "lundi", false},
                {19, "lundi", false},
                {20, "lundi", false},

                {6, "mardi", false},
                {7, "mardi", true},
                {13, "mardi", false},
                {15, "mardi", false},
                {16, "mardi", true},
                {17, "mardi", true},
                {19, "mardi", false},
                {20, "mardi", false},

                {6, "mercredi", false},
                {7, "mercredi", true},
                {13, "mercredi", false},
                {15, "mercredi", false},
                {16, "mercredi", true},
                {17, "mercredi", true},
                {19, "mercredi", false},
                {20, "mercredi", false},

                {6, "jeudi", false},
                {7, "jeudi", true},
                {13, "jeudi", false},
                {15, "jeudi", false},
                {16, "jeudi", true},
                {17, "jeudi", true},
                {19, "jeudi", false},
                {20, "jeudi", false},

                {6, "vendredi", false},
                {7, "vendredi", true},
                {13, "vendredi", false},
                {15, "vendredi", false},
                {16, "vendredi", true},
                {17, "vendredi", true},
                {19, "vendredi", false},
                {20, "vendredi", false},

                {6, "samedi", false},
                {7, "samedi", true},
                {13, "samedi", false},
                {15, "samedi", false},
                {16, "samedi", true},
                {17, "samedi", true},
                {19, "samedi", false},
                {20, "samedi", false},

                {6, "dimanche", false},
                {7, "dimanche", true},
                {13, "dimanche", false},
                {15, "dimanche", false},
                {16, "dimanche", false},
                {17, "dimanche", false},
                {19, "dimanche", false},
                {20, "dimanche", false}
        });
    }

    @Test
    public void boulangerieOuverte() {
        //Given When Then
        Assertions.assertThat(new Exercice4().boulangerieOuverte(heure, jour)).isEqualTo(ouvert);
    }

    @Test
    public void boulangerieOuverte2() {
        //Given When Then
        Assertions.assertThat(new Exercice4().boulangerieOuverte2(heure, jour)).isEqualTo(ouvert);
    }

    @Test
    public void boulangerieOuverte3() {
        //Given When Then
        Assertions.assertThat(new Exercice4().boulangerieOuverte3(heure, jour)).isEqualTo(ouvert);
    }
}