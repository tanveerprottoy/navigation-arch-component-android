package com.tanveershafeeprottoy.navigationarchcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        root.findViewById<Button>(R.id.fragmentMainBtn0)
                .setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_basicFragment))
        root.findViewById<Button>(R.id.fragmentMainBtn1)
                .setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_overviewFragment))
        root.findViewById<Button>(R.id.fragmentMainBtn2)
                .setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_bottomNavActivity))
        return root
    }
}
