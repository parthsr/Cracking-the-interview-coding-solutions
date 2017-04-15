import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int grades){
        // Complete this function
        if(grades<38)
            {
            return grades;
        }
        if(grades-(((grades/5)+1)*5)>=-2)
            {
            return (((grades/5)+1)*5);
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
           int result = solve(in.nextInt());
               System.out.println(result);
        }
     
    }
}
