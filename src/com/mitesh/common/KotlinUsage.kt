package com.mitesh.common

import com.mitesh.dataclass.PersonJava
import com.mitesh.dataclass.PersonKotlin
import java.awt.Color
import java.util.function.BiFunction
import java.util.function.Predicate

fun variableDeclarations() {
    val x = 0  //val means unmodifiable
    var name = "abc" //var means modifiable

    // x = 5  // this assignment will give compile time error
    name = "some other name" // this is fine
}

fun typeInterface() {
    val a = "abc"                         // type inferred to String
    val b = 4                             // type inferred to Int

    val c: Double = 0.7                   // type declared explicitly
    val d: List<String> = ArrayList()     // type declared explicitly
}

fun commonUsage() {

    // declaring nullable
    var canBeNullable: String? = "canBeNullable"
    canBeNullable = null

    var canNotBeNullable: String = "canBeNullable"
    // canNotBeNullable = null   // Compilation Error

    //creating a map
    val testMap = mapOf<Int, String>(1 to "one", 2 to "two")
    val testArrayList = arrayListOf(1, 2, 3, 4, 5)

    val c = if (canBeNullable == "someValue") "hello" else ""
}

fun stringInterpolation() {
    val str = "Hello"
    print("$str World")

    val x = 4
    val y = 7
    println("sum of $x and $y is ${x + y}")
}

fun equals() {
    val personOne = PersonKotlin(1, "a")
    val personTwo = PersonKotlin(1, "a")

    println("PersonOne == PersonTwo : ${personOne == personTwo}")
    println("PersonOne === PersonTwo : ${personOne === personTwo}")

}

fun namedArguments() {
    val kotlinPersonWithNamedArguments = PersonKotlin(id = 1, name = "personName")
    //val javaPersonWithnamedArguments = PersonJava(id = 1, name = "personname") // this will not work
    println("""Named Argument : Default Name function ${namedArgumentFunction()}""")

}

fun namedArgumentFunction(id: Int = 0, name: String = "defaultName") = PersonKotlin(id = id, name = name)

fun whenEXpression() {
    println("""whenExpressionDemo1 : ${whenExpressionDemo1(7)}""")

    val obj: String? = null

    val res: Boolean = when {
        obj == null -> false
        obj is String -> true
        else -> throw IllegalStateException()
    }

    println("Object is null : ${res}")

    whenExpressionDemo2(Colors.YELLOW)

}

fun whenExpressionDemo1(x: Int) {
    when (x) {
        1 -> print("x is 1")
        2 -> print("x is 2")
        3, 4 -> print("x is 3 or 4")
        in 5..10 -> print("x is 5, 6, 7, 8, 9, or 10")
        else -> println("x is out of range")
    }
}

fun whenExpressionDemo2(color: Colors) {
    when (color) {
        Colors.RED -> println("RED COLOR")
        Colors.GREEN -> println("GREEN COLOR")
        Colors.YELLOW -> print("YELLOW Color")
    }
}

fun destructingDeclarations() {
    val numberToStringMap = mapOf(1 to "one", 2 to "two")

    for ((key, value) in numberToStringMap) {
        println("key:value=${key}:${value}")
    }

    val person = PersonKotlin(1, "one")

    val (id, name) = person
}


fun nullSafety() {
    data class Somethin(
            val x: Int?,
            val y: String

    )

    val test = Somethin(x = null, y = "abc")

    val c: Int = test?.x ?: 0

    var cityName: String?

    cityName = null

    var length = if (cityName != null) {
        cityName.length
    } else {
        0
    }

    length = cityName?.length ?: 0

    length = cityName?.let { it.length } ?: 0
}


fun lambdaExample() {

    //BiFunction<Integer, Integer, Integer> sum = (a , b) -> a + b;  //Java way of writing lambda
    val sum = { x: Int, y: Int -> x + y }                          //Kotlin way of writing lambda

    val result = sum(1, 2);
    println("Sum of Two Int : $result")

    /**
     * Lambda As Method Body when its the last argument
     */

    performOperation(2, { it: Int -> it * 2 })

    // OR

    val multiplyBy2 = performOperation(2) { it ->
        it * 2
    }

    println("MultiPly By 2 : $multiplyBy2")

    val divideBy5 = performOperation(25) { it ->
        it / 5
    }

    println("Divide By 5 : $divideBy5")
}

fun lambda(): (Int, Int) -> Int {
    return { x: Int, y: Int -> x + y }
}


fun performOperation(number: Int, operation: (num: Int) -> Int) = operation.invoke(number)
