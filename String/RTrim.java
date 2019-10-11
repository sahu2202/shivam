class RTrim
{
	public static void main(String... as)
	{
		StringBuffer s = new StringBuffer("       My name is Sahu Shivam Agarwal          ");
		System.out.println(s);
		System.out.println(s.length());
		int count=0;
		for(int i=s.length()-1; i>=0;i--)
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
		else
			break;
		}
		System.out.println(count);
		StringBuffer s1 = s.delete(s.length()-count,s.length()-1);
		System.out.println(s1);
		System.out.print(s1.length());
	}
}