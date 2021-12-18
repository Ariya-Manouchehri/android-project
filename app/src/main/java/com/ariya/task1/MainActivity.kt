package com.ariya.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ariya.task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var count: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = mutableListOf<Flags>()
        items.add(Flags("Argentina", R.drawable.argentina))
        items.add(Flags("Brazil", R.drawable.brazil))
        items.add(Flags("France", R.drawable.france))
        items.add(Flags("German", R.drawable.germany))
        items.add(Flags("Iran", R.drawable.iran))
        items.add(Flags("Italy", R.drawable.italy))
        items.add(Flags("Portugal", R.drawable.portugal))
        items.add(Flags("The_United_States", R.drawable.the_united_states))
        items.add(Flags("Russia", R.drawable.russia))
        items.add(Flags("spain", R.drawable.spain))
        items.add(Flags("The_United_Kingdom", R.drawable.the_united_kingdom))


        binding.switchBtn.setOnClickListener {
            if (count) {
                binding.listview.layoutManager = LinearLayoutManager(this)
                binding.switchBtn.setText("switch to grid layout")
                count=false
            } else if (!count) {
                binding.listview.layoutManager = GridLayoutManager(this, 2)
                binding.switchBtn.setText("switch to linear layout")
                count=true
            }
        }
        val Adapter = Adapter(this, items)
        binding.listview.adapter = Adapter
    }
}
