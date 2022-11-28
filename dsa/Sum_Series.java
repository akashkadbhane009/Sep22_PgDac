import java.util.Scanner;
class Sum_Series{
	static float sum(int i, int n, float s){
		if(i>n)
			return s;
		
		else
		{
			if(i%2==0)
				s -= (float)1/i;
			
			else
				s += (float)1/i;
			
			return sum(i+1, n, s);
		}
	}
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter n: ");
	int n = sc.nextInt();
	
	float ans = sum(1, n, 0);
	System.out.println("Answer: "+ans);
	
	}
}
