package com.example.movies

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*



class detail : AppCompatActivity() {

    /*companion object{
        const val EXTRA_DATA= "extra_data"
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar!!.title=intent.getStringExtra("judul")
        val Picture = getIntent().getIntExtra("poster",0)



        /*Glide.with(this)
            .load(R.drawable.annette2)
            .placeholder(R.drawable.logocinema)
            .into(poster_pic);*/

        Glide.with(this)
            .load(Picture)
            .placeholder(R.drawable.logo)
            .into(poster_pic)
        judul.setText(intent.getStringExtra("judul"))
        detail.setText(intent.getStringExtra("detail"))

        /*val intent :Movie?=intent.getParcelableExtra<Movie>(EXTRA_DATA)
        Glide.with(this).load(intent?.poster).into(poster2)*/

    }




}