package com.mitesh;

import com.mitesh.dataclass.PersonJava;
import com.mitesh.dataclass.PersonKotlin;
import com.mitesh.dataclass.PersonService;

public class Main {

    public static void main(String s[]) {

        /**
         *  val var variable declarations.
         */
        com.mitesh.common.KotlinUsageKt.variableDeclarations();

        /**
         * type interface
         */
        com.mitesh.common.KotlinUsageKt.typeInterface();

        /**
         * Common Usage
         */
        com.mitesh.common.KotlinUsageKt.commonUsage();

        /**
         *  Data Class
         *  It’s a POJO complete with toString(), equals(), hashCode(), and copy()
         */
        PersonJava personJava = new PersonJava(1,"abc");
        PersonKotlin personKotlin = new PersonKotlin(1,"abc");

        System.out.println(personJava);
        System.out.println(personKotlin);

        new PersonService().createPerson();

        /**
         *  String Interpolation
         *
         */
        com.mitesh.common.KotlinUsageKt.stringInterpolation();

        /**
         * Intuitive Equals
         */
        com.mitesh.common.KotlinUsageKt.equals();

        /**
         * Named Arguments
         * Default Arguments
         */
        com.mitesh.common.KotlinUsageKt.namedArguments();

        /**
         * The When Expression
         */
        com.mitesh.common.KotlinUsageKt.whenEXpression();

        /**
         * Destructuring Declarations
         */
        com.mitesh.common.KotlinUsageKt.destructingDeclarations();


        /**
         * Null Safety
         */
        com.mitesh.common.KotlinUsageKt.nullSafety();

        /**
         * Lambda
         */
        com.mitesh.common.KotlinUsageKt.lambdaExample();

    }
}
