package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Better {
    public static void main(String[] args) {
        for(int i=-1;i<1000;i++) {
            if(isBetterPrime(i)==true) {
                System.out.println(i + " is prime");
            }
        }
    }
    private static boolean isPrime(int num) {
        if(num%2==0) return false;
        if(num>=10&&(num%10==0||num%10==5)) return false;
        int absnum = Math.abs(num);
        int temp = absnum;
        int sum = 0;
        while(temp>0) {
            sum=sum*10+temp%10;
            temp=temp/10;
        }
        if(temp%3==0) return false;
        for(int i=absnum-1;i>1;i--) {
            if(absnum%i==0) return false;
        }
        return true;
    }

    /**
     * this is a streaming solution
     * assemble a list of all the integers from 2 to the number
     * filter out numbers divisible by 2 or 3
     * if your number is not in the list(always will be the last item), then it was divisble by either 2 or 3, so its not prime
     * if your number is still in the list(always will be the last item), then
     * filter out any numbers <=SQRT(num)
     * then check each one(in parallel) to see if its num % x ==0
     * combine the booleans with each other using OR(if one true is found, the number is not prime)
     * return !results
     * @param num
     * @return
     */
    private static boolean isBetterPrime(int num) {
        if(num<1) return false;
        if(num==2 || num == 3) return true;
        List<Integer> list = IntStream.range(2, num+1)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> smaller2 = list.parallelStream().filter(x -> x%2!=0)
                .collect(Collectors.toList());
        List<Integer> smaller3 = smaller2.parallelStream().filter(x -> x%3!=0)
                .collect(Collectors.toList());
        if((smaller3.size()>0)&&smaller3.get(smaller3.size()-1)==num) {  // if our number is in the list then its not divisible by 2 or 3
            List<Integer> smaller = smaller3.parallelStream().filter(x -> x*x<=num)
                    .collect(Collectors.toList());
            boolean result = smaller.stream()
                    .map(x -> num%x==0)
                    .reduce(false,(x,y) -> x || y).booleanValue();
            return !result;
        } else {
            return false; // else it was divisible by 2 or 3 so, its not prime
        }
    }
}
