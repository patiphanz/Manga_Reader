package com.example.shoot.manga_reader

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goTo(view : View) {
        var temp = ""
        when(view) {
            imageView1 -> {
                temp = "http://www.oremanga.com/forum.php?gid=64"
            }
            imageView2 -> {
                temp = "http://mangakakalot.com"
            }
        }
        var intent : Intent
        intent = Intent (Intent.ACTION_VIEW, Uri.parse(temp))
        startActivity(intent)
    }
}
