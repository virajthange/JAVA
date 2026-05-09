package collection.treemap;

import java.util.Comparator;
import java.util.TreeMap;

//With Comparable
//Mandatory to make use of comparable or comparator because we have use custom class for storing in the form of key & not the value
//class MangoTree implements Comparable{
//    int mangos;
//    String type;
//
//    MangoTree(int mangos, String color) {
//        this.mangos = mangos;
//        this.type = color;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        MangoTree mangoTree = (MangoTree) o;
//        return ((MangoTree) o).mangos - this.mangos;
//    }
//    @Override
//    public String toString() {
//        return this.mangos + " " + this.type;
//    }
//}


class MangoTree {
    int mangos;
    String type;

    MangoTree(int mangos, String color) {
        this.mangos = mangos;
        this.type = color;
    }

    @Override
    public String toString() {
        return this.mangos + " " + this.type;
    }
}


public class Mango {
    static public void main(String[] args) {

//        With Comparator
//        Comparator<MangoTree> comparator = new Comparator<>() {
//            @Override
//            public int compare(MangoTree o1, MangoTree o2) {
////                return o2.mangos - o1.mangos;      //descending
////                return o1.mangos - o2.mangos;          //ascending
//                return o1.type.compareTo(o2.type);      //Sorting by characters
//            }
//        };

        Comparator<MangoTree> comparator = ( o1,  o2) -> o2.type.compareTo(o1.type);      //Sorting by characters


        TreeMap<MangoTree, Integer> treeMap = new TreeMap<>(comparator);

        MangoTree mangoTree = new MangoTree(2, "Hapus");
        MangoTree mangoTree2 = new MangoTree(16, "Kesari");
        MangoTree mangoTree3 = new MangoTree(8, "Gotya");
        MangoTree mangoTree4 = new MangoTree(4, "Kairi");

        treeMap.put(mangoTree, 1);
        treeMap.put(mangoTree2, 2);
        treeMap.put(mangoTree3, 3);
        treeMap.put(mangoTree4, 4);

        System.out.println(treeMap);

    }
}
