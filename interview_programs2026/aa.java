package interview_programs2026;
import java.util.*;

public class aa {
    public static void main(String[] args) {

    	   
        String str = "aaxbbyccz";
        int n = 3;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % n != 0) {
                result.append(str.charAt(i));
            }
        }

        System.out.println("Output: " + result);
        }
    }
