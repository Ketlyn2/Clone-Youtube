package com.youtube.youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.youtube.youtube.Adapter.VideosAdapter
import com.youtube.youtube.Model.addVideos
import com.youtube.youtube.OnClick.OnItemClickListener
import com.youtube.youtube.OnClick.addOnItemClickListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerVideos: RecyclerView = findViewById(R.id.recyclerVideos)
        recyclerVideos.adapter = VideosAdapter(addVideos())
        recyclerVideos.layoutManager = LinearLayoutManager(this)
        recyclerVideos.addOnItemClickListener(object : OnItemClickListener{

            override fun onItemClicked(position: Int, view: View) {

                when {

                    position == 0 -> Toast.makeText(applicationContext, "Abrir o vídeo 1", Toast.LENGTH_SHORT).show()
                    position == 1 -> Toast.makeText(applicationContext, "Abrir o vídeo 2", Toast.LENGTH_SHORT).show()
                    position == 2 -> Toast.makeText(applicationContext, "Abrir o vídeo 3", Toast.LENGTH_SHORT).show()
                    position == 3 -> Toast.makeText(applicationContext, "Abrir o vídeo 4", Toast.LENGTH_SHORT).show()

                }

            }

        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflate = menuInflater
        inflate.inflate(R.menu.menu_youtube, menu)

        return true
    }
}