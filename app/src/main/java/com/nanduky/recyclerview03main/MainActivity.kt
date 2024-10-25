package com.nanduky.recyclerview03main

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nanduky.recyclerview03main.adapter.Calendar03Adapter
import com.nanduky.recyclerview03main.clases.Calendar03DC
import com.nanduky.recyclerview03main.clases.Calendar03ProviderC

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initRecycleView()

    }

    private fun initRecycleView() {
        val rvCalendar03 = findViewById<RecyclerView>(R.id.rvCalendar03)
        rvCalendar03.layoutManager = LinearLayoutManager(this)
        rvCalendar03.adapter = Calendar03Adapter(Calendar03ProviderC.listCalendar03)
    }
}