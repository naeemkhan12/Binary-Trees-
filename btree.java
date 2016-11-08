
public class btree {
	
	
	node root = null;
	public btree(node t){
		this.root=t;
	}
	public void addNode(node t){
		node pointer = root;
		if(pointer==null)
			root = t;
		while(pointer!=null){
		 if( pointer.number>t.number){
			if(pointer.left==null){
				pointer.left=t;
				break;
			}
			else
				pointer=pointer.left;
		}else if(pointer.number <= t.number){
			if(pointer.right==null){
				pointer.right=t;
				break;
			}
			else
			pointer=pointer.right;
			
		}
		}
		
	}
	public void display(){
		node pointer = root;
		while (pointer!=null){
			System.out.println(pointer);
				pointer=pointer.left;
			
		}
		pointer=root;
		while(pointer!=null){
			System.out.println(pointer);
			pointer=pointer.right;
		}
	}

	public static void main(String[] args) {
		btree bt = new btree(new node(5));
		bt.addNode(new node (4));
		bt.addNode(new node (3));
		bt.addNode(new node(6));
		bt.display();
		

	}

}
