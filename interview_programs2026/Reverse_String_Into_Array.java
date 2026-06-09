package interview_programs2026;

import java.util.Arrays;

public class Reverse_String_Into_Array {

    public static void main(String[] args) 
    {

        String input = "Harjeet";
        char c1[]=   input.toCharArray();
        System.out.println(Arrays.toString(c1));  
        
        char c2[] = new char[input.length()];  //Yaha ek character array banaya gaya hai.       
        int index = 0;                         //Ye variable array me values insert karne ke liye use ho raha hai.
        for (int i=input.length()-1; i >=0; i--) 
          {
            c2[index] = input.charAt(i);
            index++;
          }
        System.out.println(Arrays.toString(c2));
    }
}