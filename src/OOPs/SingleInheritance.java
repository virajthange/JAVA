package OOPs;

class Papa{
    void papaMeth() {
        System.out.println("Papa method has beeen called...");
    }
}
class Child extends Papa {
    void childMeth() {
        System.out.println("Child method has been called...");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {

        Papa papa= new Papa();
        papa.papaMeth();

        Child child = new Child();
        child.childMeth();

        Papa p = new Child();
        p.papaMeth();               //Only papa methods are allowed to call from this object , even if the object is of child

//        p.childMeth();   --> not applicable
    }
}
