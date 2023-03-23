package main.isprime;

/**
 * 4:00 - 4:10
 * chek 25 whenever you do this algorithm
 * int newNum = (int) Math.sqrt(num)+1
 */
public class IsPrimeMain2 {

    public static void main(String[] args) {
        for(int i=-1;i<1001;i++) {
            if (isPrime(i)) {

                System.out.println(i + " is prime");
            }
        }
    }

    public static boolean isPrime(int i) {
        if(i<2) return false;
        if(i==2 || i==3) return true;
        if(i%2==0 || i%3==0) return false;
        int num = (int)Math.sqrt(i)+1;
        for(int j=3;j<num;j+=2) {
            if(i%j==0) return false;
        }
        return true;
    }
}
