class Search{
	public static int bsearch(int[] arr , int key, int left, int right){
		if (right >= left){
			int mid= left + (right-left)/2;
			if (arr[mid] == key){
				return mid;
			}
			if(arr[mid] > key){
				return bsearch(arr, key, left, mid-1);
			}
			else
			return bsearch(arr, key, mid+1, right);
		}
		return -1;
		
	}
	
	public static int lsearch(int[] arr , int key){
		int i ;
		for (i = 0; i<arr.length; i++){
			if(arr[i] == key)
				return i;
		}
		return -1;
		
	}
	public static void main (String[] args){
		int[] arr = new int[10];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		arr[5] = 66;
		arr[6] = 77;
		arr[7] = 88;
		arr[8] = 99;
		arr[9] = 100;
		
		int res=lsearch(arr,66);
		if (res == -1){
			System.out.println("Not Found");
		}
		else
			System.out.println("Found"+res);
		
		
		int res1 = bsearch(arr, 12345, 0, arr.length-1);
		if (res1 == -1){
			System.out.println("Not Found");
		}
		else
			System.out.println("Found"+res1);
		
	}
}
