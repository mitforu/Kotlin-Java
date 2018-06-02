package com.mitesh.common

import com.mitesh.dataclass.PersonKotlin

fun variableDeclarations(){
    val x = 0  //val means unmodifiable
    var name = "abc" //var means modifiable

    // x = 5  // this assignment will give compile time error
    name = "some other name" // this is fine
}

fun stringInterpolation(){
    val str = "Hello"
    print("$str World")

    val x = 4
    val y = 7
    println("sum of $x and $y is ${x + y}")
}

fun typeInterface(){
    val a = "abc"                         // type inferred to String
    val b = 4                             // type inferred to Int

    val c: Double = 0.7                   // type declared explicitly
    val d: List<String> = ArrayList()     // type declared explicitly
}

fun equals(){
    val personOne = PersonKotlin(1,"a");
    val personTwo = PersonKotlin(1,"a");

    println("PersonOne == PersonTwo : ${personOne == personTwo}" )
    println("PersonOne === PersonTwo : ${personOne === personTwo}" )

}