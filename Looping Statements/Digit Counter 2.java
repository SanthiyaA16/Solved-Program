/*Given a positive integer N, write a program to count the number of digits in N.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if(n==0)
            c=1;
        else{
        while(n!=0)
        {
            c++;
            n=n/10;
        
    }
    }
        System.out.println(c);
}
}
