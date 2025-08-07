/*Given an integer N (can be positive, negative, or zero), write a program to calculate the sum of the digits of the absolute value of N.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
       if(n<0)
        n=n*-1;
        int sum=0;
        
        while(n>0){
               
                sum+=n%10;
                n/=10;
            }
        System.out.println(sum);
        }
   
    }
