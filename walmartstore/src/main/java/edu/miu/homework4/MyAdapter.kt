package edu.miu.homework4


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var context: Context, var plist:ArrayList<Product>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        //TODO("Not yet implemented")
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.productlayout, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return plist.size
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        //TODO("Not yet implemented")
        holder?.image?.setImageResource(plist[position].image)
        holder?.Title.text = plist[position].Title
        holder?.price.text = "Price : ${plist[position].price.toString()}0$"
        holder?.pcolor.text = "Color: ${plist[position].color}"
        holder.parentlayout.setOnClickListener {
            val intent = Intent(context, ProductDetailActivity::class.java)
            //var res = text1[position]
            //Toast.makeText(context," $res clicked", Toast.LENGTH_LONG).show()
            intent.putExtra("image", plist[position].image)
            intent.putExtra("Title", plist[position].Title)
            intent.putExtra("desc",plist[position].desc)
            context.startActivity(intent)
        }
    }
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageButton>(R.id.pimage)
        val Title = itemView.findViewById<TextView>(R.id.title)
        val price = itemView.findViewById<TextView>(R.id.price)
        val pcolor = itemView.findViewById<TextView>(R.id.itemcolor)
        var parentlayout : TableLayout = itemView.findViewById(R.id.tablelayout) as TableLayout
    }
}