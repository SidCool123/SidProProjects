package Trees;

public class SkewedLeftTrees {
	
	static class Node{
		int key;
		
		Node left;
		Node right;
	}
	
	static Node newNode(int key) {
		Node temp= new Node();
		temp.key=key;
		temp.left = temp.right = null;
		return temp;
	}
	
	public static void main(String[] args) {
		Node leftSkew= newNode(7);
		leftSkew.left=newNode(2);
		leftSkew.left.left=newNode(1);
		leftSkew.left.left.left=newNode(0);
		traversal(leftSkew);
		
	}

	private static void traversal(Node leftSkew) {
		while(leftSkew!=null) {
			System.out.println(leftSkew.key);
			leftSkew=leftSkew.left;
		}
		
	}
}
