/*Given an integer N, write a program to find the sum of the first and last digit in the absolute value of N.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        int last=n%10;
        int first=n;
        while(first>=10){
            first/=10;
        }
        System.out.println(first+last);
    }
}
