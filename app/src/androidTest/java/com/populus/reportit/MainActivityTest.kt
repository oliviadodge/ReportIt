package com.populus.reportit


import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule: ActivityScenario<MainActivity> = ActivityScenario.launch(MainActivity::class.java)
    
    private lateinit var page: MainActivityPage

    @Before
    fun setupPage() {
        page = MainActivityPage()
    }

    @Test
    fun loadScreen_verify_ui_elements() {
        page.verify_action_bar()
        page.verify_main_content_fragment()
        page.verify_navitation_bar()
    }
}
