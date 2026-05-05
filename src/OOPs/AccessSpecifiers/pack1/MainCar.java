package OOPs.AccessSpecifiers.pack1;

class Harrier{
    private String brand = "TATA";
    int mileage = 500;                //Default
    public String color = "black";
    protected String type = "suv";


}

public class MainCar {
    public static void main(String[] args) {
        Harrier harrier = new Harrier();
//        System.out.println(harrier.brand);             //Can't access because it is private
        System.out.println(harrier.mileage);
        System.out.println(harrier.color);
        System.out.println(harrier.type);






    }
}
