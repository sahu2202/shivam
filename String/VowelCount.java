import java.util.Scanner;
class VowelCount
{
	public static void main(String... qs)
	{
		System.out.println("entr strng");
		String x = new Scanner(System.in).nextLine();
		String s = "aeiouAEIOU";
		int count = 0;
		for(int i=0; i<x.length(); i++)
		{
			for(int j=0; j<s.length(); j++)
			{
				if(x.charAt(i) == s.charAt(j))
					count++;
			}
		}
		System.out.println(count);
	}
}
