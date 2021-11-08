package com.example.spinnerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//https://www.youtube.com/watch?v=AJ4Q8dOQavQ

/*
1- add Spinner to xml , give it id
2- create array to hold Spinner item
3- create adapter (search about view adapter)
4- connect adapter with Spinner
val myAdapter = ArrayAdapter<String>
(this, android.R.layout.simple_spinner_item,days)
this, simple build in layout -> you can build custom layout , array of item
5- add listener:
a- use : mySpinner.onItemSelectedListener =

b- create anonymize object to implement AdapterView.OnItemSelectedListener interface
 object : AdapterView.OnItemSelectedListener

c- add implement two method onItemSelected and onNothingSelected


 */
    private val days = arrayOf("Sandy", "Monday", "Tuesday")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,days)
        val mySpinner = findViewById<Spinner>(R.id.mySpinner)
        mySpinner.adapter=myAdapter
        mySpinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext, "Position $position", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}