package jp.techacademy.ryoichi.satoyama.kadai2

abstract class Animal {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}