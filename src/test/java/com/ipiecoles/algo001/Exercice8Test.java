package com.ipiecoles.algo001;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Exercice8Test {

    @Parameterized.Parameter(value = 0)
    public int a;
    @Parameterized.Parameter(value = 1)
    public int b;
    @Parameterized.Parameter(value = 2)
    public int c;

    @Parameterized.Parameter(value = 3)
    public int min;

    @Parameterized.Parameters(name = "Minimum de {0}, {1} et {2} : {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1, 1},
                {2, 2, 3, 2},
                {2, 3, 2, 2},
                {3, 2, 2, 2},
                {4, 4, 3, 3},
                {4, 3, 4, 3},
                {4, 4, 3, 3}
        });
    }

    @Test
    public void min3() {
        //Given When Then
        Assertions.assertThat(new Exercice8().min3(a,b,c)).isEqualTo(min);
    }

    @Test
    public void min3_2() {
        //Given When Then
        Assertions.assertThat(new Exercice8().min3_2(a,b,c)).isEqualTo(min);
    }

    @Test
    public void min3_3() {
        //Given When Then
        Assertions.assertThat(new Exercice8().min3_3(a,b,c)).isEqualTo(min);
    }

}