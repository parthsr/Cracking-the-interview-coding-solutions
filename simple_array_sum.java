import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class simple_array_sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int x= sum(arr,n);
        System.out.println(x);
    }
    
    static int sum(int arr[], int n)
        {
        int s=0;
        for(int i=0;i<n;i++)
            {
            s=s+arr[i];
        }
        return s;
    }
}
