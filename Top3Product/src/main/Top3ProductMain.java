package main;

public class Top3ProductMain {

	/*
	 * difficulty - EASY
	 * Given an integer array, find 3 numbers whose product is a maximum and output the maximum product
	 * Note:
	 * 1. the length of the given array will be between 3 - 10000 numbers, each in the range of -1000 t 1000
	 * 2. Multiplication of any 3 numbers in the input will not exceed the range of a 32-bit signed integer
	 */
	public static void main(String[] args) {
		int[] myArray = {-4,-3,-2,-1,20};
		/*
		 * my solution - 
		 * 1. integers could be repeated, so we can't just use a priority queue, because that does not allow duplicates
		 * 2. the numbers are in a set range, so we could use a counting sort O(n), and then just pluck the top 3
		 * 
		 * So, I did:
		 * 1. a Counting sort, and then, 
		 * 2. starting from the highest end of the array, just pulled the top 3
		 * #s(taking into account that there could be duplicates, and took the product
		 * 
		 * ISSUES encountered/ LESSONS learned - 
		 * 
		 * #1 - I forgot that the product of 2 NEGatives is a POSitive! So, I had to rework step 2 and add a step 3:
		 * 
		 *  1. Do a counting sort
		 *  2. get the MAX and the product of the TOP 3 #s
		 *  3. from the negative end of the array, find the lowest 2 #'s, which would make the highest product of 2 negative 
		 *  #s
		 *  4. take the MAX of ( PROD of top 3 #s) and (MAX * PROD of lowest 2 negative #s)
		 *  
		 *  #2 - for small samples like {-4,-1,0,20}, during step #2, when I would decrement the array slot, that would prevent
		 *  step #3 from finding that same # again(-1 in this case), so for this case, the MAX=20, PROD_top_3=-20
		 *  but the PROD_2_lowest = -4, not 4(because the -1 slot had been decremented to 0, so the answer was -20 instead of 80
		 *  
		 *  So, I used temp counters in place of directly decrementing the slots
		 *  
		 *  #3 - the default values for greatest3product and greatestTwoProduct were defaulted to 1, so for cases like 
		 *  {-1,0,100} this was giving me a 1 instead of 0, so I had to add booleans to detect if the step #3 loop
		 *  was even being entered
		 *  
		 *  final result beat 87.92% of submissions, but I had to submit like 4-5 times 
		 */
		SecondSolution mySolution = new SecondSolution();
		int answer1 = mySolution.maximumProduct(myArray);
		// edge cases?
		// test with -1000
		// test with all negatives
		// test with all zeros
		// test with all 1000s
		System.out.println(answer1);
		/*System.out.println("all zeros");
		int[] myArray2 = {0,0,0};
		int answer2 = mySolution.maximumProduct(myArray2);
		System.out.println(answer2);
		System.out.println("all thousands");
		int[] myArray3 = {1000,1000,1000};
		int answer3 = mySolution.maximumProduct(myArray3);
		System.out.println(answer3);
		System.out.println("all minus thousands");
		int[] myArray4 = {-1000,-1000,-1000,-1000};
		int answer4 = mySolution.maximumProduct(myArray4);
		System.out.println(answer4);
		System.out.println("all minus 1000,1000,999,999");
		int[] myArray5 = {1000,999,999,-1};
		int answer5 = mySolution.maximumProduct(myArray5);
		System.out.println(answer5);
		System.out.println("using -4,-3,-2,-1,20");
		int[] myArray6 = {-4,-3,-2,-1,20};
		int answer6 = mySolution.maximumProduct(myArray6);
		System.out.println(answer6);*/
		
	}

}
