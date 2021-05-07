public class TreeNode{
	
	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int value, TreeNode left, TreeNode right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public void setLeft(TreeNode left){
		this.left = left;
	}
	
	public void setRight(TreeNode right){
		this.right = right;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	
}