/*1.area and circumference of circle
 *2.percentage of subjects
 *3.simpleIntrest
 *4.days to years , month , days
 *5.temperature celcius to faranite
 *6.swap num without third variable
 *7.salary calcuator
 * @006_Akash_Kadbhane_JH
 * */

import java.util.Scanner;

public class Assignment1 {
	static void circle(){
		float area , cirm , pi=  3.14f ;
		System.out.println("Enter the radius(in mm) of circle to find Area and Circumference=");
		Scanner sc= new Scanner(System.in);
		float radius = sc.nextFloat();
		area = (pi/4)*(radius*radius);
		cirm = 2*pi*radius;
		sc.close();
		System.out.println("circle\narea="+area+"sqmm\ncirm="+cirm+"mm");
	}
	static void  percentages() {
		float tot, page; 
		System.out.println("Enter marks of subjects :");
		Scanner ss= new Scanner(System.in);
		System.out.print("English=");
		int s1 =ss.nextInt();
		System.out.print("Maths=");
		int s2 =ss.nextInt();
		System.out.print("Science=");
		int s3 =ss.nextInt();
		System.out.print("Social Studies=");
		int s4 =ss.nextInt();
		System.out.print("Marathi=");
		int s5 =ss.nextInt();
		ss.close();
		tot = s1+s2+s3+s4+s5;
		page = (tot/500)*100;
		System.out.println("Percentage="+page);
	}
	static void si() {
		float simpleI;
		System.out.println("Enter Princlple Ammount:");
		Scanner sa= new Scanner(System.in);
		int pa =sa.nextInt();
		System.out.println("Enter Rate of Intrest:");
		int rate =sa.nextInt();
		System.out.println("Enter Period:");
		int time =sa.nextInt();
		sa.close();
		simpleI = (pa*rate*time)/100;
		System.out.println("Simple Intreast ="+simpleI);
	}
	static void days() {
		int years ,months;
		Scanner sb= new Scanner(System.in);
		System.out.println("Enter total  no. of days =");
		int days = sb.nextInt();
		sb.close();
		int temp = days  ;
		years = days / 365;
		months = (days%365)/30;
		temp = (days % 365)%30;
		
		System.out.println(days+"days="+years+"years,"+months+"months;"+temp+"days");
		
	}
	static void tempreature() {
		float c;
		Scanner sd= new Scanner(System.in);
		System.out.println("Enter tempreature in Faranites =");
		float ft = sd.nextFloat();
		sd.close();
		c=5*(ft-32)/9;
		System.out.println(ft+"°F="+c+"°C");
	}
	static void swap() {
		
		Scanner se= new Scanner(System.in);
		System.out.println("Enter no.s =");
		System.out.print("x =");
		int x = se.nextInt();
		System.out.println();
		System.out.print("y =");
		int y = se.nextInt();
		System.out.println("BEFORE:x="+x+",y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("AFTER:x="+x+",y="+y);
	se.close();
	}
	static void salary() {
		float hra , da , gs;
		System.out.println("Enter youe Basic Salary =");
		Scanner sq = new Scanner(System.in) ;
		int bs = sq.nextInt();
		sq.close();
		if(bs<10000) {
			hra=(bs*0.1f);
			da = (bs*0.9f);
			gs= (bs+hra+da);
			System.out.println("GROSS SALARY="+gs);
			
		}
		else {
			hra=2000;
			da = (bs*0.98f);
			gs= (bs+hra+da);
			System.out.println("GROSS SALARY="+gs);
			
		}
				
	}

	public static void main(String[] args) {
		
		//System.out.println("welcome"+args[0]);
		//System.out.println("welcome"+args[1]);
	circle();
	percentages();
	si();
	days();
	tempreature();
	swap();
	salary();
//System.out.println("welcome"+args[0]);
	}

}
