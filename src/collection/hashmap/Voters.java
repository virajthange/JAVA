package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Voters {
    static public void main(String[] args) {
        Map<Integer, String> voters = new HashMap<>();
        voters.put(1, "Viraj");
        voters.put(2, "Jagdish");
        voters.put(3, "Harshad");
        System.out.println(voters);            //{1=Viraj, 2=Jagdish, 3=Harshad}

        voters.replace(2, "Dhiraj");

        System.out.println(voters);         //{1=Viraj, 2=Dhiraj, 3=Harshad}

        for (Integer val : voters.keySet()) {
            System.out.println(voters.get(val));
        }
    }
}
