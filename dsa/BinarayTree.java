class BinarayTree{
	private TreeNode root;
	
	static class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		TreeNode(int data){
			this.data = data;
			right = left = null;
		}
	}
	BinarayTree(){
		root = null;
	}
	public static void main(String[] args){
		BinarayTree bt = new BinarayTree();
		//bt.creatBinarayTree();
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(9);
		bt.insert(10);
		
		
		bt.displayPreOrder(bt.root);
			System.out.println();
		bt.displayInOrder(bt.root);
			System.out.println();
		bt.displayPostOrder(bt.root);
			System.out.println();
			System.out.println(bt.root.left.data);
		
		
	}
	
	public void creatBinarayTree(){
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = five;
	}
	public void displayPreOrder(TreeNode root){
		if (root == null){
			return;
		}
		System.out.print(root.data+"-->");
		displayPreOrder(root.left);
		displayPreOrder(root.right);
	
	}
	public void displayInOrder(TreeNode root){
		if (root == null){
			return;
		}
		displayInOrder(root.left);
		System.out.print(root.data+"-->");
		displayInOrder(root.right);
		
	}
	public void displayPostOrder(TreeNode root){
		if (root == null){
			return;
		}
		displayPostOrder(root.left);
		displayPostOrder(root.right);
		System.out.print(root.data+"-->");
		
	}
	public void insert(int data){
		root = insert (root, data);
	}
		public TreeNode insert(TreeNode root , int data){
			if (root == null) {
				root = new TreeNode(data);
				return root;
			}
			if (data < root.data){
				root.left = insert(root.left , data);
			}else{
				root.right = insert(root.right, data);			
			}
			return root;
		}
	void delete(int key){
		root = PrintDelete(root, key);
	}
	public TreeNode PrintDelete(TreeNode root, int key){
		if(root == null){
			return root;
		}	
		if(key < root.data){
			root.left = PrintDelete(root.left, key);
		}
		else if(key > root.data){
			root.right = PrintDelete(root.right, key);
		}
		else{	
			//case 1: leaf node: LC = RC--> null
			//case2: one child: LC --> RC replace & RC --> replace LC
			if(root.left == null){
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			//case 3: two children 
			root.data = minValue(root.right);
			root.right = PrintDelete(root.right, root.data);
		}
		return root;
	}
		
		int minValue(TreeNode root){
			int x = root.data;
			while(root.left != null){
				x = root.left.data;
				root = root.left;
			}
			return x;
		}
}