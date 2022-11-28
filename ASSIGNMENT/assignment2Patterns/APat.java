class APat{
	
	public static void main (String args[]){
		System.out.println("ASSIGNMENT");
		//pattern1
		System.out.println("PATTERN 1");
		for (int i= 1; i<=5;i++) {
			
			for(int j =1 ; j <= i ; j++) {
		
				System.out.print(j);
				
			}
			
			System.out.println();	
		}
		//pattern 2
		System.out.println();
		System.out.println("PATTERN 2");
		char a = 65;
		for (int i= 1; i<=5;i++) {
			
			for(char j =1; j <= i ; j++) {
				
				
				System.out.print(a+" ");
				a++;	
			}
			a=65;
			System.out.println();	
		}
		//pattern3
		System.out.println();
		System.out.println("PATTERN 3");
		for (int i= 1; i<=5;i++) {
			
			for(int j =1 ; j <= i ; j++) {
		
				System.out.print("* ");
				
			}
			
			System.out.println();	
		}
		//pattern4
		System.out.println();
		System.out.println("PATTERN 4");
		for (int i= 1; i<=5;i++) {
			
			for(int j =1 ; j <= i ; j++) {
		
				System.out.print(i);
				
			}
			
			System.out.println();	
		}
		//pattern 5
		System.out.println();
		System.out.println("PATTERN 5");
		char b = 65;
		for (int i= 1; i<=5;i++) {
			
			for(char j =1; j <= i ; j++) {
			
				System.out.print(b);
			}
			b++;
			System.out.println();	
		}
		//pattern6
		System.out.println();
		System.out.println("PATTERN 6");
		for (int i= 1; i<=5;i++) {
			
			for(int j =4 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(int x=1;x<=i;x++){
				
				System.out.print("* ");
			}
			
			System.out.println();	
		}
		//pattern7
		System.out.println();
		System.out.println("PATTERN 7");
		for (int i= 1; i<=5;i++) {
			
			for(int j =4 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(int x=1;x<=i;x++){
				
				System.out.print(x+" ");
			}
			
			System.out.println();	
		}
		//pattern8
		System.out.println();
		System.out.println("PATTERN 8 ");
		int x=5;
		for (int i= 5; i>=1;i--) {
			
			for(int j =1 ; j <= i-1; j++) {
		
				System.out.print(" ");
				
			}
			for(int y=5;y>=i;y--){
				
				System.out.print(x+" ");
				x--;
			}
			for(int j =1;j<=i;j++){
				x--;
			}
			x=5;
			System.out.println();	
		}
		//pattern 9
		System.out.println();
		System.out.println("PATTERN 9");
		char c = 65;
		for (int i= 1; i<=5;i++) {
			for(int j =4 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(char j =1; j <= i ; j++) {
				
				
				System.out.print(c+" ");
				c++;	
			}
			c=65;
			System.out.println();	
		}
		//pattern 10
		System.out.println();
		System.out.println("PATTERN 10 ");
		char d = 69;
		for (int i= 1; i<=5;i++) {
			for(int j =4 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			
			for(char j =1; j <= i ; j++) {
				
				
				System.out.print(d+" ");
				d--;	
			}
			for(int j =1;j<=i;j++){
				d--;
			}
			d=69;
			System.out.println();	
		}
		//pattern11
		System.out.println();
		System.out.println("PATTERN 11");
		for (int i= 1; i<=5;i++) {
			
			for(int j =4 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++){
				
				System.out.print("*");
			}
			for(int j =2 ; j <= i ; j++) {
		
				System.out.print("*");
				
			}
			System.out.println();	
		}
		//pattern 12
		System.out.println();
		System.out.println("PATTERN 12");
		for (int i= 1; i<=5;i++) {
			
			for(int j =4 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++){
				
				System.out.print(i+" ");
			}
			
			System.out.println();	
		}
		//pattern 13
		System.out.println();
		System.out.println("PATTERN 13");
		char e=65;
		for (int i= 1; i<=5;i++) {
			
			for(int j =4 ; j >= i ; j--) {
		
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++){
				
				System.out.print(e+" ");
				
			}
			e++;
			System.out.println();	
		}
		//pattern14
		System.out.println();
		System.out.println("PATTERN 14");
		for (int i= 1; i<=5;i++) {
			
			for(int j =1 ; j <=6-i ; j++) {
		
				System.out.print(j+" ");
				
			}
			
			System.out.println();	
		}
		//pattern15
		System.out.println();
		System.out.println("PATTERN 15");
		int z=5;
		for (int i= 5; i>=1;i--) {
			
			for(int y=1;y<=i;y++){
				
				System.out.print(z+" ");
				z--;
			}
			z=5;
			System.out.println();	
		}
		//pattern16
		System.out.println();
		System.out.println("PATTERN 16");
		int w=5;
		for (int i= 5; i>=1;i--) {
			
			for(int y=5;y>=i;y--){
				
				System.out.print(w+" ");
				w--;
			}
			w=5;
			System.out.println();	
		}
		//pattern17
		System.out.println();
		System.out.println("PATTERN 17");
		int v=1;
		for (int i= 1; i<=5;i++) {
			
			for(int j =1 ; j <= i ; j++) {
		
				System.out.print(v+" ");
				v++;
			}
			
			System.out.println();	
		}
		//pattern18
		System.out.println();
		System.out.println("PATTERN 18");
		char f=65;
		for (int i= 1; i<=5;i++) {
			
			for(int j =1 ; j <=6-i ; j++) {
		
				System.out.print(f+" ");
				f++;
			}
			f=65;
			System.out.println();	
		}
		
	}
}	