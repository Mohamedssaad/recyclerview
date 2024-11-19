package com.example.recycle_view0

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class NumAdabter(val data:List<NumberClass>,val context:Context):RecyclerView.Adapter<NumAdabter.ViewHolder>() {
    class ViewHolder(val row:View):RecyclerView.ViewHolder(row) {
        val layout:ConstraintLayout=row.findViewById(R.id.row)
        val thumbail:ImageView= row.findViewById(R.id.imageView)
        val title:TextView=row.findViewById(R.id.texttitle)
        val descraption:TextView=row.findViewById(R.id.textDescraption)





    }
    //inflate rows or create rows
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(recyclerView: ViewGroup, viewType: Int): ViewHolder {
 val inflater=LayoutInflater.from(recyclerView.context)
      val InflatedView=inflater.inflate(R.layout.row,recyclerView,false)
        val holder=ViewHolder(InflatedView)

        return holder
    }

    //return the number of item to display
    override fun getItemCount(): Int {
 return data.size
    }
//set data on view

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

holder.thumbail.setImageResource(data.get(position).img)
        holder.title.text=data.get(position).title
        holder.descraption.text=data.get(position).descraption
        holder.row.setOnClickListener(View.OnClickListener {
            Toast.makeText(context,data.get(position).title,Toast.LENGTH_SHORT).show()
        })

    }


}