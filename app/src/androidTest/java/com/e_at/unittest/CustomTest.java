package com.e_at.unittest;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by dev07 on 2017/8/11.
 * email ${EMAIL}
 */

@MediumTest
@RunWith(AndroidJUnit4.class)
public class CustomTest {

    private static final String TAG = "tag";
    public static final String REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$";

    @Test
    public void test1() {
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.e_at.unittest", appContext.getPackageName());

        Log.d(TAG, "this is log.");

        assertEquals("result:", 123, 100 + 33);
    }


    @Test
    public void testPhone() throws Exception {
        assertEquals("result:", isPhone("1363255476522"), true);
    }

    private boolean isPhone(String phone) {
        boolean isPhone = phone.matches(REGEX_MOBILE_SIMPLE);
        Log.d(TAG, "result:" + isPhone);
        return isPhone;
    }
}
