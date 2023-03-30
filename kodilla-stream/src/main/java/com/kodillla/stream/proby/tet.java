package com.kodillla.stream.proby;

import java.util.stream.Stream;

public final class tet {
        public static void generateEven(int max) { // [4]
            Stream.iterate(1, n -> n + 2) // [5]
                    .limit(max) // [6]
                    .filter(n -> n % 3 == 0) // [7]
                    .forEach(System.out::println); // [8]
        }
    }

