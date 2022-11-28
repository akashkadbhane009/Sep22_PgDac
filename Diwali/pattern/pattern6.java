/*

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/

import java.util.*;
 
class pattern6
{
	public static void main(String args[])
	{
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=i;j>=1;j--)
        		{
            			System.out.print(j);
        		}
 
        		System.out.println("");
    		}
	}
}