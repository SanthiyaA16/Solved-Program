import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        int r=sc.nextInt();
        
        for(int i=1;i<=r;i++){
             for(int j=1;j<=r;j++){
                 if(i==j)
                 System.out.print("*");
                 else
                     System.out.print(" ");
             }
            System.out.print("\n");
        }
    }
}
