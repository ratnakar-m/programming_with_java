public class Tree{
	TreeNode root;
	int size; //number of nodes/elements in the tree
	
	public Tree(TreeNode root){
		this.root = root;
		size = 1;
	}
	
	public void add(int  value){
		
		TreeNode currentNode = root;
		TreeNode parent = currentNode;
		while(currentNode != null){
			parent = currentNode;
			if(currentNode.value > value){
				currentNode = currentNode.left;
			}
			else{
				currentNode = currentNode.right;
			}
		}
		
		currentNode = new TreeNode(value, null, null);
		if(value > parent.value)
			parent.right = currentNode;
		else
			parent.left = currentNode;
		
		size++;
	}
	
	public boolean remove(int value){
		//we will implement this method later
		return false;
	}
	
	public boolean search(int value){
		//we will implement this method later
		return false;
	}
	
	public int size(){
		return this.size;
	}

}