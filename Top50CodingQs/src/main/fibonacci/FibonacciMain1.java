package main.fibonacci;

/**
 * took about 5-7 minutes to do
 */
public class FibonacciMain1 {
    public static void main(String[] args) {
        int num = 8;
        for(int i= 1;i<20;i++) {
            System.out.println("i =" + i + ", fib(i) = " + calcFib(i));
        }
    }

    public static int calcFib(int num) {
        if (num<1) return 0;
        else return fib(num);
    }
    public static int fib(int num) {
        if(num ==1 || num==2) return 1;
        else return fib(num-1) + fib(num-2);
    }
}
