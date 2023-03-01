package com.lesson.lamda;

import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "55", "66");
        strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter( value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);


//        for (String string: strings) {
//            String value = string + string;
//            Integer intValue = Integer.valueOf(value);
//            if(intValue % 2 == 0){
//                System.out.println(intValue);
//            }
//
//        }
    }
}
