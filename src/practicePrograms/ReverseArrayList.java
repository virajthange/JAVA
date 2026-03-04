package practicePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseArrayList {
    public static void reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while(left <= right) {
            Integer temp = list.get(left);
            Integer r = list.get(right);
            list.set(right, temp);
            list.set(left, r);
            left++;
            right--;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(43,66,73,53,80,24);
        System.out.println(list);
        reverseList(list);
    }
}
