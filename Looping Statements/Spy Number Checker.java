import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
       int temp=n;
        int pro=1;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            pro*=digit;
            temp/=10;
         
        }
        if(pro==sum)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
}
