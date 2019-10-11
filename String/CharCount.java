class CharCount
{
	public static void main(String... args)
	{
		int count = 0;
		String s = "     India is a good country      ";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
		    count++;
		}
	 System.out.println("total no. of char:"+count);
	}
}
