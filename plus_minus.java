import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        double p=0; double ne=0; double z=0;
        for(int i=0;i<n;i++)
            {
            if(arr[i]>0)
                {
                p++;
            }
            else if(arr[i]<0)
                {
                ne++;
            }
            else {
                z++;
            }
            
            
        }
            System.out.println(p/n);
            System.out.println(ne/n);
            System.out.println(z/n);
    }
    
}
