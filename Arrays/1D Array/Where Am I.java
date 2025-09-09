/*You are given an array of n integers and a target value. Print all the indices (0-based) where the target value occurs.
If the element is not found, print -1.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        int f=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==f){
                System.out.print(i+" ");
                count++;
            }
        }
        if(count==0)
            System.out.println("-1");
       
        }
    }
