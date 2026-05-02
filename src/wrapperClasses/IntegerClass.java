package wrapperClasses;

//Primitive int is faster than Integer

//The Integer class:
//  Wraps primitive int into an object
//  Provides conversion, parsing, and utility methods
//  Supports autoboxing/unboxing
//  Includes caching for performance
//  Is immutable and widely used in collections


public class IntegerClass {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("432");
        System.out.println(i1);
        Integer i2 = 432;

        System.out.println(i1 == i2);    //checks address
        System.out.println(i1.equals(i2));     //checks value - overriddne in wrapper classes

        Integer i3 = new Integer(43);         //depricated
        System.out.println(i3);


        int i = Integer.parseInt("43");    //returns int not Integer
        System.out.println(i);

//        int binaryString =Integer.parseInt(Integer.toBinaryString(43));
        String binaryString =Integer.toBinaryString(43);
        System.out.println(binaryString);       //101011


        System.out.println(i1.compareTo(i2));    //method from comparable interface
        System.out.println(i1.compareTo(i3));   //1
        System.out.println(i1 > i3);          //?


        int max = Integer.max(i1, i2);
        System.out.println("max is: "+ max);

        int min = Integer.min(43,22);
        System.out.println("Minimum value is: "+min);

        System.out.println("Maximum Integer value is: "+Integer.MAX_VALUE);
        System.out.println("Minimum Integer value is: "+Integer.MIN_VALUE);
    }
}
