package com.example.hangmanappdontfeedthepillar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class TitleFragment : Fragment() {
    lateinit var startButton : Button
    lateinit var settingsButton : Button
    lateinit var statsButton : Button

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
        Toast.makeText(context, R.string.button_pressed, Toast.LENGTH_SHORT).show()
        Toast.makeText(context, R.string.not_implemented, Toast.LENGTH_SHORT).show()
        //TODO: implement start game
    }

    private fun settings() {
        // Go to settings fragment
        val fragment = SettingsFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.main_fragment_holder, fragment)?.commit()
    }

    private fun stats() {
        Toast.makeText(context, R.string.button_pressed, Toast.LENGTH_SHORT).show()
        Toast.makeText(context, R.string.not_implemented, Toast.LENGTH_SHORT).show()
        //TODO: implement stats
    }
}