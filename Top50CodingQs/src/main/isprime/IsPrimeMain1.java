package main.isprime;


/**
 * 6:08 - 6:17
 *  cant solve for the edge where the squares are in the list(25, 49,,)
 */
public class IsPrimeMain1 {
    public static void main(String[] args) {
        for(int i=0; i<1000;i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }

        }
        isPrime(25);
    }
    public static boolean isPrime(int num) {
        if(num<2) return false;
        if(num==2 || num==3) return true;
        if(num%2==0 ||num%3==0) return false;
        int sqrt = (int) Math.sqrt(num) + 1;
        for(int i=3; i<sqrt;i+=2) {
            if(num%i==0) return false;
        }
        return true;
    }
    /**
     * here's the best answer - 4 lines!
     * but its not correct
     */
    public static boolean isPrimeOrNot(int num) {
        if(num<2) return false;
        if(num==2 || num==3) return true;
        if ((num * num - 1) % 24 == 0) return true;
        return false;
    }



}
