import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int fact=1;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        for(int j=1;j<=n;j++){
            fact*=j;
        }
        System.out.println(fact);
    }
}
