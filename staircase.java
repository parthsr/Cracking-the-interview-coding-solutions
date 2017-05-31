import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int n = Integer.parseInt(in.readLine());
        diag(n);
    }
    
    static void diag(int n) throws IOException
        {
        for(int i=0;i<n;i++)
            {
            
        
        for(int j=n-i-1;j>0;j--)
        {
            System.out.print(" ");
            
        }
            for(int k=0;k<=i;k++)
                {
                System.out.print("#");
            }
            System.out.println();
    }
    }
}
