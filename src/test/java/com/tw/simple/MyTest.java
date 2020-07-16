package com.tw.simple;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MyTest {

    @org.junit.Test
    public void shouldWork() throws Exception {
        assertThat(true, is(true));
    }
}
