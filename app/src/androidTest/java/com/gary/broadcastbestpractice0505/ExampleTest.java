package com.gary.broadcastbestpractice0505;

import android.test.InstrumentationTestCase;

/**
 * Created by lsx on 2016/8/1.
 */
public class ExampleTest extends InstrumentationTestCase {

    public void test() throws Exception
    {
        final int expected =1;
        final int reality=5;

        assertEquals(expected, reality);

    }
}
