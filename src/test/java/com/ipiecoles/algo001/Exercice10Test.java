package com.ipiecoles.algo001;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class Exercice10Test {
    @Parameterized.Parameter(value = 0)
    public int nb;
    @Parameterized.Parameter(value = 1)
    public int res;


    @Parameterized.Parameters(name = "La somme de 1 à {0} est égale à {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 15},
                {0, 0},
                {1, 1},
        });
    }
    @Test
    public void sommeNombre() {
        Assertions.assertThat(new Exercice10().sommeNombre(nb)).isEqualTo(res);
    }

    @Test
    public void sommeNombre2() {
        Assertions.assertThat(new Exercice10().sommeNombre2(nb)).isEqualTo(res);
    }
}