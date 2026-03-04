package generics;

import java.util.ArrayList;
import java.util.List;

class Apple<S, I> {
    private S color;
    private I price;
    public Apple() {}

    public Apple(S color, I price) {
        this.color = color;
        this.price = price;
    }
    public S getColor() {
        return color;
    }
    public void setColor(S color) {
        this.color = color;
    }
    public I getPrice() {
        return price;
    }
    public void setPrice(I price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Color: " + this.color + ", Price: "+ this.price;
    }
}

public class Fruits {
    public static void main(String[] args) {
        Apple<String, Integer> apple = new Apple<String, Integer>("red", 200);
        Apple<Integer, String> apple1 = new Apple<>(400, "Orange");
        Apple<String, Integer> apple2 = new Apple<>();
        apple2.setColor("Blue");
        apple2.setPrice(300);


//        List<Apple> apples = new ArrayList<>();
        List<Apple<String, Integer>> apples = new ArrayList<>();
        apples.add(apple);
//        apples.add(apple1);   //Now because of List<Apple<String, Integer>>, this object can't get inserted
        apples.add(apple2);

        System.out.println(apples);
    }
}

//Collection frameworks are built to store objects or reference only, not raw values or primitive data
//But to bridge this gap , java provides wrapper classes