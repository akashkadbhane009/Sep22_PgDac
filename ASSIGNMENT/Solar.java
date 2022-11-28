import java.util.*;
import java.time.*;

class Solar{
	static int a,b;
	String catg;
	long dia;
	int temp;
	float Odist, Otime;
	
	static void cate(int w){
		if (w==1)
			System.out.println("CLASS=STAR");
		else
			System.out.println("CLASS=PLANET");
	}
	static void diameter(int y){
		switch(y){
			case 1: System.out.println("DIAMETER OF SUN=1,392,684KM");
			break;
			case 2: System.out.println("DIAMETER OF MERCURY=4,879KM");
			break;
			case 3: System.out.println("DIAMETER OF VENUS=12,1044KM");
			break;
			case 4: System.out.println("DIAMETER OF EARTH=12,742KM");
			break;
			case 5: System.out.println("DIAMETER OF MARS=6,792KM");
			break;
			case 6: System.out.println("DIAMETER OF JUPITER=139,822KM");
			break;
			case 7: System.out.println("DIAMETER OF SATURN=116,464KM");
			break;
			case 8: System.out.println("DIAMETER OF URANUS=51,118KM");
			break;
			case 9: System.out.println("DIAMETER OF NEPTUNE=49,493KM");
			break;
			default:System.out.println("INVALID INPUT");
			break;
		}
		
		
	}
	static void SurfaceTemperature(int y){
		switch(y){
			case 1: System.out.println("SURFACE TEMPERATURE OF SUN= 5500°C");
					System.out.println("CORE TEMPERATURE OF SUN= 15million°C");
			break;
			case 2: System.out.println("SURFACE TEMPERATURE OF MERCURY= -173 to 427°C");
			break;
			case 3: System.out.println("SURFACE TEMPERATURE OF VENUS= 462°C");
			break;
			case 4: System.out.println("SURFACE TEMPERATURE OF EARTH= -88 to 58°C");
			break;
			case 5: System.out.println("SURFACE TEMPERATURE OF MARS= -63°C");
			break;
			case 6: System.out.println("SURFACE TEMPERATURE OF JUPITER= -105°C");
			break;
			case 7: System.out.println("SURFACE TEMPERATURE OF SATURN= -108°C");
			break;
			case 8: System.out.println("SURFACE TEMPERATURE OF URANUS= -197°C");
			break;
			case 9: System.out.println("SURFACE TEMPERATURE OF NEPTUNE= -201°C");
			break;
			default:System.out.println("INVALID INPUT");
			break;
		}
		
		
	}
	
	static void KnownMoon(int y){
		switch(y){
			case 1: System.out.println("PLANETS & DRAWF PLANETS OF SUN=13");
			break;
			case 2: System.out.println("KNOWN MOON  OF MERCURY=0");
			break;
			case 3: System.out.println("KNOWN MOON  OF VENUS=0");
			break;
			case 4: System.out.println("KNOWN MOON  OF EARTH=1");
			break;
			case 5: System.out.println("KNOWN MOON  OF MARS=2");
			break;
			case 6: System.out.println("KNOWN MOON  OF JUPITER=67");
			break;
			case 7: System.out.println("KNOWN MOON  OF SATURN=62");
			break;
			case 8: System.out.println("KNOWN MOON  OF URANUS=27");
			break;
			case 9: System.out.println("KNOWN MOON  OF NEPTUNE=13");
			break;
			default:System.out.println("INVALID INPUT");
			break;
		}
		
		
	}
	
	static void period(int y){
		switch(y){
			case 1: System.out.println("SUN IS CENTER OF OUR SOLAR SYSTEM");
			break;
			case 2: System.out.println("ORBITAL PERIOD OF MERCURY=88 DAYS");
			break;
			case 3: System.out.println("ORBITAL PERIOD OF VENUS=224.7 DAYS");
			break;
			case 4: System.out.println("ORBITAL PERIOD OF EARTH=365.2 YEARS");
			break;
			case 5: System.out.println("ORBITAL PERIOD OF MARS=1.9 YEARS");
			break;
			case 6: System.out.println("ORBITAL PERIOD OF JUPITER=11.9 YEARS");
			break;
			case 7: System.out.println("ORBITAL PERIOD OF SATURN=29.5 YEARS");
			break;
			case 8: System.out.println("ORBITAL PERIOD OF URANUS=84 YEARS");
			break;
			case 9: System.out.println("ORBITAL PERIOD OF NEPTUNE=164.8 YEARS");
			break;
			default:System.out.println("INVALID INPUT");
			break;
		}
		
		
	}
	
	static void distance(int y){
		switch(y){
			case 1: System.out.println("SUN DO NOT HAVE ORBIT");
			break;
			case 2: System.out.println("ORBITAL DISTANCE OF MERCURY=57.9 MILLION KM");
			break;
			case 3: System.out.println("ORBITAL DISTANCE OF VENUS=108.2 MILLION KM");
			break;
			case 4: System.out.println("ORBITAL DISTANCE OF EARTH=149.6 MILLION KM");
			break;
			case 5: System.out.println("ORBITAL DISTANCE OF MARS=227.9 MILLION KM");
			break;
			case 6: System.out.println("ORBITAL DISTANCE OF JUPITER=778.3 MILLION KM");
			break;
			case 7: System.out.println("ORBITAL DISTANCE OF SATURN=1.4 BILLION KM");
			break;
			case 8: System.out.println("ORBITAL DISTANCE OF URANUS=2.9 BILLION KM");
			break;
			case 9: System.out.println("ORBITAL DISTANCE OF NEPTUNE=4.5 MILLION KM");
			break;
			default:System.out.println("INVALID INPUT");
			break;
		}
		
		
	}
	
	static void stage1(int x){
		System.out.println();
		System.out.println();
		System.out.println("1.CLASS");
		System.out.println("2.DIAMETER");
		System.out.println("3.KNOWN MOONS");
		System.out.println("4.ORBITAL DISTANCE");
		System.out.println("5.ORBITAL PERIOD");
		System.out.println("6.SURFACE TEMPERATURE");
		System.out.println("7.ALL OF THE ABOVE");
		System.out.println();
		System.out.print("Enter no.:");
		Scanner sc = new Scanner(System.in);
		 b = sc.nextInt();
		
		switch (b){
			case 1: cate(b);
			break;
			case 2: diameter(a);
			break;
			case 3: KnownMoon(a);
			break;
			case 4: distance(a);
			break;
			case 5: period(a);
			break;
			case 6: SurfaceTemperature(a);
			break;
			case 7:	cate(b);
					diameter(a);
					KnownMoon(a);
					distance(a);
					SurfaceTemperature(a);
					
			break;
			default:System.out.println("INVALID INPUT");
			break;
		}
	}
	
	public static void main(String [] args){
		System.out.println("====SOLAR SYSTEM INFORMATION====");
		System.out.println();
		System.out.println("1.SUN");
		System.out.println("2.MERCURY");
		System.out.println("3.VENUS");
		System.out.println("4.EARTH");
		System.out.println("5.MARS");
		System.out.println("6.JUPITER");
		System.out.println("7.SATURN");
		System.out.println("8.URANUS");
		System.out.println("9.NEPTUNE");
		System.out.println();
		System.out.print("Enter no.:");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		switch(a){
			case 1: stage1(1);
			break;
			case 2: stage1(2);
			break;
			case 3: stage1(3);
			break;
			case 4: stage1(4);
			break;
			case 5: stage1(5);
			break;
			case 6: stage1(6);
			break;
			case 7: stage1(7);
			break;
			case 8: stage1(8);
			break;
			case 9: stage1(9);
			break;
			default:System.out.println("INVALID INPUT");
			break;
		}
	}

}	