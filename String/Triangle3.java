class Triangle3
{
	public static void main(String... qw)
	{
		String s = "ducat";
		for(int i=1; i<=s.length();i++)
		{
			for(int j=i-1;j<s.length();j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		for(int k=0; k<=i-1;k++)
		{
			System.out.print(" ");
		}
		
		}
	}
}