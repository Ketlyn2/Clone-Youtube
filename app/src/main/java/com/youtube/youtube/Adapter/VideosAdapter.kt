package com.youtube.youtube.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.youtube.youtube.Model.Videos
import com.youtube.youtube.R

class VideosAdapter(val videos: MutableList<Videos>): RecyclerView.Adapter<VideosAdapter.VideosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideosViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.lista_videos, parent, false)
        return VideosViewHolder(view)

    }

    override fun getItemCount(): Int = videos.size

    override fun onBindViewHolder(holder: VideosViewHolder, position: Int) {

        holder.bind(videos[position])

    }


    inner class  VideosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(videos: Videos) {

            var thumb = itemView.findViewById<ImageView>(R.id.thumbnail)
            var foto = itemView.findViewById<ImageView>(R.id.foto)
            var tempoVideo = itemView.findViewById<TextView>(R.id.tempoVideo)
            var titulo = itemView.findViewById<TextView>(R.id.titulo)
            var visualizacao = itemView.findViewById<TextView>(R.id.visualizacao)

            thumb.setImageResource(videos.thumbnail)
            foto.setImageResource(videos.foto)
            tempoVideo.text = videos.tempoVideo
            titulo.text = videos.titulo
            visualizacao.text = videos.visualizacao

        }

    }

}