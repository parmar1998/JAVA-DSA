package FullTest3;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	//Super Primes
	//Question- first get prime no till n,then get prime no we are getting on prime position
//          2,3,5,7,11,13,17,19,23,29
//	        1,2,3,4,5,6,7,8,9,10,11 so we need to get value at index which are prime
	
	//in this method we are continuously dividing by multiple of p which are left are prime no.
	public static void sieveOfEratosthenes(int n,boolean isPrime[] ) {
		
		isPrime[0]=isPrime[1]=false;
		
		for(int i=2;i<=n;i++) 
			isPrime[i]=true;
		
		for(int p=2;p*p<=n;p++) {
			if(isPrime[p]==true)
			{
				for(int i=p*2;i<=n;i+=p) {
					isPrime[i]=false;
				}
				
			}
				
		}
	}
	public static void Superprime(int n) {
		boolean isPrime[]=new boolean[n+1];
		sieveOfEratosthenes(n, isPrime);
		int primes[]=new int[n+1];
		int j=0;
		//storing all the prime  generated in array primes
		for(int p=2;p<=n;p++) 
			if(isPrime[p])
				primes[j++]=p;
		//printing all those prime numbers that occupy prime position
		for(int k=0;k<j;k++) {
			if(isPrime[k+1])
				System.out.print(primes[k]+" ");
		}
	}
	
	//game of Numbers
	//subtract 1 from number
	//multiply by 2 
	public static int findmin(int X,int Y)
	{
		int ans =0;
		while(Y>X)
		{
			ans++;
			if(Y%2==1)
			Y++;
			else
			Y/=2;
		}
		return ans+X-Y;
	}
	
	//Even Sum - removing an element from array to get resultant sum of array as even.(only remove one element)
	public static int find_num_of_ways(int arr[], int N) {
		int count_even=0;
		int count_odd=0;
		//finding count of even and odd elements
		for(int i=0;i<N;i++) {
			if(arr[i]%2==1)
				count_odd++;
			else
				count_even++;
		}
		if (count_odd % 2 == 1) {
			return count_odd;
		}
		else {
			return count_even;
		}
	}
	//Calculator
	public static int evaluate(String expression) {
		char[] tokens = expression.toCharArray();

		// Stack for numbers: 'values'
		Stack<Integer> values = new Stack<Integer>();

		// Stack for Operators: 'ops'
		Stack<Character> ops = new Stack<Character>();

		for (int i = 0; i < tokens.length; i++) {
			// Current token is a
			// whitespace, skip it
			if (tokens[i] == ' ')
				continue;

			// Current token is a number,
			// push it to stack for numbers
			if (tokens[i] >= '0' &&
					tokens[i] <= '9') {
				StringBuffer sbuf = new StringBuffer();

				// There may be more than one
				// digits in number
				while (i < tokens.length &&
						tokens[i] >= '0' &&
						tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				values.push(Integer.parseInt(sbuf.toString()));

				// right now the i points to
				// the character next to the digit,
				// since the for loop also increases
				// the i, we would skip one
				// token position; we need to
				// decrease the value of i by 1 to
				// correct the offset.
				i--;
			}

			// Current token is an opening brace,
			// push it to 'ops'
			else if (tokens[i] == '(')
				ops.push(tokens[i]);

			// Closing brace encountered,
			// solve entire brace
			else if (tokens[i] == ')') {
				while (ops.peek() != '(')
					values.push(applyOp(ops.pop(),
							values.pop(),
							values.pop()));
				ops.pop();
			}
			// Current token is an operator.
			else if (tokens[i] == '+' ||
					tokens[i] == '-' ||
					tokens[i] == '*' ||
					tokens[i] == '/') {
				// While top of 'ops' has same
				// or greater precedence to current
				// token, which is an operator.
				// Apply operator on top of 'ops'
				// to top two elements in values stack
				while (!ops.empty() &&
						hasPrecedence(tokens[i],
								ops.peek()))
					values.push(applyOp(ops.pop(),
							values.pop(),
							values.pop()));

				// Push current token to 'ops'.
				ops.push(tokens[i]);
			}
		}
		// Entire expression has been
		// parsed at this point, apply remaining
		// ops to remaining values
		while (!ops.isEmpty())
			values.push(applyOp(ops.pop(),
					values.pop(),
					values.pop()));

		// Top of 'values' contains
		// result, return it
		return values.pop();
	}
	public static boolean hasPrecedence(
			char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') &&
				(op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}
	public static int applyOp(char op, int b, int a) {
		switch (op) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				if (b == 0)
					throw new UnsupportedOperationException(
							"Cannot divide by zero");
				return a / b;
		}
		return 0;
	}

	//Array Cost
	
	
	public static void main(String[] args) {
//		main for super Prime 
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		Superprime(n);
		
//		main for game of numbers
//		Scanner sc=new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		System.out.println(findmin(x,y));
//		sc.close();

		
//		Main for EvenSum number of ways
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++)
//		{
//			arr[i] = s.nextInt();
//		}

		// Function call
		System.out.print(evaluate("5-2-1+3"));
//		s.close();
	}

}
