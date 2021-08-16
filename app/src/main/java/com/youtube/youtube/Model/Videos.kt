package com.youtube.youtube.Model

import com.youtube.youtube.R

data class Videos(

    val thumbnail: Int,
    val foto: Int,
    val tempoVideo: String,
    val titulo: String,
    val visualizacao: String

)

class VideosBuilder {

    var thumbnail: Int = 0
    var foto: Int  = 0
    var tempoVideo: String = ""
    var titulo: String = ""
    var visualizacao: String = ""

    fun build(): Videos = Videos(thumbnail, foto, tempoVideo, titulo, visualizacao)

}

//Gerencia todos os videos.
fun videos(block: VideosBuilder.() -> Unit): Videos = VideosBuilder().apply(block).build()

//Cria a lista de videos
fun addVideos(): MutableList<Videos> = mutableListOf(

    videos {

        thumbnail = R.drawable.minecraft
        foto = R.drawable.canal1
        tempoVideo = "25:00"
        titulo = "Minecraft: O Início de Gameplay"
        visualizacao = "Minecraft 56 mil visualizações - 8 meses"

    },

    videos {

        thumbnail = R.drawable.receitas
        foto = R.drawable.canal2
        tempoVideo = "18:00"
        titulo = "Saladas de Macarrão | Receitas Prontas"
        visualizacao = "Receitas 20 mil visualizações - 2 meses"

    },

    videos {

        thumbnail = R.drawable.viagens
        foto = R.drawable.canal3
        tempoVideo = "12:00"
        titulo = "Conheça as Ilhas Maldivas"
        visualizacao = "ViagensBr 1 mil visualizações - 1 ano"

    },

    videos {

        thumbnail = R.drawable.animes
        foto = R.drawable.canal4
        tempoVideo = "30:00"
        titulo = "Dragon Ball Super - Episódio 50"
        visualizacao = "Animes 98 mil visualizações - 1 mês"

    }


)