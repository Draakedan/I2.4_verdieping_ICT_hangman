package com.example.hangmanappdontfeedthepillar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import kotlin.concurrent.thread

class SettingsFragment : Fragment() {
    private lateinit var revertButton : Button
    private lateinit var saveButton : Button
    private lateinit var cancelButton : Button
    private lateinit var languageSpinner : Spinner
    private lateinit var maxLengthEditText : EditText
    private lateinit var minLengthEditText : EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {

        // Inflate the layout
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        inflateLayout(view)

        // Add Button Listeners
        revertButton.setOnClickListener {
            revertSettings()
        }

        saveButton.setOnClickListener {
            saveSettings()
        }

        cancelButton.setOnClickListener {
            cancelSettings()
        }

        return view
    }

    private fun inflateLayout (view : View) {
        revertButton = view.findViewById(R.id.settings_button_revert)
        saveButton = view.findViewById(R.id.settings_button_save)
        cancelButton = view.findViewById(R.id.settings_button_cancel)
        languageSpinner = view.findViewById(R.id.settings_spinner_language)
        maxLengthEditText = view.findViewById(R.id.settings_edittext_length_max)
        minLengthEditText = view.findViewById(R.id.settings_edittext_length_min)
    }

    private fun revertSettings() {
        Toast.makeText(context, R.string.button_pressed, Toast.LENGTH_SHORT).show()
        Toast.makeText(context, R.string.not_implemented, Toast.LENGTH_SHORT).show()
        //TODO: implement revert
    }

    private fun saveSettings() {
        Toast.makeText(context, R.string.button_pressed, Toast.LENGTH_SHORT).show()
        Toast.makeText(context, R.string.not_implemented, Toast.LENGTH_SHORT).show()
        //TODO: implement save settings
        exitFragment()
    }

    private fun cancelSettings() {
        // Toast appears after the fragment is closed, using Thread.sleep() doesn't solve the issue.
        Toast.makeText(context, R.string.cancel_settings, Toast.LENGTH_SHORT).show()
        exitFragment()
    }

    private fun exitFragment() {
        // return to title fragment
        val fragment = TitleFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.main_fragment_holder, fragment)?.commit()
    }

}