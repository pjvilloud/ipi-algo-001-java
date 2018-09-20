package com.ipiecoles.algo001;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Exercice5Test {

    @Parameterized.Parameter(value = 0)
    public Integer annee;
    @Parameterized.Parameter(value = 1)
    public Boolean bissextile;

    @Parameterized.Parameters(name = "{0} bissextile : {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2018, false},
                {1900, false},
                {2000, true},
                {2100, false},
                {2016, true}
        });
    }

    @Test
    public void bissextile() {
        //Given When Then
        Assertions.assertThat(new Exercice5().bissextile(annee)).isEqualTo(bissextile);
    }

    @Test
    public void bissextile2() {
        //Given When Then
        Assertions.assertThat(new Exercice5().bissextile(annee)).isEqualTo(bissextile);
    }


}