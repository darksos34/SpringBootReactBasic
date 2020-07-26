package com.JavaSpringBootReactBasic;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import org.junit.Assert;

public class FirstUnitTest{
    @Test
    public void testFirstUnits () throws Exception {
        FirstUnit firstUnit = new FirstUnit();
        String first = firstUnit.unitFirst("This is a real test");

        Assert.assertThat(first, CoreMatchers.is("REAL"));

    }
}
