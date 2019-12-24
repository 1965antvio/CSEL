package com.nellopia.antvio1965.csel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class SecondScreen : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)
    Log.d(TAG, "onCreate: Starting")

    val btnNavToFirst = findViewById(R.id.btnGoToFirstScreen) as ImageButton
    btnNavToFirst.setOnClickListener {
      Log.d(TAG, "onClick: Clicked btnNavToFirst.")

      val intent = Intent(this@SecondScreen, MainActivity::class.java)
      startActivity(intent)
    }
  }

  companion object {
    private val TAG: String

    init {
      TAG = "SecondScreen"
    }
  }
}