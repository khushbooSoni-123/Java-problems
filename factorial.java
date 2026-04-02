import java.util.*;

public class factorial {
public static int binomialFactorial(int num, int r){
    int nfact = factorial(num);
    System.out.println(nfact);
    int rfact = factorial(r);
    System.out.println(rfact);
    int nrfact = factorial(num-r);
    System.out.println(nrfact);

   int BC =(nfact)/(rfact*nrfact) ;
    return BC ;
}



    public static int factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static boolean prime(int num) {

    if(num<=1){
        return false;
    }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinRange(int a , int b){

    for(int i=a ; i<=b ; i++){
       if(prime(i) == true){
           System.out.println(i);
       }
    }
        return ;
    }

    public static void BinarytoDecimal(int num){
       int dc = 0 , i=0;
       while(num>0){
           int ld = num % 10;
           dc =  (dc + ld * (int) (Math.pow(2,i)));
           num = num / 10 ;
           i++ ;
       }
        System.out.println(dc);
    }

    public static void DecimaltoBinary(int num){
      int bn = 0;
      int pow = 0;
      while(num>0){
          int rem = num % 2;
          bn = bn + (rem *(int) Math.pow(10,pow));
          num = num / 2;
          pow++;
      }
        System.out.println(bn);
    }

    public static void avg(int a ,int b , int c ){
       int avg = (a + b + c)/3 ;
        System.out.println(avg);
    }

    public  static boolean isEven(int n){
      if(n % 2 == 0){
          return true ;
      }
          return false ;
    }

    public static boolean isPalindrome(int n) {

      int num =0 ;
      int pow = 0;
      int l = n;
      while(n>0){
          int ld = n % 10 ;
          System.out.println(ld);
          num = num * 10 + ld;
          System.out.println(num);
          n = n / 10;
          System.out.println(n);
          pow++;
      }
        if(l == num){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(isPalindrome(552255)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}
