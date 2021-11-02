package id.yusufrizalh.app001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = editNumber1.text
        val number2 = editNumber2.text

        btn_plus.setOnClickListener {
            val result = number1.toString().toDouble() + number2.toString().toDouble()
            txtResult.text = result.toString()
        }

        btn_minus.setOnClickListener {
            val result = number1.toString().toDouble() - number2.toString().toDouble()
            txtResult.text = result.toString()
        }

        btn_multiply.setOnClickListener {
            val result = number1.toString().toDouble() * number2.toString().toDouble()
            txtResult.text = result.toString()
        }

        btn_divide.setOnClickListener {
            val result = number1.toString().toDouble() / number2.toString().toDouble()
            txtResult.text = result.toString()
        }
    }
}