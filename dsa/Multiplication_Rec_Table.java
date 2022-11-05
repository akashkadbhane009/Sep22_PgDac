import java.util.Scanner;
class Multiplication_Rec_Table
{
	static void multiplication(int n, int i)
	{
		if(i>10)
		return;
		
		System.out.println(n+" * "+i+" = "+n*i);
		multiplication(n, ++i);
			
	}
	
	
	
	
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	multiplication(n, 1);
}
}
