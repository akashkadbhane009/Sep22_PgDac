class Queue{//using linked list
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public Queue(){
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public int length(){
		return length;
	}
	public boolean isEmpty(){
		return length == 0;
	}
	public void enqueue(int data){
		ListNode temp = new ListNode(data);
		if (isEmpty()){
			front = temp;
		}else{
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	public void print(){
		if (isEmpty()){
			return;
		}
		ListNode current = front;
		while (current != null){
			System.out.print(current.data+" ==> ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	public int dequeue(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
		}
		int result = front.data;
		front = front.next;
		if (front == null){
			rear = null;
		}
		length--;
		return result;
	}
	
	public static void main(String[] args){
		Queue q = new Queue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		q.print();
		
		q.dequeue();
		q.print();
		
		q.dequeue();
		q.print();
		
		q.dequeue();
		q.print();
		
		q.dequeue();
		q.print();
		
		q.dequeue();
		q.print();
	}
	
}