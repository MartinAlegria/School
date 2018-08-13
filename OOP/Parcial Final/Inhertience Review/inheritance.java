class a {
	protected int a;

	a(int a){
		this.a = a;	
		System.out.println("En A");
	}

}

class b extends a {
	protected int b;

	b(int a, int b){
		super(a);
		this.b = b;
		System.out.println("En B");
	}
}

class c extends b {
	private int c;

	c(int a, int b, int c){
		super(a,b);
		this.c = c;
		System.out.println("En C");
	}

	public void print(){
		System.out.println(a + " " + b + " " + c);
	}

}