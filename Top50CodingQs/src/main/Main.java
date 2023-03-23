package main;

import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int num = -11;
        System.out.println("the number : " + num + " is prime? = " + isPrime(num));

    }
    public static boolean isPrime(int num) {
        if(num%2==0) {
            return false;
        } else {
            return prime(Math.abs(num),Math.abs(num)-1);
        }
    }
    public static boolean prime(int num, int divisor) {
        if(divisor<1) {
            return true;
        } else {
            if(num%divisor==0) {
                return false;
            }else return prime(num,divisor-1);
        }
    }
}
