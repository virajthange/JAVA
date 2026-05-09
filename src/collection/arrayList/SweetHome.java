package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SweetHome {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(List.of("Thange"));
        arrayList.add("Viraj");
        arrayList.add(49.3f);
        arrayList.add(45);
        arrayList.add(33);
        arrayList.add(true);
        arrayList.add(702843942);
        arrayList.add(42.55);
        System.out.println(arrayList);


        Object removed = arrayList.remove(2);           //based on index
        System.out.println("The removed value is : "+ removed);

        Object removed2 = arrayList.remove(true);            //based on direct value
        System.out.println("The removed value is : "+ removed2);

        System.out.println("Does arrayList contains 'Viraj': "+arrayList.contains("Viraj"));
        System.out.println("Does arralist contains collection: "+arrayList.containsAll(List.of(33,45)));
        System.out.println("The size of arraylist is : "+ arrayList.size());
        System.out.println("Is our arraylist empty: "+ arrayList.isEmpty());

        System.out.println("The index of 45 is: "+arrayList.indexOf(45));
        arrayList.set(3, 44);
        System.out.println("Element at index 2 is: "+arrayList.get(2));

        for (Object value : arrayList) {
            System.out.println(value);
        }

        arrayList.clear();
        System.out.println("Is our arraylist empty: "+ arrayList.isEmpty());


        List<String> names = new ArrayList<>();
        names.add("Viraj");
        names.add("Yash");
        names.add("Swaraj");
        names.add("Chaitanya");
        System.out.println(names);

//        System.out.println(names.stream().filter(item -> item.charAt(0) == 'V').collect(Collectors.joining()));  //?joining ()
        System.out.println(names.stream().filter(item -> item.charAt(0) == 'V').collect(Collectors.toList()));


//        ***** Immutable List *****
        //List.of() returns an immutable list, while Arrays.asList() returns a fixed-size list that allows element replacement but not structural modification.
        List<Integer> integers = List.of(43, 55, 26);
//        integers.add(44);   //Not possible
//        integers.set(1, 56);  //Not possible
        System.out.println(integers);


//        ***** Fixed size list, but mutable *****
        List<Integer> list = Arrays.asList(90, 88, 67);
//        list.add(66);   //Not possible
        list.set(1, 33);       //Possible here
        System.out.println(list);


    }
}
