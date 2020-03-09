package edu.miu.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        if(intent.hasExtra("image") && intent.hasExtra("Title")&& intent.hasExtra("desc")){
            var ig =intent.getIntExtra("image",0)
            var t1 = intent.getStringExtra("Title")
            var t2 = intent.getStringExtra("desc")
            ProdTitle.text = t1.toString()
            desc.text = t2.toString()
            ProdImage.setImageResource(ig)
        }
    }
}
