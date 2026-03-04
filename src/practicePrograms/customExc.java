package practicePrograms;

import java.util.Scanner;

class MyExcption extends RuntimeException{

    public MyExcption(String s) {
    }
}

class NegativeNumberException extends RuntimeException{

}

public class customExc {
    public static void main(String[] args) throws MyExcption {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num > 100) {
            throw new MyExcption("Tharo bap ne dala tha kya");
        }else if(num < 0) {
            throw new NegativeNumberException();
        } else{
            System.out.println("Your entered number is: "+ num);
        }
    }
}
