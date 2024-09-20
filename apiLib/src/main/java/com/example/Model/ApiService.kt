package com.example.Model

import retrofit2.http.GET
import retrofit2.http.Query

// Interface that defines API endpoints for fetching movies
interface ApiService {

    // Endpoint to fetch a list of movies based on a search query
    // The @GET annotation specifies that this is a GET request to the root URL "/"
    // The @Query annotation indicates that the 'query' parameter will be added to the URL query string
    // This function is marked as 'suspend' to support Kotlin coroutines for asynchronous operations
    // https://search.imdbot.workers.dev/?q=Niram (Api for first search movie call)
    @GET("/")
    suspend fun getMovies(@Query("q") query: String): ApiResponse

    // Endpoint to fetch detailed information about a specific movie based on its IMDb ID
    // The @GET annotation specifies that this is a GET request to the root URL with a parameter "?"
    // The @Query annotation indicates that the 'imdbId' parameter will be added to the URL query string
    // This function is also marked as 'suspend' for asynchronous operations with coroutines
   // https://search.imdbot.workers.dev/?tt=tt13667402 (Get more details of a particular IMDb ID)
    @GET("?")
    suspend fun getMovieDetails(@Query("tt") imdbId: String): MovieDetailsResponse
}
