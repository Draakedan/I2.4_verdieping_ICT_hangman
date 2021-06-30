package com.example.hangmanappdontfeedthepillar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.FragmentManager

class GameFragment : Fragment() {
    lateinit var gameStateImageView : ImageView
    lateinit var wordTextView : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {

        // Inflate the view
        val view = inflater.inflate(R.layout.fragment_game, container, false)

        // Set the fragment
        val transaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.game_fragment_container, TypingInputFragment()).commit()

        return view
    }

    public fun goToTitle() {
        // return to title fragment
        val fragment = TitleFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.main_fragment_holder, fragment)?.commit()
    }

}