package practicePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(43, 66, 73, 53, 80, 24);

//        Using Comparator anonymous function
//        Comparator<Integer> comp = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 < o2) {
//                    return -1;
//                }else if(o1 > o2){
//                    return 1;
//                }else{
//                    return 0;
//                }
//            }
//        };

//        Using lambda expression
        Comparator<Integer> comp = (Integer o1, Integer o2) -> {
            if (o1 < o2) {
                return -1;
            } else if (o1 > o2) {
                return 1;
            } else {
                return 0;
            }
        };


        System.out.println(list);
        list.sort(comp);

    }
}
