package com.xhateya.idn.hungray.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.xhateya.idn.hungray.R
import com.xhateya.idn.hungray.databinding.ActivityMainBinding
import com.xhateya.idn.hungray.fragment.BreakfastFragment
import com.xhateya.idn.hungray.fragment.DessertFragment
import com.xhateya.idn.hungray.fragment.VegetarianFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding .root)
        setCurrentFragment(BreakfastFragment())
        mainBinding.navMain.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.icBreakfast -> setCurrentFragment(BreakfastFragment())
                R.id.icDessert -> setCurrentFragment(DessertFragment())
                R.id.icvegetarian -> setCurrentFragment(VegetarianFragment())
            }
            true
        }
    }

    private fun setCurrentFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flMain,fragment)
            commit()
        }
    }
}