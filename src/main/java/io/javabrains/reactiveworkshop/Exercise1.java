package io.javabrains.reactiveworkshop;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(n -> System.out.println(n));

        // Print numbers from intNumbersStream that are less than 5
        Predicate<Integer> p = n -> n<5;
        StreamSources.intNumbersStream()
            .filter(p)
            .forEach(n -> System.out.println(n));
        

        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream()
            .filter(p.negate())
            .skip(1)
            .limit(2)
            .forEach(n -> System.out.println(n));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here

        // Print first names of all users in userStream
        // TODO: Write code here

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here

    }

}
