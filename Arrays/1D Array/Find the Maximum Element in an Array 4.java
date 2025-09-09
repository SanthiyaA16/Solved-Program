//Write a program to read n integers into an array and print the maximum value among them.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  arr[]=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        int max=arr[0];
         for(int i=0;i<n;i++)
         {
             if(arr[i]>max){
                 max=arr[i];
             }
         }
        System.out.println(max);
    }
}
