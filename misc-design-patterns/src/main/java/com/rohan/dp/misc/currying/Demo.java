package com.rohan.dp.misc.currying;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Demo {

    static final Function<Integer, Function<Integer, Integer>> CURRIED_MULTIPLIER
            = param1 -> (Function<Integer, Integer>) param2 -> param1 * param2;

    static final Function<Integer, Integer> MULTIPLY_BY_5 = CURRIED_MULTIPLIER.apply(5);
    static final Function<Integer, Integer> MULTIPLY_BY_10 = CURRIED_MULTIPLIER.apply(10);


    public static void main(String[] args) {

        System.out.println(MULTIPLY_BY_5.apply(10));
        System.out.println(MULTIPLY_BY_10.apply(5));


        int[] arr = {1, 2, 3, 4};

        final IntStream intStream = Arrays.stream(arr).map(operand -> operand * 2);
        final int[] ints = intStream.toArray();
        Arrays.stream(ints).forEach(System.out::print);


    }
}
