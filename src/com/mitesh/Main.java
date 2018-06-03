package com.mitesh;

import com.mitesh.dataclass.PersonJava;
import com.mitesh.dataclass.PersonKotlin;
import com.mitesh.dataclass.PersonService;
import kotlin.jvm.functions.Function2;

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
        performOperation(1,2, (a , b ) -> a+b);
        performOperation(2,3, com.mitesh.common.KotlinUsageKt.lambda());

    }

    static private Integer performOperation(Integer number1 , Integer number2, Function2<Integer, Integer, Integer> fn){
        return fn.invoke(number1,number2);
    }
}
