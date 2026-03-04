package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInt {
    public static void main(String[] args) {
        Function<List<Integer>, Integer> function = new Function<List<Integer>, Integer>() {
            @Override
            public Integer apply(List<Integer> lst) {
                Integer res = 0;
                for(Integer val: lst) {
                    res = res + val;
                }
                return res;
            }

        };
        System.out.println(function.apply(Arrays.asList(43,66,26,76,33)));
    }
}
