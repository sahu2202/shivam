class Split
{
	public static void main(String... a)
	{
		String s1 = new String("Welcome-to-tutorial-of string");
		System.out.println("return value");
		String s[]= s1.split("-",2);
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
			System.out.println(" ");
			s= s1.split("-",3);
			System.out.println("return value");
			for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		System.out.println(" ");
		s= s1.split("-",0);
			System.out.println("return value");
			for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		System.out.println(" ");
		s= s1.split("-");
			System.out.println("return value");
			for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
	
		
    }
}