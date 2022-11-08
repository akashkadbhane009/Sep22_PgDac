/*
   1 2 3 4 5 6
    2 3 4 5 6
     3 4 5 6
      4 5 6
       5 6
        6 
	
	*/
	
	
	
import java.util.Scanner;
public class pattern14{
public static void main(String args[]){
int rows;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows");
rows=s.nextInt();
for(int i=1; i<=rows; i++){//do for rows in pyramid
   for(int j=1; j<=i; j++){
     System.out.print(" ");//print space
}
for(int k=i; k<=rows; k++){
     System.out.print(k+" ");
}
System.out.println();
}
}
}