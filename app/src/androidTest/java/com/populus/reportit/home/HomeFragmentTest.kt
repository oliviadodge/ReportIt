package com.populus.reportit.home

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {

//    private lateinit var scenario: FragmentScenario<HomeFragment>
    private lateinit var page: HomeFragmentPage

    @Before
    fun setupPage() {
//        scenario = launchFragmentInContainer<HomeFragment>()
        page = HomeFragmentPage()
    }

    @Test
    fun load_fragment_verify_ui_elements() {
        page.verify_floating_action_button()
    }
}