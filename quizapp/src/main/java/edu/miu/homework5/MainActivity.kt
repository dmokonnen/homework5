package edu.miu.homework5

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitAnswer(view: View) {
        var total:Double=0.0
        var msg:String;
        if(isQuestion1Correct())
            total+=50;
        if(isQuestion2Correct())
            total+=50;
        val builder=AlertDialog.Builder(this)
        val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        val currentDate = sdf.format(Date())
        msg = if(total<50){
            "Your score is $total%. You should do better!"
        }else
            "Congratulations! You submitted on $currentDate. You achieved $total%"

        builder.setTitle("Quiz Result!")
        builder.setMessage(msg)
        builder.setPositiveButton("Ok"){
            dialogInterface: DialogInterface?, which: Int ->  dialogInterface?.dismiss()
            //finish()
        }
        val dialog:AlertDialog=builder.create()
        dialog.show()
    }
    fun reset(view: View) {
        choices1.clearCheck()
        choiceA2.isChecked=false
        choiceB2.isChecked=false
        choiceC2.isChecked=false

    }
    fun isQuestion1Correct():Boolean{
        if(choiceB.isChecked)
            return true
        return false
    }
    fun isQuestion2Correct():Boolean{
        if(choiceA2.isChecked && choiceC2.isChecked)
            return true
        return false
    }
}
