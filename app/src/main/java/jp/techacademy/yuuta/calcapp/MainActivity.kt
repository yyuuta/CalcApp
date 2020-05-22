package jp.techacademy.yuuta.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        var num1 = 0
        var num2 = editText1.text.toString().toInt()
        var num3 = editText2.text.toString().toInt()

        if (v.id == R.id.button1) {
            num1 = num2 + num3
        } else if (v.id == R.id.button2) {
            num1 = num2 - num3
        } else if (v.id == R.id.button3) {
            num1 = num2 * num3
        } else if (v.id == R.id.button4) {
            num1 = num2 / num3
        }


        intent.putExtra("VALUE1", num1)
        startActivity(intent)
    }
}
