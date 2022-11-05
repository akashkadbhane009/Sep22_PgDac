class DoublyLinkList{

	private ListNode head;
	private ListNode tail;
	private int length;

	static class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;

		ListNode(int data){
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}
	DoublyLinkList(){
		head = null;
		tail = null;
		length = 0;
	}
	public static void main(String[] args){
		DoublyLinkList dll = new DoublyLinkList();
		dll.addAtHead(2);
		dll.addAtTail(4);
		dll.addAtTail(6);
		dll.addAtTail(8);
		dll.addAtTail(0);
		dll.displayForward();
		//dll.displayBackward();
		//dll.deleteAtNthNodeFromHead(3);
		dll.addAtNthNodeFromHead(3,100);
		dll.displayForward();
		dll.length();
		
		
		
	}
	public boolean isEmpty(){
		return length == 0;
	}
	public void length(){
		System.out.println("Length of list is : "+length);
	}
	public void displayForward(){
		if (head == null){
			return;
		}
		ListNode temp = head;
		while (temp != null){
			System.out.print(temp.data+" --> ");
		temp = temp.next;
		}
		System.out.println("null");
	}
	public void displayBackward(){
		if (tail == null){
			return;
		}
		ListNode temp = tail;
		while (temp != null){
			System.out.print(temp.data+" --> ");
		temp = temp.previous;
		}
		System.out.println("null");
	}
	private void addAtHead(int data){
		ListNode newNode = new ListNode(data);
		if (isEmpty()){
			tail = newNode;
		}else{
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	private void addAtTail(int data){
		ListNode newNode = new ListNode(data);
		if (isEmpty()){
			head = newNode;
		}else{
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
	public void addAtNthNodeFromHead(int position , int data){
		ListNode newNode = new ListNode(data);
		if (isEmpty()){
			return;
		}
		ListNode temp = head;
		ListNode current = head.next;
		int count = 0;
		while (count < position -1){
			temp = temp.next;
			current = current.next;
			count++;
		}
		current.previous = newNode;
		newNode.next = current;
		temp.next = newNode;
		newNode.previous = temp;
		
	}
	public void deleteAtHead(){
		if (isEmpty()){
			return;
		}
		ListNode temp = head;
		if (head == tail){
			tail = null;
		}else{
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
	}
	public void deleteAtTail(){
		if (isEmpty()){
			return;
		}
		ListNode temp = tail;
		if (head == tail){
			head = null;
		}else{
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
	}
	public void deleteAtNthNodeFromHead(int position){
	if (isEmpty()){
			return;
		}
		ListNode temp = head;
		ListNode current = head.next;
		int count = 0;
		while (count < position -1){
			temp = temp.next;
			current = current.next;
			count++;
		}
		temp.next = current.next;
		current.next.previous=temp;
		current.previous = null;
		current.next =  null;
		length--;
	}

}