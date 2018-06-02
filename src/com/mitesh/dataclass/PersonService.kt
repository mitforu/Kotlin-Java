package com.mitesh.dataclass

/**
 * Created by miteshpatel on 5/31/18.
 */
class PersonService{

    fun createPerson(){
        val personJava = PersonJava(1,"javaPerson")
        val kotlinPerson = PersonKotlin(1,"kotlinPerson")
        println(personJava)
        println(kotlinPerson)
    }


}