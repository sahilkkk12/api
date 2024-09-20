package com.example.Model

// Data class to represent a shortened version of movie details.
// This class contains essential information about a movie, such as its description,
// actors, and directors.
data class MovieShort(
    // Property representing the movie's description.
    // This field holds a textual description of the movie.
    val description: String,

    // Property representing the list of actors involved in the movie.
    // This field holds a list of `Person` objects, each representing an actor.
    val actor: List<Person>,

    // Property representing the list of directors of the movie.
    // This field holds a list of `Person` objects, each representing a director.
    val director: List<Person>
)
