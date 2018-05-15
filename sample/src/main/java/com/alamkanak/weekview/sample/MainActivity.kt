package com.alamkanak.weekview.sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * The launcher activity of the sample app. It contains the links to visit all the example screens.
 * Created by Raquib-ul-Alam Kanak on 7/21/2014.
 * Website: http://alamkanak.github.io
 */
class MainActivity : AppCompatActivity() {

    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.buttonBasic).setOnClickListener(object : View.OnClickListener() {
            fun onClick(v: View) {
                val intent = Intent(this@MainActivity, BasicActivity::class.java)
                startActivity(intent)
            }
        })

        findViewById(R.id.buttonAsynchronous).setOnClickListener(object : View.OnClickListener() {
            fun onClick(v: View) {
                val intent = Intent(this@MainActivity, AsynchronousActivity::class.java)
                startActivity(intent)
            }
        })
    }
}
