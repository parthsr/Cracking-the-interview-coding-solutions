import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class diagonal_difference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
    
    int s=0 ;int t=0;
        for(int i=0;i<n;i++)
            {
            s=s+a[i][i];
            t=t+a[n-i-1][i];
        }
    int ans=Math.abs((t-s));
    System.out.println(ans);
    
    }
    
}
