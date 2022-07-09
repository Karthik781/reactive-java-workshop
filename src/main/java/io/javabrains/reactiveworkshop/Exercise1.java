package io.javabrains.reactiveworkshop;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exercise1 {

    /**
     * @param args
     */
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
        Integer orElse = StreamSources.intNumbersStream()
            .filter(p.negate())
            .findFirst()
            .orElse(-1);
        // Print first names of all users in userStream
        StreamSources.userStream()
            .forEach(user -> System.out.println(user.getFirstName()));
        System.out.println("<===============================>");
        // Print first names in userStream for users that have IDs from number stream
        StreamSources.intNumbersStream()
            .flatMap(num -> StreamSources.userStream()
            .filter(u -> Integer.valueOf(u.getId()) == num))
            .map(u -> u.getFirstName())
            .forEach(System.out::println);
    }

}
