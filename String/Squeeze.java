class Squeeze
{
	public static void main(String... a)
	{
		StringBuffer s = new StringBuffer("          My name is Sahu Shivam Agarwal          ");
		System.out.println(s);
		System.out.println("length of String:"+s.length());
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				s.delete(i,1);
			}
		}
		System.out.println(s);
	}
}