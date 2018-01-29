class ArrFive 
{
	public static void main(String[] args) 
	{
		Emp e10 = new Emp(4578, "Tharun");
		Emp e11 = new Emp(3578, "Harun");
		Emp e12 = new Emp(2578, "Arun");
		Emp e13 = new Emp(1578, "Run");
		Emp e14 = new Emp(5078, "Un");
		
		Emp [] ev = new Emp[5];

		ev[0] = e10;
		ev[2] = e12;
		ev[4] = e14;

		for (int i = 0 ; i < ev.length; i++)
		{
			if (ev[i] == null)
			{
				System.out.println(i);
			}
		}
	}
}
