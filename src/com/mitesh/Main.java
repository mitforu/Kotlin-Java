package com.mitesh;

import com.mitesh.dataclass.PersonJava;
import com.mitesh.dataclass.PersonKotlin;
import com.mitesh.dataclass.PersonService;

public class Main {

    public static void main(String s[]) {

        /**
         *  Data Class
         */
        PersonJava personJava = new PersonJava(1,"abc");
        PersonKotlin personKotlin = new PersonKotlin(1,"abc");

        System.out.println(personJava);
        System.out.println(personKotlin);

        new PersonService().createPerson();

        /**
         *  val var variable declarations.
         */
        com.mitesh.common.KotlinUsageKt.variableDeclarations();

        /**
         *  String Interpolation
         *
         */
        com.mitesh.common.KotlinUsageKt.stringInterpolation();


        /**
         * type interface
         */
        com.mitesh.common.KotlinUsageKt.typeInterface();

        /**
         * Intuitive Equals
         */

        com.mitesh.common.KotlinUsageKt.equals();



    }
}
