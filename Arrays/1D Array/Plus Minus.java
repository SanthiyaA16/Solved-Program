//Given an array of integers, calculate the ratios of its elements that are , positive,negative and zero . Print the decimal value of each fraction on a new line with 6 places after the decimal.
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        int zero=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                even++;
            }
            else  if(arr[i]==0)
                zero++;
            else
                odd++;
        }
        System.out.printf("%.6f\n",(double)odd/n);
        System.out.printf("%.6f\n",(double)even/n);
        System.out.printf("%.6f\n",(double)zero/n);
    }
}
