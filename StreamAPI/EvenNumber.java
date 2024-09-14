package JavaProgramming.StreamAPI;
//Given a list of integers, find out all the even numbers that exist in
// the list using Stream functions

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import common.util.FastReader;

public class EvenNumber {

    public static void main(String[] args) {

        FastReader fastReader = new FastReader();

        // List<Integer> lst = Arrays.asList(10, 15, 20, 25, 8, 49, 98, 31, 46);
        // lst.stream().filter(n -> n%2==0).forEach(System.out::println);


        String input = "JAVA : Code : KPMG : Test : India : Mumbai : Pune : Banglore : USA : China"; 

        List<String> lst = Arrays.asList(input.split(" : "));
        lst.stream().filter(x->x.length() == 4).map(x -> x.toLowerCase()).sorted().collect(Collectors.toList()).forEach(System.out::print);
	    // List<String> res = lst.stream().filter(x -> x.length() == 4).map(x -> x.lowerCase()).sort().collect(Collectors.asList());

    }
    
}
