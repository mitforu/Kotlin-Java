package com.mitesh;

import com.mitesh.dataclass.PersonJava;
import com.mitesh.dataclass.PersonKotlin;

public class Main {

    public static void main(String s[]) {

        PersonJava personJava = new PersonJava(1,"abc");

        PersonKotlin personKotlin = new PersonKotlin(1,"abc");

        System.out.println(personJava);
        System.out.println(personKotlin);




    }
}
