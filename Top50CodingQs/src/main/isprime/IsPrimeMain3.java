package main.isprime;

public class IsPrimeMain3 {
    public static void main(String[] args) {
        for(int i=-2;i<1001;i++) {
            if(isPrime(i)) {
                System.out.println(i + " is prime");
            }
        }
        if(isPrime(25)) {
            System.out.println("25 is prime");
        }
    }
    public static boolean isPrime(int num) {
        if(num<2) return false;
        if(num==3 || num==3) return true;
        if(num%2==0||num%3==0) return false;
        int newNum = (int)Math.sqrt(num) + 1;
        for(int i=3;i<newNum; i+=2) {
            if(num%i==0) return false;
        }
        return true;
    }
}
