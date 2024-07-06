package JavaProgramming.StreamAPI;

import java.util.Arrays;
import java.util.List;

import common.util.FastReader;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();

        List<Integer> lst = Arrays.asList(10, 15, 8, 49, 25, 98);
        lst.stream().map(s -> Integer.toString(s))
        .filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}
