package com.luxoft.interview.data.repository

import com.luxoft.interview.data.model.MovieResultWrapper
import retrofit2.http.GET

interface MovieRepository {
    @GET("trending/all/week")
    fun getTrendingTitles(): MovieResultWrapper
}