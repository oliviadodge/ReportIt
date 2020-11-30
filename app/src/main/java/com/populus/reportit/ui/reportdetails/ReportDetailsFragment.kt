package com.populus.reportit.ui.reportdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.populus.reportit.R

class ReportDetailsFragment : Fragment() {

    private lateinit var reportDetailsViewModel: ReportDetailsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false).apply {
            setupViewModel(this)
        }
    }

    private fun setupViewModel(rootView: View) {
        reportDetailsViewModel = ViewModelProvider(this).get(ReportDetailsViewModel::class.java)
        val textView: TextView = rootView.findViewById(R.id.text_home)
        reportDetailsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
    }
}