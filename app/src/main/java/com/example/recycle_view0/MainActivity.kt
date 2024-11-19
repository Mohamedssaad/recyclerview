package com.example.recycle_view0

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val data= arrayListOf<NumberClass>(
            NumberClass(R.drawable.one,"one title","one descration"),
            NumberClass(R.drawable.two,"two title","two descration"),
            NumberClass(R.drawable.three,"three title","three descration"),
            NumberClass(R.drawable.four,"four title","four descration"),
            NumberClass(R.drawable.five,"five title","five descration"),
            NumberClass(R.drawable.six,"six title","six descration"),
            NumberClass(R.drawable.seven,"seven title","seven descration"))
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.recyclerView)
        recyclerView.adapter= NumAdabter(data,this)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        //recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}