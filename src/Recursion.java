public class Recursion {

	// Part 1: complete
	public static int sum(int n){
	if (n == 0)
	{
		return 0;
	}
	else
		return n + sum(n-1); 
	}

	// Part 1 complete
	public static int multiply(int m, int n){
	// If the number is positive enter this
	if(n > 0)
	{
		if (n == 1)
		{
			return m;
		}
		else
		{
			return m + multiply(m, n-1);
		}
	}
	// If the number is negative enter this
	else
	{
		if(n == -1)
		{
			return -m;
		}
		return -m - multiply(-m, n+1);
	}
	}
	
	// Part 1: complete
	public static int Fibonacci(int n){
		if (n==0)
		{
			return 0;
		}
		else if (n<2)
		{
			return 1;
		}
		else
			return Fibonacci(n-2) + Fibonacci(n-1); // dummy value to be removed.
	}


}