package AVLtree;

public class node {
	
	protected node left;
	protected node right;
	protected int data = 0;
	public node(){
		this.left=null;
		this.right=null;
		this.data=0;
	}
	public node(int n){
		this.data=n;
		this.right=null;
		this.left=null;
		
	}
	private int lHeight(){
		node pointer = left;
		int counter = 0;
		while(left!=null){
			counter++;
			pointer=pointer.left;
			
		}
		return counter;
			
		}
	
	private int rHeight(){
		node pointer = left;
		int counter = 0;
		while(left!=null){
			counter++;
			pointer=pointer.right;
		}
		return counter;
		
		
	}
	
	public int height(){
		return lHeight()-rHeight();
		
	}
	@Override
	public String toString(){
		return "data: "+data;
	}

}