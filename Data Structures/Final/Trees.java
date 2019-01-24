import java.util.Queue;
import java.util.LinkedList; 

class Node{

	protected Node parent;
	protected Node left, right;

	protected int data;

	Node(int data, Node right, Node left){
		this.data = data;
		this.right = right;
		this.left = left;
	}


	public void print(){
		System.out.println("V: " + data);
	}

	public boolean isLeaf(){
		if(left == null && right == null){ return true;}
		return false;
	}

}

class Tree{
	protected Node root;

	Tree(Node root){
		this.root = root;
	}

	/*public void add(Node root){

	}*/

	public void inOrder(Node node){

		if(node != null){
			inOrder(node.left);
			visit(node);
			inOrder(node.right);
		}

	}

	public void preOrder(Node node){

		if(node != null){
			visit(node);
			preOrder(node.left);
			preOrder(node.right);
		}

	}

	public void postOrder(Node node){
		
		if(node != null){
			postOrder(node.left);
			postOrder(node.right);
			visit(node);
		}

	}

	public void insert(Node node, int value){
		if(value <= node.data){
			if(node.left == null){
				node.left = new Node(value, null, null);
			}else{
				insert(node.left,value);
			}
		}else{
			if(node.right == null){
				node.right  = new Node(value, null, null);
			}else{
				insert(node.right, value);
			}

		}
	}

	public boolean contains(Node node, int value){

		if(node.data == value){
			return true;
		}else if (value < node.data){ //VALUE IS SMALLER, LOOK ON THE LEFT SIDE
			if(node.left != null ){ //THERE IS A LEFT NODE
				return contains(node.left, value); //RECRUSIVE CALL ON THE LEFT
			}else{
				return false; //THERE IS NOT A LEFT NODE
			}
		}else{
			if(node.right != null){
				return contains(node.right,value);
			}
			else{
				return false;
			}
		}

	}

	public int height(Node node){

		if(node != null){

			if(!node.isLeaf()) {
				return 1 + Math.max(height(node.left), height(node.right));
			}

		}
			return 0;

	}

	public void visit(Node n){
		n.print();
	}

	public void printByLevel(Node n){ //LEVEL ORDER TRAVERSAL

		Queue<Node> q = new LinkedList<Node>();
		q.add(n);
		/*
		q.add(null);
		int count = 1;*/

		while(!q.isEmpty()){


			if(q.peek() != null){
				Node temp = q.poll();
				System.out.println(" Node: " + temp.data);

				if(temp.left != null) {
					q.add(temp.left);	
				}

				if(temp.right != null) {
					q.add(temp.right);
					/*if(temp.right.right != null) {
						q.add(null);		
					}*/	
				}

			}
			/*
			else{
				q.poll();
				if(q.peek() != null){
					count++;
				}
			}*/

		}//While

	}//LevelOrderTraversal -> Print

	public void remove(Node n, int k){

		removeNode(n,k,n);

	}

	public void removeNode(Node n, int k, Node p){ //Nodo inicial, valor, parent del nodo

		if(n == null){ return; }

		if(k > n.data){
			removeNode(n.right, k, n);
		}
		else if (k<n.data){
			removeNode(n.left, k, n);
		}
		else{ //ENCONTRAMOS EL VALOR DE NODO QUE DESEAMOS ELIMINAR --> n.data == k;

			if(n.isLeaf()){
				if( p.left != null  && p.left.data == k) {
					p.left = null;
				
				}
				else if (p.right != null  &&  p.right.data == k){
					p.right = null;
		
				}
			}
			else if(!n.isLeaf() && n.right == null){ //SOLO HAY EN LA IZQ
				if(p.left != null  && p.left.data == k) {
					p.left.data = minVal(n.left);
					removeMinVal(n.left);
				
				}
				else if (p.right != null  &&  p.right.data == k){
					p.right.data = minVal(n.left);
					removeMinVal(n.left);
		
				}
			}
			else if(!n.isLeaf() && n.left == null){ //SOLO HAY EN LA DER
				if(p.left != null  && p.left.data == k) {
					p.left.data = minVal(n.right);
					removeMinVal(n.right);

				}
				else if (p.right != null  &&  p.right.data == k){
					p.right.data = minVal(n.right);
					removeMinVal(n.right);
				}
			}
			else{ //TIENE AMBOS HIJOS
				if(p.left != null  && p.left.data == k) {
					p.left.data = minVal(n.right);
					removeMinVal(n.right);

				}
				else if (p.right != null  && p.right.data == k){
					p.right.data = minVal(n.right);
					removeMinVal(n.right);

				}
			}


		}

	}//remove node

	public static int minVal(Node n){
		Node temp = n;
		while(temp.left != null){
			temp = temp.left;
		}

		return temp.data;
	}

	public static Node removeMinVal(Node n){

		Node p = n;

		while(n.left != null){
			n = n.left;
			p = n;
		}

		return p.left = null;
	}

}

class Trees{

	public static void main(String[] args) {
		
		
		Node root = new Node(2, new Node(3, null, null), new Node(1,null,null));
		Tree t = new Tree(root);

		System.out.println("IN ORDER");
		t.inOrder(root);

		t.insert(root,5);
		t.insert(root,4);
		t.insert(root,6);
		t.insert(root,-5);
		t.insert(root,-10);
		t.insert(root,-2);
		t.printByLevel(root);
		System.out.println("Height = " + (t.height(root) + 1));

		System.out.println("IN ORDER BEFORE REMOVAL");
		t.inOrder(root);
		t.remove(root,5);
		System.out.println("IN ORDER AFTER REMOVAL (3)");
		t.inOrder(root);
		t.printByLevel(root);
		System.out.println("Height = " + (t.height(root) + 1));

		/*
		System.out.println("IN ORDER");
		t.inOrder(root);
		System.out.println("PRE ORDER");
		t.preOrder(root);
		System.out.println("POST ORDER");
		t.postOrder(root);
		System.out.println("INSERT 5");
		t.insert(root,5);
		t.inOrder(root);
		System.out.println("Contains: 3 ?");
		System.out.println(t.contains(root,3));
		System.out.println("Contains: 4 ?");
		System.out.println(t.contains(root,4));
		System.out.println(t.height(root));
		t.insert(root,6);
		System.out.println(t.height(root));
		*/

	}


}