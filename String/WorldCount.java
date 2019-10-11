class WorldCount
{
	public static void main(String... args)
	{
		int count = 0;
		String s[]= new String("India is a good country");
		System.out.println(s.length());
		for(int i=0; i<s.length();i++)
		{
			if(s[i] == " ")
		    count++;
		}
	int sum = (2*count)+1;
	 System.out.println(sum);
	}
}
