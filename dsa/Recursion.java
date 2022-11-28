/* Lab Questions : 
1. Write a program to print a series of numbers with recursive Java methods 
2. Write a program to sum a series of numbers with Java recursion 
3. Write a program to calculate a factorial in Java with recursion 
4. Write a program to print the Fibonacci series with Java and recursion 
5.Write a program to implement a recursive Java palindrome checker */

class Recursion{
	
	public static void Q1(int count,int num){

		if(num != 0){
		
		System.out.print(count+" ");
		Q1(++count,num-1);
		}
		
	}
	public static int  Q2(int num){
	int sum = 0;
	if (num != 0){
		sum = num  + Q2(num - 1);
	}
	return sum;
	}
	public static int Q3(int n){
		 if (n != 0)  {
            return n * Q3(n-1); 
		}
        else{
			return 1;
		}
            
	}
	public static void Q4(int a , int b , int n){
		int fib=0;
		if (n == 0){
			return;
		}
		fib = a + b;
		System.out.print(fib+" ");
		Q4(fib,b,n-1);
	}
	public static boolean Q5(String s){
		if (s.length()==0 || s.length()==1)
			return true;
		
		if (s.charAt(0) == s.charAt(s.length()-1))
			return Q5(s.substring(1,s.length()-1));
		return false;
	}
	public static void main(String [] args){
		System.out.println("print a series of numbers");
		int count =1;
		Q1(count,10);
		
		System.out.println("print a sum of  series of numbers");
		int sum = Q2(10);
		System.out.println("Sum = "+sum);
		
		
		System.out.println("Factorial");
		int factorial = Q3(5);
		System.out.println(factorial);
		
		System.out.println("Fibonacci");
		int n = 7 ;// first senven no. of fib series but we are giving first two nos so n-2
		int a = 0;
		int b = 1;
		Q4(a,b,n-2);
		
		System.out.println("Palindrome");
		String str = "akaka";
		if (Q5(str))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str+ " is not a palindrome");
		
	}
}