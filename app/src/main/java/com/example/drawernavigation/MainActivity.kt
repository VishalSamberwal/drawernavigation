package com.example.drawernavigation

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        drawerLayout =findViewById(R.id.drawer_layout)
        navView =findViewById(R.id.navigation_view)

        val toggle  = ActionBarDrawerToggle(this,drawerLayout, findViewById(R.id.toolbar),R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // home actions
                }

                R.id.nav_profile -> {
                   //profile actions
                }

                R.id.nav_settings -> {
                    //setting actions
                }
            }
            drawerLayout.closeDrawers()
            true
        }
    }
}