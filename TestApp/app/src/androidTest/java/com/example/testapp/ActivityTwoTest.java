package com.example.testapp;

import android.app.Activity;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;

import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static org.junit.Assert.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class ActivityTwoTest {
    @Rule public ActivityTestRule activityTestRule = new ActivityTestRule(ActivityTwo.class);
    private ActivityTwo mainActivity=null;
    @Before
    public void setUp() throws Exception {
        //mainActivity=activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
    }

    @Test
    public void btn_click() {
        Espresso.onView(withId(R.id.editText)).perform(typeText("Hello World!"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button2)).perform(click());
    }
}
