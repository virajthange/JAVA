package streams;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(53, 2, 77, 36, 92).stream();
//        System.out.println(stream);
//        System.out.println(stream.filter((val) -> { return val > 20;}).collect(Collectors.toSet()));

//        List<Integer> str = stream.toList();
//        str.add(3);    //Not possible
//        System.out.println(str);

//        List<Integer> collect = stream.collect(Collectors.toList());
//        collect.add(43);  //Possible
//        System.out.println(collect);


        List<Integer> integers = List.of(43, 55, 22);
//        integers.add(33);
        System.out.println(integers);

    }
}


//List.of() returns an immutable list, while Arrays.asList() returns a fixed-size list that allows element replacement but not structural modification.