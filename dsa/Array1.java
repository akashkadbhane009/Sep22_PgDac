class Array1{
	public static void display(int[] a1){
		for(int i =0; i<=9; i++){
			System.out.print(a1[i]+" ");
		}
	}
		
	public static void find(int[] a1, int key){
		int i ;
		for( i = 0; i<=9; i++){
			if(a1[i] == key)
				break;
		}
			System.out.println();
		
		if(a1[i] == key){
			System.out.println("Key is found at index : "+ i);
		}
		else{
			System.out.println("Key is not found");
		}
	}
	public static void delete(int[] a1 , int key){
			int a2[]=new int[a1.length-1];
			int j = 0 ;
			int count =  0;
			for(int k = 0; k<=9; k++){
				if(a1[k] == key || count>1){
					count++;	
					continue;
			}
			else
				a2[j++] = a1[k];
		}
		
		for(int i =0; i<a1.length-1; i++) {
			System.out.print(a2[i]+" ");
		}
	}
		
	public static void main(String args[]){
	
		int a1[];
		a1 = new int[10];
		
		a1[0] = 11;
		a1[1] = 77;
		a1[2] = 88;
		a1[3] = 99;
		a1[4] = 66;
		a1[5] = 55;
		a1[6] = 44;
		a1[7] = 33;
		a1[8] = 73;
		a1[9] = 78;
	//	int len = a1.length-1;
	//	System.out.println(len);
		
		display(a1);
		find(a1,73);
		delete(a1,78);
	}
}
