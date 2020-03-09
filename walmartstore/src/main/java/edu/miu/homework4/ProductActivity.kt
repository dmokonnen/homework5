package edu.miu.homework4

import android.content.Intent
import android.icu.text.PluralRules
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val rv = findViewById<RecyclerView>(R.id.recyclerView1)
        // Give the recycler view with Linear layout manager.
        rv?.layoutManager =  LinearLayoutManager(this)
        // Populate Book data list
        val products = ArrayList<Product>()
        products.add(Product("Asus Tablet",35.0,"Black",R.drawable.asustablet,"45FYU","It is great for reading"))
        products.add(Product("HP printer",34.0,"Black",R.drawable.hpprinter,"FFS4554","It can also print color"))
        products.add(Product("Monitor 4K",500.0,"Grey",R.drawable.monitor4k,"DTM333","Wonderful display"))
        products.add(Product("MacBook Air 2017",1500.0,"Silver",R.drawable.macair,"MAL333","The best portable computer"))
        products.get(0).desc="Item Description:   " +
                "Powerful, Full HD Entertainment\n" +
                "1920 x 1200 native resolution for vivid visuals and 178° wide viewing angles to reduce color shift\n" +
                "Intel® Atom™ Z2560 processor (1.6GHz) with 2GB memory\n" +
                "Up to 10 hours* of battery life (* looping 720p video under test conditions)\n" +
                "Dual speakers with SonicMaster Technology for incredible sound\n" +
                "Only 9.5mm thick and 580g in weight\n" +
                "Seamless video streaming with Miracast"
        products.get(1).desc="Item Description: Do more with an affordable HP ENVY all-in-one: " +
                "the perfect match for your technology. Enjoy the easiest way to print from your " +
                "smartphone or tablet. Use its wireless printing and produce lab-quality photos."
        products.get(2).desc="Item Description: tylish Design\n" +
                "With its slim panel featuring a 3-sided bezel-less screen, the Samsung Space Monitor " +
                "offers an understated stylish solution for any workplace or home interior.\n" +
                "4K UHD Resolution\n" +
                "With 4x the pixels of Full HD, the 32\" Samsung Space Monitor delivers more screen space " +
                "and amazingly life-like 4K UHD images.\n" +
                "Height-Adjustable Arm Stand\n" +
                "The Samsung Space Monitor?s zero-level height adjustable arm stand allows easy positioning " +
                "of the screen for optimal comfort and convenience. Its adjustment span allows viewing from a " +
                "height of 7.2 inches (183 mm) above the desktop (27-inch screen) all the way down to surface level."
        products.get(3).desc="Item Description: Make big things happen. All day long.\n" +
                "\n" +
                "MacBook Air lasts up to an incredible 12 hours between charges. So " +
                "from your morning coffee till your evening commute, you can work unplugged. " +
                "When it's time to kick back and relax, you can get up to 12 hours of iTunes " +
                "movie playback. And with up to 30 days of standby time, you can go away for weeks " +
                "and pick up right where you left off."
        // Create an adapter and supply the data to be displayed.
        var adapter = MyAdapter(this,products)
        // Connect the adapter with the recycler view.
        rv.adapter = adapter
//        recyclerView1.setOnClickListener {
//            val intent = Intent(this, ProductDetailActivity::class.java)
//            //var res = text1[position]
//            //Toast.makeText(context," $res clicked", Toast.LENGTH_LONG).show()
//            intent.putExtra("image", products[position].image)
//            intent.putExtra("Title", plist[position].Title)
//            intent.putExtra("desc",plist[position].desc)
//            context.startActivity(intent)
//        }


    }
}
