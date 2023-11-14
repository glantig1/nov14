package com.example.nov14

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 * Use the [ButtonFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ButtonFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false).apply{
            findViewById<Button>(R.id.button).setOnClickListener{
                if(requireActivity()is FragmentCommunicationInterface)
                        (requireActivity() as FragmentCommunicationInterface).buttonIsClicked()
            }
        }
    }

    interface FragmentCommunicationInterface{
        fun buttonIsClicked()
    }


}