package com.ipiecoles.algo001;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Exercice9Test {

    @Parameterized.Parameter(value = 0)
    public Date d1;
    @Parameterized.Parameter(value = 1)
    public Date d2;
    @Parameterized.Parameter(value = 2)
    public Boolean d1Avantd2;


    @Parameterized.Parameters(name = "{0} avant {1} : {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Date(12,1,2018), new Date(12,1,2018), false},
                {new Date(12,1,2018), new Date(12,1,2019), true},
                {new Date(12,1,2019), new Date(12,1,2018), false},

                {new Date(12,1,2018), new Date(12,2,2018), true},
                {new Date(12,2,2018), new Date(12,1,2018), false},

                {new Date(12,1,2018), new Date(13,1,2018), true},
                {new Date(13,1,2018), new Date(12,1,2018), false}
        });
    }

    @Test
    public void avant() {
        //Given When Then
        Assertions.assertThat(new Exercice9().avant(d1,d2)).isEqualTo(d1Avantd2);
    }

    @Test
    public void avant2() {
        //Given When Then
        Assertions.assertThat(new Exercice9().avant2(d1,d2)).isEqualTo(d1Avantd2);
    }

    @Test
    public void avant3() {
        //Given When Then
        Assertions.assertThat(new Exercice9().avant3(d1,d2)).isEqualTo(d1Avantd2);
    }


}