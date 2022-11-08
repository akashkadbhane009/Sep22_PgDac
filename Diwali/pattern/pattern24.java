/*
1 2 3 4 5 6 7
2 3 4 5 6 7 1
3 4 5 6 7 1 2
4 5 6 7 1 2 3
5 6 7 1 2 3 4
6 7 1 2 3 4 5
7 1 2 3 4 5 6
*/

import java.util.Scanner;
 
public class pattern24
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");

        for(int i=1;i< rows+1 ;i++)
        {
            for(int j=i; j < rows+1 ;j++)
            {
                System.out.print(j + " ");
            }
            for(int k=1; k < i ;k++)
            {
                System.out.print(k + " ");
		    }
            System.out.println();
        }
        
        sc.close();
    }
}