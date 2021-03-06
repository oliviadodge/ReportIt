package com.populus.reportit.home

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.populus.reportit.R
import com.populus.reportit.ui.home.HomeFragment
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {

    private lateinit var scenario: FragmentScenario<HomeFragment>
    private lateinit var page: HomeFragmentPage

    @Before
    fun setupPage() {
        scenario = launchFragmentInContainer<HomeFragment>(null, R.style.Theme_ReportIt)
        page = HomeFragmentPage()
    }

    @Test
    fun load_fragment_verify_ui_elements() {
        page.verify_floating_action_button()
    }
}