class ReverseArray
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=5;
		a[1]=3;
		a[2]=7;
		a[3]=11;
		a[4]=15;

		for(int i=4;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}