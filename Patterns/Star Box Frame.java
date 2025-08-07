import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i==0 || j==0 || i==r-1|| j==r-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
