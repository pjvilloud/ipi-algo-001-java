package com.ipiecoles.algo001;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Exercice16Test {

    @Parameterized.Parameter(value = 0)
    public String aiguille;
    @Parameterized.Parameter(value = 1)
    public String botteDeFoin;
    @Parameterized.Parameter(value = 2)
    public Boolean trouve;

    @Parameterized.Parameters(name = "{0} existe dans {1} : {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"bonjour", "bonjour tout le monde", true},
                {"tout", "bonjour tout le monde", true},
                {"le", "bonjour tout le monde", true},
                {"monde", "bonjour tout le monde", true},
                {"tou", "bonjour tout le monde", true},
                {"tout le", "bonjour tout le monde", true},
                {"ccc", "bonjour tout le monde", false},
                {"tout a", "bonjour tout le monde", false},
        });
    }

    @Test
    public void cherche() {
        Assertions.assertThat(new Exercice16().cherche(aiguille.toCharArray(), botteDeFoin.toCharArray())).isEqualTo(trouve);
    }

    @Test
    public void chercheMathieuPruvot() {
        Assertions.assertThat(new Exercice16().chercheMathieuPruvot(aiguille.toCharArray(), botteDeFoin.toCharArray())).isEqualTo(trouve);
    }

}