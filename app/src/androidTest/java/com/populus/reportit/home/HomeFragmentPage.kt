package com.populus.reportit.home

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.populus.reportit.R
import org.hamcrest.Matchers

class HomeFragmentPage {

    fun verify_floating_action_button() {
        val imageButton = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.floatingActionButton),
                ViewMatchers.withContentDescription("Add report"),
                ViewMatchers.isDisplayed()
            )
        )
        imageButton.check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

}