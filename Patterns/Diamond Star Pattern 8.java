import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        for(int i=0;i<n-1;i++){
            int sp=n-1-i;
            for(int j=0;j<sp;j++)
                System.out.print(" ");
            int star=2*i+1;
            for(int k=0;k<star;k++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            int sp=n-1-i;
            for(int j=0;j<sp;j++)
                System.out.print(" ");
            int star=2*i+1;
            for(int k=0;k<star;k++)
                System.out.print("*");
            System.out.println();
        
        }
     
    }
}
