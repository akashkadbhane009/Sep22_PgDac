/*

1
10
101
1010
10101
*/

import java.util.Scanner;
 
public class pattern8
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Number of rows you want in this pattern?");
 
        int rows = scanner.nextInt();
        System.out.println("----Pattern is----");
 
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
 
            System.out.println();
        }
 
        scanner.close();
    }
}