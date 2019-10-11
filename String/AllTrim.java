class AllTrim
{
	public static void main(String... as)
	{
		int count=0,count1=0;
		StringBuffer s =new StringBuffer("          My name is Sahu Shivam Agarwal          ");
		System.out.println(s.length());
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
				count++;
			else
				break;
		}
		StringBuffer sb = s.delete(0,count);
		for(int i=s.length()-1; i>=0; i--)
		{
			if(s.charAt(i) == ' ')
				count1++;
			else
				break;
		}
		StringBuffer s1 = s.delete(s.length()-count1,s.length());
		System.out.println(sb);
		System.out.println(sb.length());
	}
}