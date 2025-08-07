import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            int val=1;
            int sp=n-1-i;
            for(int j=0;j<sp;j++)
                System.out.print("  ");
            int st=2*i+1;
            for(int k=0;k<st;k++){
                System.out.print(val+" ");
            if(k<st/2)
                val++;
            else
                val--;
        }
            System.out.println();
        }
    }
}
