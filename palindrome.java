import java.util.Scanner;
public class palindrome {
    public static boolean palindrome(int x){
       int num=x,r=0,ans=0;
       while(num>0){
           r=num%10;
           ans=ans*10+r;
           num=num/10;
       }
           return ans==x;
    }
    public static void main(String []args){
       Scanner sc = new Scanner (System.in);
     int x=sc.nextInt();
        System.out.println(palindrome(x));
    }
}
