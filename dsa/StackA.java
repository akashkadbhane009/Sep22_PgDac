import java.util.*;
class StackA
{
	int max = 10;
	int top = -1;
	int s[] = new int[max];
	
	
	boolean isEmpty()
	{
		return top == -1;
	}
	
	boolean isFull()
	{
		return top == (max - 1);
	}
	
	
	void push(int a)
	{

		s[++top] = a;
		System.out.println("Push: "+a);
	}
	
	int pop()
	{
		return s[top--];
	}
	
	int peek()
	{
		return s[top];
	}
	
	
public static void main(String args[])
{
	/*
	Stack s1 = new Stack();
	s1.push(10);
	s1.push(20);
	s1.push(30);
	s1.pop();
	System.out.println(s1.peek());
	*/
	Stack s1 = new Stack();
	
	int choice;
	do
	{

		System.out.println("1. push ");
		System.out.println("2. pop ");
		System.out.println("3. peek ");
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		
	switch(choice)
	{
		case 1: 
		{
			System.out.print("Enter your element to be added : ");
			int key = sc.nextInt();
			
			if(s1.isFull())
			System.out.println("stack is full");
			
			else
			{
				s1.push(key);
			}
			break;
		}
		
		case 2:
		{
			if(s1.isEmpty())
			{
				System.out.println("stack is empty");
			}
			else
			{
				s1.pop();
			}
			break;
		}
		
		case 3: 
		{
			if(s1.isEmpty())
			{
				System.out.println("stack is empty");
			
			}
			else
			{
				int key = s1.peek();
				System.out.println("peeked element is: "+key);
				
			}
			break;
		} 
	}
	}while(choice != 0);
	
}

}