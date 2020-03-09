package edu.miu.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_items.*

class items : AppCompatActivity() {
    var clothesImage= intArrayOf(R.drawable.jacket,R.drawable.shoes,R.drawable.womentshirt,R.drawable.suits)
    var clothes = arrayOf<String>("Jacket", "Shoes", "Women's T-Shirt", "Suits")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, clothes)
        listView.adapter = adapter
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                when(position){
                    0-> Toast.makeText(this,"This an excellent male jacket and cheap, only 23$!",Toast.LENGTH_LONG).show()
                    1-> Toast.makeText(this,"This an amazing shoe for women, only for 30$!",Toast.LENGTH_LONG).show()
                    2-> Toast.makeText(this,"T-shirt for women, only for 5$!",Toast.LENGTH_LONG).show()
                    3-> Toast.makeText(this,"Suits for Gentle men, only for 500$!",Toast.LENGTH_LONG).show()
                }

            }

    }
}
