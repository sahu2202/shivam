class CompareToIgnoreCase
{
	public static void main(String... s)
	{
		String s1 = "STRINGS are immutable";
		String s2 = "Strings are immutable";
		String s3 = "Integers are not immutable";
		int result1 = s1.compareTo(s2);
		System.out.println("compareTo "+result1);
		int result = s1.compareToIgnoreCase(s2);
		System.out.println("CompareToIgnoreCase "+result);
		result = s2.compareToIgnoreCase(s3);
		System.out.println(result);
		result = s3.compareToIgnoreCase(s1);
		System.out.println(result);
	}
}