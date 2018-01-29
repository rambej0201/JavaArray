class ArrFour 
{
	public static void main(String[] args) 
	{
		Emp e5 = new Emp(555, "Balu");
		Emp e6 = new Emp(666, "Chilaka");
		Emp e7 = new Emp(777, "Jaggu");
		Emp e8 = new Emp(888, "Thipi");
		Emp e9 = new Emp(999, "Mark");

		Emp [] ef = new Emp [5];

		ef[0] = e5;
		ef[2] = e7;
		ef[4] = e9;
		
		for ( Object o : ef )
		{ if (o instanceof Emp)
			{ Emp eff = (Emp)o;
				System.out.println(eff.eid+"---"+eff.ename);
				}
				if (o == null)
				{
					System.out.println("null");
				}
		}
		
	}
}
