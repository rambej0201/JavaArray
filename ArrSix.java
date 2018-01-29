class ArrSix 
{
	public static void main(String[] args) 
	{
		int [] a = {10, 20, 30, 40, 50};
		int x = 0;
		for (int i = 0; i < a.length ; i++ )
		{
			x += a[i];
		}
		System.out.println("Sum of all elements of array 'a' is "+x);
	}
}
