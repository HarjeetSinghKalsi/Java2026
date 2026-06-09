package interview_programs2026;

import java.util.HashMap;
import java.util.Map;

public class LastNonRepeatingCharacter 
{

    public static void main(String[] args) {

        String str = "aabbccdeeffg";

        Map<Character, Integer> m1 = new HashMap<>();

        // Count frequency of each character
        for (char m2 : str.toCharArray())
        {
            m1.put(m2, m1.getOrDefault(m2, 0) + 1);
        }

        // Traverse from right to left
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            char m2 = str.charAt(i);
            if (m1.get(m2) == 1) 
             {
                System.out.println("Last Non-Repeating Character: " + m2);
                return;
             }
        }

        System.out.println("No Non-Repeating Character Found");
    }
}