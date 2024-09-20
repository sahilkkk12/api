package com.example.Model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Singleton object that manages the Retrofit instance for network operations
object RetrofitInstance {
    // The base URL for all network requests made using Retrofit
    // This URL will be used as the root for all API callsss
    private const val BASE_URL = "https://search.imdbot.workers.dev"

    // The Retrofit instance, which will be initialized lazily
    // This instance is used to create an implementation of the ApiService interface
    val api: ApiService by lazy {
        // Build a Retrofit instance with the following configuration
        Retrofit.Builder()
            // Specify the base URL to be used for all API requests
            // All endpoint paths will be appended to this base URL
            .baseUrl(BASE_URL)

            // Add a converter factory to handle JSON responses
            // GsonConverterFactory will convert JSON data into Kotlin objects
            .addConverterFactory(GsonConverterFactory.create())

            // Build the Retrofit instance with the specified configuration
            .build()

            // Create an implementation of the ApiService interface
            // The ApiService interface defines methods for API endpoints
            .create(ApiService::class.java)
    }
}
