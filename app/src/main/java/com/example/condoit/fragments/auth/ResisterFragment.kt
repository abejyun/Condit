package com.example.condoit.fragments.auth

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.condoit.R

class ResisterFragment : Fragment() {

    companion object {
        fun newInstance() = ResisterFragment()
    }

    private lateinit var viewModel: ResisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_resister, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ResisterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
