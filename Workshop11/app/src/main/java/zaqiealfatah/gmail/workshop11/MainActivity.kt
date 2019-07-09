package zaqiealfatah.gmail.workshop11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import org.jetbrains.anko.recyclerview.v7.recyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView().layoutManager = LinearLayoutManager(this)

        val list: ArrayList<Movie> = arrayListOf()
        list.add(Movie("Sherlock Holmes",2009))
        list.add(Movie("The Shawshank Redemption",1994))
        list.add(Movie("Forrest Gump",1994))
        list.add(Movie("Titanic",1997))
        list.add(Movie("Taxi",1998))
        list.add(Movie("Inception",1994))
        list.add(Movie("The Imitation Game",2014))

        recyclerView().adapter = MovieAdapter(list)
    }
}

