package com.populus.reportit

import android.os.Bundle
import android.provider.Settings.Global.putInt
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.populus.reportit.ui.home.HomeFragment
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {

    @Test
    fun testEventFragment() {
        // The "fragmentArgs" and "factory" arguments are optional.
        val fragmentArgs = Bundle().apply {
            putInt("selectedListItem", 0)
        }
        val scenario = launchFragmentInContainer<HomeFragment>(fragmentArgs)
        onView(withId(R.id.text)).check(matches(withText("Hello World!")))
    }
}