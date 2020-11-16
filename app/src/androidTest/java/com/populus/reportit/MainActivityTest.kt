package com.populus.reportit


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)
    
    private lateinit var page: MainActivityPage

    @Before
    fun setupPage() {
        page = MainActivityPage()
    }

    @Test
    fun loadScreen_verify_ui_elements() {
        page.verify_action_bar()
        page.verify_main_content_fragment()
        page.verify_floating_action_button()
        page.verify_navitation_bar()
    }
}
