package com.tanveershafeeprottoy.navigationarchcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)
        NavigationUI.setupWithNavController(findViewById<BottomNavigationView>(
            R.id.activityBottomNavNavigationView),
            Navigation.findNavController(this, R.id.activityBottomNavFragment))
    }
}
