package com.example.movies

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    private lateinit var rvMovies: RecyclerView
    private var list: ArrayList<Movie> = arrayListOf()

    companion object{
        const val EXTRA_DATA= "extra_data"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title="Dogs"
        rvMovies = findViewById(R.id.rv_movies)
        rvMovies.setHasFixedSize(true)

        list.addAll(MoviesData.listData)
        showRecyclerList()
    }
    /*private fun showSelectedMovie(movie: Movie) {
        Toast.makeText(this, "Kamu memilih " + movie.name, Toast.LENGTH_SHORT).show()
    }*/
    private fun showRecyclerList() {
        rvMovies.layoutManager = LinearLayoutManager(this)
        val listMovieAdapter = ListMovieAdapter(list)
        rvMovies.adapter = listMovieAdapter

        listMovieAdapter.setOnItemClickCallback(object : ListMovieAdapter.OnItemClickCallback {
           override fun onItemClicked(data: Movie) {
                //showSelectedMovie(data)
               /*val movie = Movie(
                   data.name,
                   data.detail,
                   data.poster
               )*/
               startActivity(
                   Intent(this@MainActivity,detail::class.java)
                   .putExtra("judul",data.name)
                   .putExtra("detail",data.detail)
                   .putExtra("poster",data.poster))



            }
        })
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId;
        if(id==R.id.profile){
            startActivity(Intent(this@MainActivity, profile::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}




