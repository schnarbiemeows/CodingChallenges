package classes;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/*
	 * This solution works, not enough submissions to give me a distribution though
	 * lesson learned from this: 
	 * 1.) I started by trying to figure out how to manually make each individual possibility iteratively
	 * 2.) It seemed a lot easier to just make every possibility and then filter out the invalid ones
	 * 3.) However, the amount of data created via option 2 was such much more that the time performance
	 * of this solution was too long
	 * 4.) remember to consider recursively making data as well as iteratively if iteratively seems to complicated
	 * I was trying to find an iterative data creation algorithm, when a recursive data creation algorithm was
	 * much easier! 
	 */
	public int[] numsSameConsecDiff(int N, int K) {
        if(N==1) {
        	int[] answer = {0,1,2,3,4,5,6,7,8,9};
        	return answer;
        }
        if(K==0) {
        	int[] answer = new int[9];
        	for(int i=1;i<=9;i++) {
        		int temp = 0;
        		int counter = N;
        		while(counter>0) {
        			temp=temp*10+i;
        			counter--;
        		}
        		answer[i-1]=temp;
        	}
        	return answer;
        }
        List<Integer> answers = new ArrayList<Integer>();
        for(int i=1; i<=9 ; i++) {
        	makeNums(0,N, i, K,answers);
        }
        int[] answerarray = new int[answers.size()];
        for(int i=0;i<answers.size();i++) {
        	answerarray[i]=answers.get(i);
        }
        return answerarray;
    }
	
	/*
	 * this solution works, but it times out, so I cant create all values and then filter
	 * I have to create all values
	 
	public int[] numsSameConsecDiff(int N, int K) {
        if(N==1) {
        	int[] answer = {0,1,2,3,4,5,6,7,8,9};
        	return answer;
        }
        List<Integer> answer = new ArrayList<Integer>();
        for(int i=(int) Math.pow(10, N-1);i<(int)Math.pow(10, N);i++) {
        	answer.add(i);
        }
        for(int i=(int) Math.pow(10, N-1);i<(int)Math.pow(10, N);i++) {
        	if(isValid(i,K)) 
        		answer.add(i);
        }
        int[] answerarray = new int[answer.size()];
        for(int i=0;i<answer.size();i++) {
        	answerarray[i]=answer.get(i);
        }
    }
	
	private boolean isValid(int num, int k) {
		if(num<10) return true;
		int remainder = num%10;
		int next = (num/10)%10;
		if(Math.abs(remainder-next)!=k) return false;
		return isValid(num/10,k);
	}
	*/
	
	private void makeNums(int index,int N, int currentNum, int k,List<Integer> items) {
		// if the index is at the end(N) add it to the set
		if(index==N-1)  {
			items.add(currentNum);
		}
		else {
			if(currentNum%10+k<=9) {
				makeNums(index+1,N,currentNum*10+(currentNum%10+k),k,items);
			}
			if(currentNum%10-k>=0) {
				makeNums(index+1,N,currentNum*10+(currentNum%10-k),k,items);
			}
		}
	}
}
