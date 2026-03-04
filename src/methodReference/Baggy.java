package methodReference;

interface Pant{
    void pantSize();
}

class Jeans{
    static void size() {
        System.out.println("It is oversize...");
    }
    void color() {
        System.out.println("SkyBlue colored...");
    }
}

public class Baggy {
    public static void main(String[] args) {
//        Arguments of both the methods should be same, return type can be anything
//        Static method reference
//        className:methodName;

//        Getting the method body which is already created at somewhere else instead of assigning again
//        Pant pant = () -> {Jeans.size();};   //Same work but this is not a method reference

//        Method Reference    ( :: -> method reference operator )
        Pant pant = Jeans::size;
//        System.out.println("hello");
        pant.pantSize();

//        Non static method reference
//        Jeans jeans = new Jeans();
//        Pant pant2 = jeans::color;
//        pant2.pantSize();
    }
}
