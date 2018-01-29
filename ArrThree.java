class ArrThree 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(444, "Anil");
		Emp e2 = new Emp(555, "Ranjith");
		Emp e3 = new Emp(666, "Balu");
		Emp e4 = new Emp(777, "Akram");

		Emp [] e = new Emp[4];

		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		e[3] = e4;

		for ( Emp ee : e )
		{
			System.out.println(ee.eid+"---"+ee.ename);
		}
	}
}
