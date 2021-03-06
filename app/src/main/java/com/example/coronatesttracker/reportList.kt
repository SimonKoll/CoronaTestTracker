package com.example.coronatesttracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.coronatesttracker.databinding.FragmentReportListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [reportList.newInstance] factory method to
 * create an instance of this fragment.
 */
class reportList : Fragment() {
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

        val binding: FragmentReportListBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_report_list, container, false
        )

        binding.btNewReport.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_fragment_reportList_to_fragment_inputfragment)
        }

        binding.btToWelcome.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_fragment_reportList_to_welcomeFragment)
        }

        return binding.root
    }

}