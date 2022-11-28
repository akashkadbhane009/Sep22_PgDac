class Overloading1{
	
	public static void print(){
		System.out.println("paramerter less constructor");
		
	}
	public static void print(int a){
		int x = a+12;
		System.out.println(x);
		
	}
	public static void print(float a,float b){
		float x = a + b;
		System.out.println(x);
		
	}
	public static void print(double a, double b, double c){
		double x= a+b+c;
		System.out.println(x);
	}
	public static void print(String s){
		System.out.println(s);
		
	}
}
class Overloading{	
	public static void main (String [] args){
		
		
		 Overloading1.print();
		 Overloading1.print(12);
		 Overloading1.print(10.12f,10.88f);
		 Overloading1.print(10.98,23.55,25.1234);
		 Overloading1.print("Overloding");
	}
	
}