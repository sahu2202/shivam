class StringReverse
{
	public static void main(String []ae)
	{
		String s = "India is a good country";
		System.out.println(s.length());
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}