package OOPs.Polymorphism;

class Party {
    static void pizza(double d) {
        System.out.println("Static pizza");
    }
    void pizza() {
        System.out.println("Plain pizza");
    }

    void pizza(int a) {
        System.out.println("Cheese pizza" + a);
    }

    void pizza(char c , float f) {
        System.out.println("Dornant pizza" + c + " " + f);
    }
    void pizza(float c , char f) {
        System.out.println("Dornant pizza" + f + " " + c);
    }

}

class Cheers extends Party{
    void pizza(boolean flag) {
        System.out.println("Peparoni pizza" + flag);
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Party party = new Party();
        party.pizza(6);

        Cheers cheers = new Cheers();
        cheers.pizza(3);
        cheers.pizza('a', 43.2f);
        cheers.pizza(66f, 'd');


        Party parent = new Cheers();
//        parent.pizza(false);    //Not allowed
    }
}
