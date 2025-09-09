/*Given an array of integers, write a program to:
Calculate the sum of even elements
Calculate the sum of odd elements
Calculate the sum of elements at even indexes
Calculate the sum of elements at odd indexes*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int even=0;
        int odd=0;
        int pos1=0;
        int pos2=0;
        
        for( int i=0 ;i<n;i++){
            
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even+=arr[i];
                
            }
            else{
                odd+=arr[i];
              
             }
            if(i%2==0)
                pos1+=arr[i];
            else
                pos2+=arr[i];
                
        }
         
        
        System.out.print(even+" ");
         System.out.print(odd+" ");
         System.out.print(pos1+" ");
         System.out.print(pos2+" ");
        
    }
}
