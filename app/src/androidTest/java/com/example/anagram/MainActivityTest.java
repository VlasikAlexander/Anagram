package com.example.anagram;


import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

import android.os.SystemClock;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkTextViewIsDisplayed() {
        onView(ViewMatchers.withId(R.id.textView)).check(matches(isDisplayed()));
    }

    @Test
    public void checkEditTextIsDisplayed() {
        onView(ViewMatchers.withId(R.id.editText)).check(matches(isDisplayed()));
    }

    @Test
    public void checkButtonIsDisplayed() {
        onView(ViewMatchers.withId(R.id.button)).check(matches(isDisplayed()));
    }

    @Test
    public void clickButton() {
        onView(ViewMatchers.withId(R.id.editText)).perform(ViewActions.typeText("hello"));
        Spoon.screenshot(activityTestRule.getActivity(), "main" + SystemClock.currentThreadTimeMillis());
        closeSoftKeyboard();
    }

}