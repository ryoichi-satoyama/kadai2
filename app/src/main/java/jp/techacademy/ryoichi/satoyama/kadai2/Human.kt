package jp.techacademy.ryoichi.satoyama.kadai2

import android.util.Log

class Human: Animal, Thinkable {
    var name: String
    var age: Int
    var hobby: String

    constructor(name: String, age: Int, hobby: String) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + name + "です。年は" + age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + hobby + "について考える。")
    }
}