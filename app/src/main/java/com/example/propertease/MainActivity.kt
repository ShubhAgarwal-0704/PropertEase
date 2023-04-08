package com.example.propertease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bell= findViewById<ImageView>(R.id.notilogo)
        bell.setOnClickListener{
            intent = Intent(applicationContext,notifications::class.java)
            startActivity(intent)
        }
        val retrofitBuilder =Retrofit.Builder()
            .baseUrl("https://api.apify.com/v2/datasets/DuruQSqVUvf88kF1G/items?clean=true&format=json/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(apiinterface ::class.java)

         val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<mydata?> {
            override fun onResponse(call: Call<mydata?>, response: Response<mydata?>) {
                var responseBody = response.body()

                val productList =responseBody?.!!
                        val collectDataInSB = StringBuilder()
                for (mydata in productList) {
                    collectDataInSB.append(mydata.title + "")
                }
            }

            override fun onFailure(call: Call<mydata?>, t: Throwable) {
                Log.d("Main aActivity ","onfailure: " + t.message)
            }
        })
    }

}