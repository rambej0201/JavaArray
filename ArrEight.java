class ArrEight 
{
	int [] m1(){
		System.out.println("m1 method");
		int [] a = {1, 5, 8, 9};
		return a;
	}
	void m2(double [] x){
		System.out.println("m2 method");
		for (double xx : x)
		{
			System.out.println(xx);
		}
	}

	public static void main(String[] args) 
	{
		ArrEight ae = new ArrEight();
		int [] z = ae.m1();
		for ( int zz : z)
		{
			System.out.println(zz);
		}
		double [] y = {0.4, 4.5, 9.3};
		ae.m2(y);
		
	}
}
