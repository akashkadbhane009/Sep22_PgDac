class SinglyLinkList{

	private ListNode head;

	static class ListNode{
		private int data;
		private ListNode next;

		ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args){

		SinglyLinkList sll = new SinglyLinkList();
		//sll.head = new ListNode(10);
		//sll.addAtEnd(9);
		//sll.addAtEnd(8);
		//sll.addAtEnd(7);
		//sll.addAtGivenPosition(2,55);
		sll.loopeList();
		//sll.dispaly();
		//System.out.println("Length of the LINKLIST : "+sll.length());
		
		System.out.println(sll.isLoop());
		//sll.dispaly(sll.reverse());
		//sll.getMiddleNode();
		//int NthNodeFromEnd = 2;
		//sll.getNthNode(sll.length()-NthNodeFromEnd-1);
		//sll.getNthNode(3);
	}
	public void dispaly(ListNode head){
		ListNode current =  head;
		while (current != null){
			System.out.print(current.data+"--->");
			current = current.next;
		}
		System.out.println("null");
	}
	public void dispaly(){
		ListNode current =  head;
		while (current != null){
			System.out.print(current.data+"--->");
			current = current.next;
		}
		System.out.println("null");
	}
	public int length(){
		if (head == null){
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while (current != null){
			count++;
			current = current.next;
		}
		return count;
	}
	public void addAtHead(int data){
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}
	public void addAtEnd(int data){
		ListNode newNode = new ListNode(data);
		if (head == null){
			head = newNode;
			return;
		}
		ListNode current = head;
		while(null != current.next){
			current = current.next;
		}
		current.next= newNode;
	}
	public void addAtGivenPosition(int position, int data){
		ListNode newNode = new ListNode(data);
		if (position == 0){
			newNode.next = head;
			head = newNode;
		}else{
			ListNode previous = head;
			int count = 0;

			while(count < position-1){
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		}
	}
	public void deleteHead(){
		if (head == null)
			return;

		ListNode temp = head;
		head =  head.next;
		temp.next = null;
	}
	public void deleteTail(){
		if(head == null || head.next == null){
			return ;
		}
		ListNode current = head;
		ListNode previous =null;
		while (current.next != null){
			previous = current;
			current = current.next;
		}
		previous.next = null;
	}
	public void deleteAtGivenPosition(int position){
		if (position == 1){
			head = head.next;
		}else{
			ListNode previous = head;
			int count = 0;
			while(count < position-1){
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	public ListNode reverse(){
		if (head == null)
			return head;
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null){
			next = current.next;
			current.next = previous;
			previous= current;
			current = next;
		}
		return previous;
	}
	public void getMiddleNode(){
		if (head == null)
			System.out.println("Only head is there!!");
		
		ListNode slowPtr =  head;
		ListNode fastPtr =  head;
		int count = 0;
		while(slowPtr != null && fastPtr.next != null){
			slowPtr = slowPtr.next;
			count++;
			fastPtr = fastPtr.next.next;
		}
		System.out.println("Middle Node Index : "+count+" Data : "+slowPtr.data);
	}
	public void getNthNode(int n){
		ListNode current =  head;
		int count = 0;
		while (count != n){
			current = current.next;
			count++;
		}
		System.out.print(n+"th node from the end : "+current.data);
	}
	public boolean isLoop(){
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while  (fastPtr != null && fastPtr.next != null){
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if (slowPtr == fastPtr){
				return true;
			}
		}
		return false;
	}
	public void loopeList(){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(13);
		ListNode third = new ListNode(11);
		ListNode fourth = new ListNode(16);
		ListNode fifth = new ListNode(12);
		ListNode sixth = new ListNode(5);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	
}