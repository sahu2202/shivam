class SequenceCount
{
	public static void main(String... a)
	{
		String s = "nniittiiin";
		int i;
		while( i>-1 && i<s.length()-1)
		{
			int count=1;
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
				i++;
			}
			else
			{
				System.out.println(s.charAt(i)+"-"+count);
				i++;
			}
		}
		
	}
}