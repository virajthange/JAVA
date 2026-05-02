package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

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


    }
}
