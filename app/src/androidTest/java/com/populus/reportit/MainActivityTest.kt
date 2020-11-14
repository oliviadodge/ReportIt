package com.populus.reportit


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loadScreen_verifyUiElements() {
        val viewGroup = onView(
                allOf(withId(R.id.action_bar),
                        withParent(allOf(withId(R.id.action_bar_container),
                                withParent(withId(R.id.decor_content_parent)))),
                        isDisplayed()))
        viewGroup.check(matches(isDisplayed()))

        val frameLayout = onView(
                allOf(withId(R.id.nav_host_fragment),
                        withParent(allOf(withId(R.id.container),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()))
        frameLayout.check(matches(isDisplayed()))

        val imageButton = onView(
                allOf(withId(R.id.floatingActionButton), withContentDescription("Add report"),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()))
        imageButton.check(matches(isDisplayed()))

        val frameLayout2 = onView(
                allOf(withId(R.id.nav_view),
                        withParent(allOf(withId(R.id.container),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()))
        frameLayout2.check(matches(isDisplayed()))

        val frameLayout3 = onView(
                allOf(withId(R.id.navigation_home), withContentDescription("Home"),
                        withParent(withParent(withId(R.id.nav_view))),
                        isDisplayed()))
        frameLayout3.check(matches(isDisplayed()))

        val frameLayout4 = onView(
                allOf(withId(R.id.navigation_map), withContentDescription("Map"),
                        withParent(withParent(withId(R.id.nav_view))),
                        isDisplayed()))
        frameLayout4.check(matches(isDisplayed()))

        val frameLayout5 = onView(
                allOf(withId(R.id.navigation_notifications), withContentDescription("Notifications"),
                        withParent(withParent(withId(R.id.nav_view))),
                        isDisplayed()))
        frameLayout5.check(matches(isDisplayed()))
    }
}
