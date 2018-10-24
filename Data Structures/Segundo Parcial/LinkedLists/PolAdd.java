class Node{

	public int exp,coeff;
	public Node next;

	public Node(int x,int y){
    	coeff=x;
    	exp=y;
  	}

   	public void printNode(){
     	if(coeff<0)
      	System.out.print(coeff+"x^"+exp);
     	else
      	System.out.print("+"+coeff+"x^"+exp);
   	}

}//NODE

class LinkedList{
   	public Node first;
   	public Node last;

   	LinkedList(){
     	first=null;
     	last=null;
   	}

   	public void insertLast(int x,int y){
     	Node newNode = new Node(x,y);
     	if(isEmpty())
       		first=newNode;
     	else
       		last.next=newNode;
     		last=newNode;
   	}

   	public boolean isEmpty(){	
     	return(first==null);
   	}

   	public void display(){
     	Node current=first;
     	while(current != null)
     	{
       	current.printNode();
       	current=current.next;
     	}
     	System.out.println();
   	}

}//LINKED LIST

class Polynomial{
   	private LinkList l1;
   	public Polynomial()
   	{
     	l1=new LinkList();
   	}
   	public void insert(int x,int y)
   	{
     	l1.insertLast(x,y);
   	}
   	public void displayPoly()
   	{
     	l1.display();
   	}
   	public void add(Polynomial poly1,Polynomial poly2)
   	{
     	int x,y;
     	Node current1=poly1.l1.first;
     	Node current2=poly2.l1.first;

     	while(current1!=null&&current2!=null){

	       	if(current1.exp==current2.exp){
	         	x=current1.coeff+current2.coeff;
	         	y=current1.exp;
	         	current1=current1.next;
	         	current2=current2.next;
	       	}

	       	else if(current1.exp>current2.exp){
	         	x=current1.coeff;
	         	y=current1.exp;
	         	current1=current1.next;
	       	}

	       	else{
	         	x=current2.coeff;
	         	y=current2.exp;
	         	current2=current2.next;
	       	}
	       		l1.insertLast(x,y);
     	}	

     	while(current1!=null){
	       	x=current1.coeff;
	       	y=current1.exp;
	       	current1=current1.next;
	       	l1.insertLast(x,y);
     	}

     	while(current2!=null){
	       	x=current2.coeff;
	       	y=current2.exp;
	       	current2=current2.next;
	       	l1.insertLast(x,y);
     	}
   }//POLYNOMIAL

class PolAdd{

	public static void main(String[] args) {
	
		p3.add(p1,p2);

	}

}

}
