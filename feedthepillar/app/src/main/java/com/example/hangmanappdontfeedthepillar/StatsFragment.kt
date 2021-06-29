package com.example.hangmanappdontfeedthepillar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class StatsFragment : Fragment() {
    private lateinit var winCounterTextView : TextView
    private lateinit var loseCounterTextView : TextView
    private lateinit var averageAttemptsTextView : TextView
    private lateinit var averageWordLengthTextView : TextView
    private lateinit var resetButton : Button
    private lateinit var homeButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {

        // Inflate the layout
        val view = inflater.inflate(R.layout.fragment_stats, container, false)
        inflateLayout(view)

        // Add onClick listeners
        resetButton.setOnClickListener {
            reset()
        }

        homeButton.setOnClickListener {
            home()
        }

        return view
    }

    private fun inflateLayout(view: View) {
        winCounterTextView = view.findViewById(R.id.stats_textview_wins_amount)
        loseCounterTextView = view.findViewById(R.id.stats_textview_lose_amount)
        averageAttemptsTextView = view.findViewById(R.id.stats_textview_attempts_amount)
        averageWordLengthTextView = view.findViewById(R.id.stats_textview_word_length_amount)
        resetButton = view.findViewById(R.id.stats_button_reset)
        homeButton = view.findViewById(R.id.stats_button_home)
    }

    private fun reset() {
        Toast.makeText(context, R.string.button_pressed, Toast.LENGTH_SHORT).show()
        Toast.makeText(context, R.string.not_implemented, Toast.LENGTH_SHORT).show()
        //TODO: implement Reset
    }

    private fun home() {
        // return to title fragment
        val fragment = TitleFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.main_fragment_holder, fragment)?.commit()
    }
}