//Write a program to read n integers into an array and calculate the average of the elements. Print the average value rounded down to the nearest integer.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int d=sum/n;
        System.out.println(d);
        
    }
}
