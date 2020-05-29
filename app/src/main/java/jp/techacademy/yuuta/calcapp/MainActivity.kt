package jp.techacademy.yuuta.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.util.Log

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

        if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
            Log.d("UI_PARTS", "if入った")            // AlertDialogを作成して表示する
            AlertDialog.Builder(this)
                .setTitle("ERROR！")
                .setMessage("入力してください")
                .setPositiveButton("OK") { dialog, which -> }
                .show()

        } else {

            var num1: Double = 0.0
            var num2 = editText1.text.toString().toDouble()
            var num3 = editText2.text.toString().toDouble()

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

}
