package com.example.happybirthday

fun main() {
    val border = 26
    val age = 23
    val layers = 5
    val name = "Jay Verma"
    printBorder(border)
    println("Happy Birthday, ${name}!")
    printBorder(border)

    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printBorder(border: Int)
{
    repeat(border){
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()

    print(" ")
    repeat(age){
        print("|")
    }
    println()
}


fun printCakeTop(age: Int)
{
    repeat(age+2){
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int)
{
    repeat(layers){
        repeat(age+2){
            print("@")
        }
        println()
    }
}
