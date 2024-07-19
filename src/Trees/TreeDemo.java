package Trees;

import java.util.Stack;

import Trees.SkewedLeftTrees.Node;

public class TreeDemo {
	public static class Node {

		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	public static class Pair{
		int state;
		Node node;
		
		Pair(Node node,int state){
			this.state=state;
			this.node=node;
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };

		Node root= new Node(arr[0],null,null);
		Pair rp= new Pair(root,1);
		
		
		Stack<Pair> stack= new Stack<>();
		stack.push(rp);
		int i=0;
		while(stack.size()>0) {
			Pair top=stack.peek();
			if(top.state==1) {
				i++;
				if(arr[i]!=null) {
					top.node.left=new Node(arr[i],null,null);
					Pair lp= new Pair(top.node.left,1);
					stack.push(lp);
				}else {
					top.node.left=null;
				}
				top.state++;
			}else if(top.state==2) {
				i++;
				if(arr[i]!=null) {
					top.node.right=new Node(arr[i],null,null);
					Pair rp2= new Pair(top.node.right,1);
					stack.push(rp2);
				}else {
					top.node.right=null;
				}
				top.state++;
			}else {
				stack.pop();
			}
		}
		display(root);
		traversal(root);
	}

	private static void traversal(Node root) {
		if(root==null) {
			return ;
		}
		traversal(root.left);
		System.out.println(root.data);
		traversal(root.right);
		
	}

	private static void display(Node node) {
		if(node==null) {
			return;
		}
		String str="";
		str+=node.left==null?" . ":node.left.data;
		str+= "<- "+node.data+" ->";
		str+=node.right==null?" . ":node.right.data;
		
		System.out.println(str);
		
		display(node.left);
		display(node.right);
		
	}
}
