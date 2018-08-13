
class mayorDiv{

	public static void main(String[] args){

		
		System.out.println(mcd(1440,408));

	}//main

	public static int mcd(int p, int q){

		if(q==0)
			return p;

		return mcd(q,p%q);


	}

}//class