package com.example.propertease

import retrofit2.Call
import retrofit2.http.GET

interface apiinterface {
    @GET()
    fun getData() : Call<mydata>
}