package constructorReference;

interface Ice{
    Student getStudent();
}

class Student{
    int id;
    String name;
    Student() {
        System.out.println("Student called...");
    }
}

public class IceCream {
    public static void main(String[] args) {
//        Not completed
    }
}
