import java.lang.*;
import java.util.*;

/* diet for male and female for weight loss ang weight gain , by giving output 
as protein , carb and fats needed to comsume in a day .
Adding to above you can calcualte BMI(Body Mass Index) whic will display ur BMI with ur weight 
category.
@006_Akash Kadbhane_jh
*/

class male{
	double protein, carb, fats, wt ,tcal;
	
	male(){
		protein=0;
		carb=0;
		fats=0;
		wt = 0;	
	}
	
	void switch1(){
		Scanner sc = new Scanner(System.in);
			System.out.println("==========================");
		System.out.println("1.WEIGHTGAIN");
		System.out.println("2.WEIGHTLOSS");
		System.out.println("==========================");
		int ch1 = sc.nextInt();
		switch (ch1){
			case 1 :
					male ob3 = new male();
					ob3.WeightGain();
			break;
			case 2 :
					male ob4 = new male();
					ob4.WeightGain();
			break;
			default:
			break;
		}
	}

	void WeightGain(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter wegiht");
		wt =  sc.nextDouble();
		
		protein = (2.8 * wt);
		carb = (3.2 * wt);
		fats = (1.2 * wt);		
		
		tcal =(protein * 4) + (carb * 4) + (fats * 9);
		
		displayWG(protein, carb, fats,tcal);
	}

	static void displayWG(double x, double y , double z, double w){
		System.out.println("PROTEIN="+x+"gms");
		System.out.println("CARBS="+y+"gms");
		System.out.println("FATS="+z+"gms");
		System.out.println("TOTAL CALORIES ="+w+"kcal");
	}
	
	void WeightLoss(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter wegiht");
		wt =  sc.nextDouble();
		
		protein = (1.9 * wt);
		carb = (1.5 * wt);
		fats = (0.5 * wt);
		displayWL(protein, carb, fats);
	}
	
	static void displayWL(double x, double y , double z){
		System.out.println("PROTEIN="+x);
		System.out.println("CARBS="+y);
		System.out.println("FATS="+z);
	}

}

class female{
	double protein, carb, fats, wt , ht;
	
	female(){
		protein=0;
		carb=0;
		fats=0;
		wt = 0;	
	}
	
	void switch2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("1.WEIGHTGAIN");
		System.out.println("2.WEIGHTLOSS");
		System.out.println("==========================");
		int ch2 = sc.nextInt();
		switch (ch2){
			case 1 :
					female ob3 = new female();
					ob3.WeightGain1();
			break;
			case 2 :
					female ob4 = new female();
					ob4.WeightLoss1();
			break;
			default:
			break;
		}
		
	}

	void WeightGain1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter wegiht");
		wt =  sc.nextDouble();
		
		protein = (1.85 * wt);
		carb = (2.5 * wt);
		fats = (wt);
		displayWG1(protein, carb, fats);
		
	}
	
	static void displayWG1(double x, double y , double z){
		System.out.println("PROTEIN="+x);
		System.out.println("CARBS="+y);
		System.out.println("FATS="+z);
	}

	void WeightLoss1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter wegiht");
		wt =  sc.nextDouble();
		
		protein = (1.75 * wt);
		carb = ( wt);
		fats = (0.4 * wt);
		displayWL1(protein, carb, fats);
	}
	
	static void displayWL1(double x, double y , double z){
		System.out.println("PROTEIN="+x);
		System.out.println("CARBS="+y);
		System.out.println("FATS="+z);
	}
	
}

class bmi{
	double bmi, wt , ht; //  bmi= Body Mass Index ; wt = Weight ; ht= Height.
	 

	bmi(){
		bmi = 0;
		wt = 0;
		ht = 0;
		
	}
	
	void cal1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter wegiht");
		wt =  sc.nextDouble();
		System.out.println("enter hegiht");
		ht =  sc.nextDouble();
		
		double w =  (0.3048*ht)*(0.3048*ht);
		
		bmi = ( wt / w );
		
		result(bmi);
	}
	
	static void result(double x) {
		
		System.out.println("BMI= "+x);
		
	
		if (x < 18.5) System.out.println("underweight");
		if (18.5<= x && x < 24.9) System.out.println("normal wegiht");
		if (25 < x && x < 29.9) System.out.println("overweight");
		if (30 < x && x < 34.9) System.out.println("obesity class I");
		if (35 < x && x < 39.9) System.out.println("obesityesity class II");
		if (x > 40) System.out.println("extrem obesity");
	}


}

public class Diet{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====HEALTH IS WEALTH=====");
		System.out.println("1.DIET");
		System.out.println("2.BMI");
		System.out.println("==========================");
		int ch = sc.nextInt();
		
		switch (ch){
			case 1 : //diet 
				System.out.println("==========================");
				System.out.println("1.MALE");
				System.out.println("2.FEMALE");
				System.out.println("==========================");
				String ch1 = sc.next();		
				switch (ch1){
					case "1" :  //male
						male ob1 = new male();
						ob1.switch1();
					break;
					case "2" : //female
						female ob2 = new female();
						ob2.switch2();
					break;
					default : 
					break;
				}
			break;
			case 2 : //bmi
					bmi ak = new bmi();
					ak.cal1();
			break;
			default :
			break;
		}
	}
}