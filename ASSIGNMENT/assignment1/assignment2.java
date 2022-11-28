class Calculator {
	static void powerint(int num1,int num2) {
		double power = 0;
		power = Math.pow(num1, num2);
		System.out.println("PowerInt="+power);
		
	}
	
	static void powerint(double num1,int num2) {
		double power = 0;
		power = Math.pow(num1, num2);
		System.out.println("PowerInt="+power);
		
	}
}
public class assignment2 {
	
	static void breakdown(int num ) {
	int count = 0 , temp;
	temp=num;

	while (temp !=0) {
		count++;
		temp/=10;
	}
	System.out.println("count="+count);
	int temp2=num;
	for (int i=1;i<=count;i++) {
		int a=(count-i);
		int c =(int)(Math.pow(10, a));
		int b=(temp2/c%10); 
	
		int d = b*c;
		System.out.print(d);
		
		if(i == count ) 
		System.out.print(" ");
	
		else
			System.out.print("+");
	}
			
	}
	
	public static void main(String[] args) {
		breakdown(12345678);
		System.out.println();
		Calculator.powerint(2, 4);
		Calculator.powerint(1.2, 2);

	}

}
