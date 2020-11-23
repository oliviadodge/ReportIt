package com.populus.reportit


import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    private lateinit var activityScenario: ActivityScenario<MainActivity>

    private lateinit var page: MainActivityPage

    @Before
    fun setupPage() {
        activityScenario = ActivityScenario.launch(MainActivity::class.java)
        page = MainActivityPage()
    }

    @Test
    fun loadScreen_verify_ui_elements() {
        page.verify_action_bar()
        page.verify_main_content_fragment()
        page.verify_navitation_bar()
    }
}
