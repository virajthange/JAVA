package wrapperClasses;

public class ByteClass {
    public static void main(String [] args) {

//        Minimum Value: -128
//        Maximum Value: 127

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

//        System.out.println(Byte.parseByte("784"));  //Exception -> out of the range
        System.out.println(Byte.parseByte("78"));
    }
}
