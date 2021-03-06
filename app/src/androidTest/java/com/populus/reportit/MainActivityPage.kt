package com.populus.reportit

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers
import org.hamcrest.core.AllOf.allOf

class MainActivityPage {

    fun verify_action_bar() {
        val viewGroup = onView(
                allOf(withId(R.id.action_bar),
                        withParent(allOf(withId(R.id.action_bar_container),
                                withParent(withId(R.id.decor_content_parent)))),
                        isDisplayed()))
        viewGroup.check(matches(isDisplayed()))
    }

    fun verify_main_content_fragment() {
        val frameLayout = onView(
                Matchers.allOf(withId(R.id.nav_host_fragment),
                        withParent(Matchers.allOf(withId(R.id.container),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()))
        frameLayout.check(matches(isDisplayed()))
    }

    fun verify_navitation_bar() {
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