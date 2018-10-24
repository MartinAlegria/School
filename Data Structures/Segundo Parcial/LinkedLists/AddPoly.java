class Node{

	public int exp,coeff;
	public Node next;

	public Node(int coeff,int exp){
    	this.coeff=coeff;
    	this.exp=exp;
  	}

   	public void printNode(){
     	if(coeff<0)
      	System.out.print(coeff+"x^"+exp);
     	else
      	System.out.print("+"+coeff+"x^"+exp);
   	}

}//NODE

public class AddPoly{

  public static void main(String[] args){

    //POLY1
    Node n1 = new Node(2,2);
    Node n2 = new Node(4,4);
    Node n3 = new Node(6,6);

    n1.next = n2;
    n2.next = n3;

    //POLY2

    Node l1 = new Node(7,2);
    Node l2 = new Node(10,4);
    Node l3 = new Node(-8,6);

    l1.next = l2;
    l2.next = l3;


    //Addition
    Node res = PolyAddition(n1,l1);

    do{

      res.printNode();
      res = res.next;

    }while(res.next != null);
    
  }

  public static Node PolyAddition(Node p, Node q){

    Node r  = new Node(0,0);

    if(p == null || q == null) {
      return r;
    }

    if(p != null && q != null) {
     
      if(p.exp < q.exp){
        r = p;
        r.next = PolyAddition(p.next, q);
      }
      else if(p.exp > q.exp ){
        r = q;
        r.next = PolyAddition(p, q.next);
      }
      else{
        r = p;
        r.coeff = p.coeff + q.coeff;
        r.next = PolyAddition(p.next, q.next);
      }
    }//1

    else if(p == null){
      r = q;
      r.next = PolyAddition(p, q.next);
    }

    else if(p == null && q == null){
      r = null;
    }

    else{
      r = p;
      r.next = PolyAddition(p.next, q);
    }


    return r;
  }//polyAddition


}