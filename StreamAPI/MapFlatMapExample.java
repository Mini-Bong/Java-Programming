package JavaProgramming.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapFlatMapExample {
    public static void main(String[] args) {

        // map example
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("kiwi");
        System.out.println("List of fruit-" + fruit);

        List res = fruit.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(res);


        // flatmap example
        List<List<Integer> > number = new ArrayList<>();
       
        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
       
        System.out.println("List of list-" + number);

        List<Integer> flatList = number.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(flatList);
        
        
    }
}
