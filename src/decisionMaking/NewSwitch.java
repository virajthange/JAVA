package decisionMaking;

public class NewSwitch {
    public static void main(String[] args) {

        switch ('v') {
            case 'a' -> System.out.println("a");
            case 'b' -> {
                System.out.println("b");
                System.out.println("multiline statements");
            }
            case 'v' -> System.out.println("v");
        }


//        No need of break keyword
        int val = 1;
        int res = switch (val) {
            case 1 -> {
                int one = 1;
                yield one;
            }
            case 3 -> {
                yield  3;
            }
            case 5 -> 5;

            default -> {
                int calc = 4;
                yield calc;
            }
        };
        System.out.println(res);
    }
}
