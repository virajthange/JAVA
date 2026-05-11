package wrapperClasses;

public class CharacterClass {
    public static void main(String args []) {
        // Autoboxing & Unboxing
        Character wrapperChar = 'G'; // Autoboxing
        char primitiveChar = wrapperChar; // Unboxing
        System.out.println(wrapperChar);
        System.out.println(primitiveChar);

        System.out.println("Is V a digit: "+Character.isDigit('V'));
        System.out.println("Is 7 a digit: "+Character.isDigit('7'));


        System.out.println("Is V a letter: "+Character.isLetter('v'));
        System.out.println("Is c a letter: "+Character.isLetter('c'));
        System.out.println("Is 4 a letter: "+Character.isLetter('4'));

        System.out.println("Is this a space: "+ Character.isWhitespace(' '));

        System.out.println("Is V an uppercase letter: "+ Character.isUpperCase('V'));
        System.out.println("Is b an uppercase letter: "+ Character.isUpperCase('b'));

        System.out.println("Is n an lowercase letter: "+ Character.isLowerCase('n'));
        System.out.println("Is M an lowercase letter: "+ Character.isLowerCase('M'));

        System.out.println("Uppercase of v is: "+ Character.toUpperCase('v'));
        System.out.println("Lowercase of Y is: "+ Character.toLowerCase('Y'));

        System.out.println(Character.compare('v','z'));  //-4 -> difference


        int numericValue = Character.getNumericValue('6');      //char -> int
        System.out.println(numericValue);

        int a = Character.charCount('f');
        System.out.println(a);
    }
}


//OUTPUT:
//V
//Is V a digit: false
//Is 7 a digit: true
//Is V a letter: true
//Is c a letter: true
//Is 4 a letter: false
//Is this a space: true
//Is V an uppercase letter: true
//Is b an uppercase letter: false
//Is n an lowercase letter: true
//Is M an lowercase letter: false
//Uppercase of v is: V
//Lowercase of Y is: y
//-4
//6
//1