class LTrim
{
	public static void main(String... as)
	{
		StringBuffer s = new StringBuffer("       My name is Sahu Shivam Agarwal");
		System.out.println(s);
		System.out.println(s.length());
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
		else
			break;
		}
		StringBuffer s1 = s.delete(0,count);
		System.out.println(s1);
		System.out.print(s1.length());
	}
}