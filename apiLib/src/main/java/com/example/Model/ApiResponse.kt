package com.example.Model

import com.google.gson.annotations.SerializedName

// Data class representing the API response
data class ApiResponse(
    // The 'description' field from the JSON response maps to this 'movies' property.
    // This annotation ensures that the JSON field 'description' is mapped to the 'movies' property in the Kotlin data class.
    @SerializedName("description")
    val movies: List<Movie>  // A list of Movie objects representing the movies in the response.
)
