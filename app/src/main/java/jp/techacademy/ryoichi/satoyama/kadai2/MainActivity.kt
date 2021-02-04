package jp.techacademy.ryoichi.satoyama.kadai2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("タロウ", 20, "野球")
        human1.say()
        human1.think()

        val human2 = Human("ジロウ", 21, "サッカー")
        human2.say()
        human2.think()
    }
}