package com.example.brewmap.test;

import android.content.Intent;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.brewmap.R;
import com.example.brewmap.ui.main.MainActivity;
import com.example.brewmap.utils.EspressoTest;
import com.example.brewmap.utils.EspressoUtils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.example.brewmap.utils.AndroidTestUtils.setTestInjector;

@RunWith(AndroidJUnit4.class)
public class MainTest extends EspressoTest<MainActivity> {
    public static final String query="asd";

    public MainTest() {
        super(MainActivity.class);
    }

    @Before
    public void setUp(){
        setTestInjector();
        activityRule.launchActivity(new Intent());
    }

    @Test
    public void testSearch(){
        onView(withId(R.id.etSearch)).perform(typeText(query), closeSoftKeyboard());
        onView(withId(R.id.buttonSearch)).perform(click());
        onView(withId(R.id.etSearch)).check(matches(withText(query)));
    }

    @Test
    public void testNavigateToDetailsActivity(){
        onView(withId(R.id.buttonDetails)).perform(click());
        EspressoUtils.matchToolbarTitle("Details");
    }
}
