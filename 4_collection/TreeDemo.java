public class TreeDemo{
	public static void main(String[] args){
		TreeNode root = new TreeNode(45);
		
		Tree tree = new Tree(root);
		System.out.println(tree.size());
		
		tree.add(32);
		System.out.println(tree.size());
		
		tree.add(54);
		System.out.println(tree.size());
		
		tree.add(78);
		System.out.println(tree.size());
	}
}

/*
	45
32      54
			78
*/