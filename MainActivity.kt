package com.example.myviewandview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar !=null){
            (supportActionBar as ActionBar).title="Google Pixel"
        }

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}
