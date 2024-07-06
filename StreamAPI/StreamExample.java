package JavaProgramming.StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2==0).toList();
        System.out.println(evenNumbers);


        // creating a stream
        // usin Stream.of()
        Stream<Integer> steram = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        steram.forEach(p -> System.out.print(p + " "));

        // // using Stream.of(array)
        // Stream<Integer> stream = Stream.of(new Integer[]{1,2, 3, 4, 5, 6, 7, 8, 9});
        // stream.forEach(p -> System.out.println(p));


        // generate 20 random number using stream
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
        randomNumbers.limit(20).forEach(System.out::println);

        



    }
    
}
