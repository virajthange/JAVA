package wrapperClasses;

public class FloatClass {
    public static void main(String []args) {
        System.out.println("Max float value: "+Float.MAX_VALUE);
        System.out.println("Min float value: "+ Float.MIN_VALUE);

        float v = Float.parseFloat("43.55");
        System.out.println("float value of '43.55' is: "+v);

        Float v1 = Float.valueOf("77.8989");
        System.out.println("Float value of 77.8989 is: "+v1);

        float nan = 0f / 0f;
        System.out.println(Float.isNaN(nan));

        System.out.println(Float.compare(63.5f, 32.6f));   //1
        System.out.println(Float.compare(23.5f, 32.6f));   //-1
        System.out.println(Float.compare(23.5f, 23.5f));   //0

    }
}

//OUTPUT:
//Max float value: 3.4028235E38
//Min float value: 1.4E-45
//float value of '43.55' is: 43.55
//Float value of 77.8989 is: 77.8989
//        true
//        1
//        -1
//        0