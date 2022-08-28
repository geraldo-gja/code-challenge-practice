package turing.q01;

import java.util.*;


/*
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to be farthest leaf node.
 * Note: A leaf is a node with no children.
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 *    3
 *   / \ 
 *  9  20
 *    / \
 *    15  7
 * return its depth = 3.   
 */

/*
 * 1,2,3,4,5
      1
     / \
    2   3
   / \
  4   5
  
 * 1,2,3,null,5,6,7,8
            1
         /    \
    	 2     3
   	  	 \    / \
  	      5  6  7
         /
        8
        
 * 1,2,3,null,5,6,7,8,null,null,null,null,null,13
            1
         /    \
    	 2      3
   	  	  \    / \
  	       5  6  7
          /
         8
        /
       13  
      
 * 1,2,3,4,5,6,7,8,9,10,11,12,13,14
		                  1
		          /              \
		    	 2                 3
		      /     \           /     \
		  	 4       5         6       7
		    / \     / \       / \     /
		   8   9  10   11   12   13  14
		      
		      
 */

/**
 * 
 * RESOLVI EM 60 MINUTOS, 17/05/22
 *
 */
class Solution {
	
	/**
	 * @param root - Node representing the root of the tree
	 * @return int - number of nodes along the longest path from the root node down to the farthest leaf node.
	 */
	public static int maxDepth(TreeNode root) {
		
		int retr =  iterateNode(root, 0);		
		return retr;
	}
	
	public static int iterateNode(TreeNode node, int cont) {	
		
		if( node.right != null || node.left != null) {

			int R = 0;
			int L = 0;
			
			if( node.right != null) 
				R = iterateNode(node.right, cont);
			
			if( node.left != null) 
				L = iterateNode(node.left, cont);
			
			if( R > L || R == L)
				cont = R + 1;
			else
				cont = L + 1;
		}else
			cont = 1;
		
		return cont;
	}

}

/**
 * R E A D M E
 * DO NOT CHANGE the code below, we use it to grade your submission
 * If changed your submission will be failed automatically
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val) {
		this.val = val;
	}
}

public class Main {
	public static void main(String args[]) {
		//Code to read inputs
		Scanner sc = new Scanner(System.in);
		String components = buildQueue(sc);
		TreeNode root = null;
		
		root = deserialize(components);
		
		int result = Solution.maxDepth(root);
		System.out.print(result);
	}
	
	private static TreeNode deserialize(String data) {
		TreeNode root = null;
		if (data == null || data.length() == 0) {
			return null;
		}
		String[] parts = data.split(",");
		Queue<TreeNode> queue = new LinkedList<>();
		try {
			String rootNode = parts[0];
			if ("null".equals(rootNode)) {
				root = null;
			} else {
				root = new TreeNode(Integer.parseInt(rootNode));
			}
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
		queue.offer(root);
		int i = 1;
		while (i < parts.length) {
			TreeNode node = queue.poll();
			
			if (parts[i].equals("null")) {
				node.left = null;
			} else {
				TreeNode left = new TreeNode(Integer.parseInt(parts[i]));
				node.left = left;
				queue.offer(left);
			}
			
			if (i + 1 == parts.length) break;
			
			if (parts[i + 1].equals("null")) {
				node.right = null;
			} else {
				TreeNode right = new TreeNode(Integer.parseInt(parts[i + 1]));
				node.right = right;
				queue.offer(right);
			}
			i += 2; 
		}
		return root;
	}
	
	private static String buildQueue(Scanner sc) {
		String data;
		data = sc.nextLine();
		return data;
	}
}














