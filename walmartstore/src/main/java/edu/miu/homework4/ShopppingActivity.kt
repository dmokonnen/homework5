package edu.miu.homework4


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shoppping.*

class ShopppingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoppping)

        val intent = getIntent()
        val output = intent.getStringExtra("message")
        welcome.text = "Welcome $output"
        val intent2= Intent(this,items::class.java)
        val intent3= Intent(this,ProductActivity::class.java)
       // val clothing=findViewById<LinearLayout>(R.id.clothing)
        findViewById<ImageButton>(R.id.clothingImg).setOnClickListener{
            Toast.makeText(this, "You have chosen the Clothing category of shopping", Toast.LENGTH_LONG).show()
            startActivity(intent2)
        }
        findViewById<ImageButton>(R.id.electronicsImg).setOnClickListener{
            Toast.makeText(this, "You have chosen the Electronics category of shopping", Toast.LENGTH_LONG).show()
            startActivity(intent3)
        }
        findViewById<ImageButton>(R.id.foodImg).setOnClickListener{
            Toast.makeText(this, "You have chosen the Food category of shopping", Toast.LENGTH_LONG).show()
        }
        findViewById<ImageButton>(R.id.beautyImg).setOnClickListener{
            Toast.makeText(this, "You have chosen the Beauty category of shopping", Toast.LENGTH_LONG).show()
        }

    }
}
