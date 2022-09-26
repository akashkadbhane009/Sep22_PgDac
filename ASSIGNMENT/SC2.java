import java.util.*;
//program for grading with i/p of marks
class SC2{
	public static void main (String args[]){
		
		Scanner ch = new Scanner(System.in);
		
		int a = ch.nextInt();
		
		if(a<40)
			a=1;
			
		if(40<=a&&a<50)
			a=2;
		
		if(50<a&&a<=60)
			a=3;
		
		if(60<a&&a<85)
			a=4;
		
		if(a>=85)
			a=5;
		
		switch (a){
			case 1 :	 System.out.println("****   *   ***** *");
						 System.out.println("*     * *    *   *");
						 System.out.println("***  *****   *   *");
						 System.out.println("*    *   *   *   *");
						 System.out.println("*    *   * ***** *****");
				break;
			case 2 :System.out.println("THIRD");
				break;
			case 3 :System.out.println("SECOND");
				break;
			case 4 :System.out.println("FIRST");
				break;
			case 5 :System.out.println("DISTINCTION");
				break;
			
			default :System.out.println("ERROR 404");
				break;
		}
	}
}