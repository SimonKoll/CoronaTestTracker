package com.example.coronatesttracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.coronatesttracker.databinding.FragmentInputfragmentBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_inputfragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_inputfragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentInputfragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_inputfragment, container, false
        )

        binding.btSave.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_fragment_inputfragment_to_fragment_reportList)
        }

        binding.btToWelcomeFromCreate.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_fragment_inputfragment_to_welcomeFragment)
        }

        return binding.root
    }

}