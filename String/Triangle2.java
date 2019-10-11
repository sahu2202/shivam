class Triangle2
{
	public static void main(String... qw)
	{
		String s = "ducat";
		for(int i=0; i<s.length(); i++)
		{
			for(int j=0; j<s.length()-i; j++)
			{
				System.out.print(s.charAt(j));
			}
		System.out.println();
		}
	}
}