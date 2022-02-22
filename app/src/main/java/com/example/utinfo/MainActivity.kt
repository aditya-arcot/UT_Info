package com.example.utinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.utinfo.adapter.ItemAdapter
import com.example.utinfo.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data
        val myDataset = Datasource().loadSchools()
        val recyclerView = findViewById<RecyclerView>(R.id.main_page_recycler)
        val button = findViewById<Button>(R.id.backButton)
        val image = findViewById<ImageView>(R.id.imageView)

        val nursingLayout = findViewById<ConstraintLayout>(R.id.NursingLayout)

        recyclerView.adapter = ItemAdapter(this, myDataset, recyclerView, button, image, nursingLayout)

        //to improve performance
        recyclerView.setHasFixedSize(true)






    }

}