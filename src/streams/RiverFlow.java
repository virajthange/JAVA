package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RiverFlow {
    public static void main(String args[]) {

        List<Integer> list = Arrays.asList(32, 66, 56, 77, 98, 22);
//        list.add(43);    //Doesn't work

        System.out.println(list);

        Stream<Integer> stream = list.stream();
//      Wwe cannot use the enhanced for-loop on a Java Stream because a Stream does not implement the Iterable interface.
//      The enhanced for-loop works only with arrays or Iterable objects.
//      Streams are designed for internal iteration using terminal operations like forEach, are lazy, and can be consumed only        once, which is why they don’t support external iteration like a for-each loop.

//        If we are using streams, think “operations”, not “loops”.
//        for (Integer val : stream) {
//            System.out.println(val);
//        }

//        The :: operator is a method reference introduced in Java 8.
//        It is a shorthand for a lambda expression that calls an existing method.
//        System.out::println refers to the println method of System.out and is equivalent to a lambda that prints its input.
//        stream.forEach(System.out::println);

//        stream.forEach(n -> System.out.println(n));
//        stream.forEach(n -> System.out.println(n));   //Can't do it again

        Stream<Integer> res = stream.map(n -> n * 4);
        System.out.println(res.toList());



    }
}
