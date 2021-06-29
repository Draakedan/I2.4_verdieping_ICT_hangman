package com.example.hangmanappdontfeedthepillar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class SettingsFragment : Fragment() {
    lateinit var revertButton : Button
    lateinit var saveButton : Button
    lateinit var cancelButton : Button
    lateinit var languageSpinner : Spinner
    lateinit var maxLengthEditText : EditText
    lateinit var minLengthEditText : EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        //inflate the layout
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        return view;
    }

    private fun InflateLayout (view : View) {
        revertButton = view.findViewById(R.id.settings_button_revert)
        saveButton = view.findViewById(R.id.settings_button_save)
        cancelButton = view.findViewById(R.id.settings_button_cancel)
        languageSpinner = view.findViewById(R.id.settings_spinner_language)
        maxLengthEditText = view.findViewById(R.id.settings_edittext_length_max)
        minLengthEditText = view.findViewById(R.id.settings_edittext_length_min)
    }
}