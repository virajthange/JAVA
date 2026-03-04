package practicePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamPrograms {
    public static void printEverNumbers(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        stream.forEach((val) -> {
            if(val % 2 ==0) System.out.println(val);
        });
    }

    public static void maxNumber(List<Integer> list) {
        Stream<Integer> stream = list.stream();
//        int max = Integer.MIN_VALUE;
//        We can't modify the local variables in lambda expresssion
        int result = stream.max((a,b) -> a.compareTo(b)).orElseThrow();
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,62,66,21,59,41,69);
//        printEverNumbers(list);
        maxNumber(list);
    }
}


//        System.out.println();   //It is an expression (method call)
