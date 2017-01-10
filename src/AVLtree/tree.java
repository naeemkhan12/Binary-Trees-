package AVLtree;

public class tree {
	
	public node root = null;
	
	
	public tree(node t){
		this.root=t;
	}
	/*Method to add element in the binary tree.
	 *  */
	public void addNode(node pointer,int t){
		if(pointer==null){
			root = new node(t);
			return;
			}
		 if( pointer.data>t){
			if(pointer.left==null){
				pointer.left=new node(t);
//				pointer.lHeight++;
				return;
			}
			else{
				addNode(pointer.left,t);
				}
		}else{
			if(pointer.right==null){
				pointer.right=new node(t);
//				pointer.rHeight++;
				return;
			}
			else{
			addNode(pointer.right,t);
			}
			
			
		}
		
	}
	public node search(node pointer , int t){
		
		if(pointer.data==t || pointer==null){
			return pointer;
			}
		 if( pointer.data>t){
			return search(pointer.left, t);
		}else{
			return  search(pointer.right, t);
			
		}
		
		
	}
	
	/*to delete the element Once found.*/
	public node delete(node pointer){
		node left = pointer.left;
		node right= pointer.right;
		if(pointer.left==null && pointer.right==null){  // if the element is a leaf node.
			return null;
		}
		else if(pointer.right==null){ // if the element has only left child 
			return pointer.left;
		}else if(pointer.left==null){ // if the element has only right child
			return pointer.right;
		}else{
			pointer = pointer.right;
			node pervious = null;
			if(pointer.left==null){ // if element's right child has no left child then return right child to be replaced.
				pointer.left=left;
				return pointer;
			}
			while(pointer.left!=null){ // else go to the last left most child of the right child and return to be replaced.
				pervious=pointer;
				pointer= pointer.left;
			}
			pervious.left=pointer.right;// assign the right subtree of the left most element to the parent of it.
			pointer.left=left;// assign left subtree of the element to the left most element. 
			pointer.right=right;// assign right most subtree of the element to the left most element. 
			return pointer; // return the element to be replaced.
			
		}
		
	}
	/*in order representation of the tree.*/
	public void inOrder(node root){
		if(root == null){
			return;
		}
		inOrder(root.left);
		System.out.println(root);
		inOrder(root.right);
	}
	/*pre order representation of the tree.*/
	public void preOrder(node root){
		if(root == null){
			return;
		}
		System.out.println(root);
		inOrder(root.left);
		inOrder(root.right);
	}
	/*post order representation of the tree.*/
	public void postOrder(node root){
		if(root == null){
			return;
		}
		inOrder(root.left);
		inOrder(root.right);
		System.out.println(root);
	}
	/*to delete the node. 
	 * search the node and call the delete function to replace the node with the return value.*/
	public node deleteNode(node root , int t){
		if(root==null){
			System.out.println("Not Found ..");
			return null;
		}
		if(root.data == t){
			return delete(root);
		}else if(root.data>t){
			root.left= deleteNode(root.left,t);
			return root;
			
		}else{
			root.right=  deleteNode(root.right,t);
			return root;
		}
		
	}
	public static void main(String[] args) {
		
		
		tree t = new tree(new node(25));
		t.addNode(t.root,34);
		t.addNode(t.root, 55);
		t.addNode(t.root, 23);
		t.addNode(t.root, 44);
		t.addNode(t.root, 51);
		t.addNode(t.root, 67);
		t.addNode(t.root, 68);
		t.addNode(t.root, 60);
		t.addNode(t.root, 24);
//		t.deleteNode(t.root, 25);
//		System.out.println(t.search(t.root, 25));
//		t.inOrder(t.root);
//		t.deleteNode(t.root, 1);
//		System.out.println("\n\n\n");
//		System.out.println("root  "+t.root + "left :"+t.root.left+"right :"+t.root.right);
//		System.out.println(t.root.left.right+"  "+t.root.right.right);
//		System.out.println(t.root.right.right.left+"  "+t.root.right.right.right);
//		System.out.println(t.root.right.right.left.left+"  "+t.root.right.right.right.left);
//		t.inOrder(t.root);
		System.out.println(t.root.height());
		

	}

}
