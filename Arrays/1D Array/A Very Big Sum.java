//In this challenge, you need to calculate and print the sum of elements in an array, considering that some integers may be very large.
public class Java{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    long sum=0;
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
        sum+=arr[i];
        }
    System.out.println(sum);
}
}
