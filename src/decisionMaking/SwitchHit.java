package decisionMaking;

public class SwitchHit {
    public static void main(String args[]) {

        int val = 2;
        char character = 'v';

//        float , double , boolean, object -> these values are not allowed to use in switch case

        switch(character) {
            case 1 :
                System.out.println(1);
                break;
            case 2, 3, 'v':
                System.out.println(2);
                System.out.println("Second case");
                System.out.println("Multi line statement");
                break;
            case 7:
                System.out.println(7);
                System.out.println("Second case");
                System.out.println("Multi line statement");
                break;
            case 8:{
                System.out.println(8);
                System.out.println("Second case");
                System.out.println("Multi line statement");
                break;
            }
        }
    }
}
