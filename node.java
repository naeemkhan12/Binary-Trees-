
public class node {
	
	public node left=null;
	public node right=null;
	public int number = 0;
	
	public node(){
		this.left=null;
		this.right=null;
	}
	public node(int n){
		this.number=n;
		
	}
	@Override
	public String toString(){
		return "number: "+number;
	}

}
