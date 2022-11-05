class QueueA{
	
	int f=-1, r=-1;
	int n=10;
	int q[]=new int[n];
	
	public void enqueue(int i){
		if(r==(n-1)){
			System.out.print("Overflow");
		}
		else{
			if(f==-1 && r==-1){
				f=0;
				r=0;
				q[r]=i;
			}
			else{
				r=r+1;
				q[r]=i;
			}
		}
	}
	
	public void dequeue(){
		if(f==-1 && r==-1){
			System.out.print("Underflow");
		}
		else{
			f=f+1;
		}
	}
	
	public void display(){
		for(int j=f;j<=r;j++){
			System.out.print(q[j]+" ");
		}
	}
	
}

class QueueArr{
	public static void main(String arg[]){
		Queue1 que=new Queue1();
		
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(5);
		
		que.dequeue();
		que.display();
	}
}
