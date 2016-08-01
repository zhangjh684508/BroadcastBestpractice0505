package com.gary.broadcastbestpractice0505;

import android.test.AndroidTestCase;

/**
 * Created by lsx on 2016/8/1.
 */
public class ActivityCollectorTest extends AndroidTestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testAddActivity()
    {
        assertEquals(0, ActivityCollector.activities.size());
        LoginActivity loginActivity=new LoginActivity();
        ActivityCollector.addActivity(loginActivity);
        assertEquals(1, ActivityCollector.activities.size());
        ActivityCollector.addActivity(loginActivity);
        assertEquals(1, ActivityCollector.activities.size());
    }


    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
