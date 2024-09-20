package com.example.Model

import com.google.gson.annotations.SerializedName

// Data class to represent the response received from the movie details API.
// This class maps the JSON structure to Kotlin objects using Gson.
data class MovieDetailsResponse(
    // The 'short' property in the JSON response maps to this 'short' property.
    // It represents the detailed information about the movie.
    // The @SerializedName annotation ensures that the 'short' field in the JSON
    // maps correctly to this Kotlin property, even if the JSON field name changes.
    @SerializedName("short")
    val short: MovieShort
)
