package practicePrograms;


public class IsPalindrome {
    public static boolean isPalindrome(String str, String str2) {
        if(str.length() != str2.length()) {
            return false;
        }
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        int[] arr = new int[26];
        for(int i = 0; i<str.length(); i++) {
            int num = str.charAt(i) - 'a';
            int num2 = str2.charAt(i) - 'a';
            arr[num] = arr[num] + 1;
            arr[num2] = arr[num2] - 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "Listen";
        String str2 = "Silent";
        System.out.println(isPalindrome(str, str2));
    }
}
