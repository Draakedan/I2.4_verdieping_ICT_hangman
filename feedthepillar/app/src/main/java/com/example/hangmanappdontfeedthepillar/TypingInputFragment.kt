package com.example.hangmanappdontfeedthepillar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class TypingInputFragment : Fragment() {
    lateinit var allMissesButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout
        val view = inflater.inflate(R.layout.fragment_typing_input, container, false)

        inflateLayout(view)

        // add onCLick listeners to the buttons
        allMissesButton.setOnClickListener {
            allMisses()
        }

        return view
    }

    private fun inflateLayout (view: View) {
        allMissesButton = view.findViewById(R.id.typing_button_view_misses)
    }

    private fun allMisses () {
        (parentFragment as GameFragment).goToTitle()
    }

}