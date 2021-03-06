package com.example.hangmanappdontfeedthepillar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class TitleFragment : Fragment() {
    private lateinit var startButton : Button
    private lateinit var settingsButton : Button
    private lateinit var statsButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout
        val view = inflater.inflate(R.layout.fragment_title, container, false)
        inflateLayout(view)

        // Add onCLick listeners
        startButton.setOnClickListener {
            startGame()
        }

        settingsButton.setOnClickListener {
            settings()
        }

        statsButton.setOnClickListener {
            stats()
        }

        return view
    }

    private fun inflateLayout(view : View) {
        startButton = view.findViewById(R.id.title_button_start)
        settingsButton = view.findViewById(R.id.title_button_settings)
        statsButton = view.findViewById(R.id.title_button_stats)
    }

    private fun startGame()
    {
        // Openm game fragment
        val fragment = GameFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.main_fragment_holder, fragment)?.commit()
    }

    private fun settings() {
        // Open settings fragment
        val fragment = SettingsFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.main_fragment_holder, fragment)?.commit()
    }

    private fun stats() {
        // Open stats fragment
        val fragment = StatsFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.main_fragment_holder, fragment)?.commit()
    }
}