package com.nellopia.antvio1965.csel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Log.d(TAG, "onCreate: Starting")

    val btnNavToSecond = this.findViewById<ImageButton>(R.id.btnGoToSecondScreen)
    btnNavToSecond.setOnClickListener {
      Log.d(TAG, "onClick: Clicked btnNavToSecond.")

      val intent = Intent(this@MainActivity, SecondScreen::class.java)
      startActivity(intent)
    }
  }

  companion object {
    private val TAG = "MainActivity"
  }
}
