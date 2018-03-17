package com.sakegakoi.rambo.pat;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.sakegakoi.rambo.pat", appContext.getPackageName());
    }

    @Test
    public void checkPlayGameDisplayed() {
        onView(withId(R.id.newGame)).check(matches(isDisplayed())).check(matches(withText(R.string.newGameText)));
    }

    @Test
    public void checkHighScoreDisplayed() {
        onView(withId(R.id.highScore)).check(matches(isDisplayed()));
    }

    @Test
    public void checkoutNewActivity() {
        onView(withId(R.id.newGame)).check(matches(isClickable()));
    }

    @Test
    public void checkoutHighScoreActivity() {
        onView(withId(R.id.highScore)).check(matches(isClickable()));
    }
}
