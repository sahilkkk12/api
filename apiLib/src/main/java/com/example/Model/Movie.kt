package com.example.Model

import com.google.gson.annotations.SerializedName

// Data class representing a movie with its relevant attributes
data class Movie(
    @SerializedName("#TITLE") // Maps the JSON field "#TITLE" to the 'title' property in the Kotlin data class
    val title: String, // The title of the movie

    @SerializedName("#IMDB_ID") // Maps the JSON field "#IMDB_ID" to the 'imdbId' property in the Kotlin data class
    val imdbId: String, // The IMDb ID of the movie

    @SerializedName("#IMG_POSTER") // Maps the JSON field "#IMG_POSTER" to the 'imgPoster' property in the Kotlin data class
    val imgPoster: String // The URL of the movie's poster image
)
