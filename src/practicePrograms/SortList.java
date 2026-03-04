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
        Comparator<Integer> comp = ( x, y) -> {
            if (x < y) {
                return -1;
            } else if (x > y) {
                return 1;
            } else {
                return 0;
            }
        };


        System.out.println("Before using comparator");
        System.out.println(list);
//        list.sort(comp);
//        Same work , we are making the use of compare() present in Integer instead of writing the same logic by ourself
//        list.sort(Integer::compare);

        list.sort(null);
//        list.sort((a,b) -> b-a);         //Descending order
        System.out.println("After using comparator");
        System.out.println(list);
    }
}
