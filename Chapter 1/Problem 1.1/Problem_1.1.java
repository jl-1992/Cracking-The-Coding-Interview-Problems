class Problem{

	public static boolean IsUnique(String str)
	{
		boolean a[] = new boolean[128];
		for(int i=0;i<str.length();++i)
		{
			if(a[(int) str.charAt(i)])
				return false;
			a[(int) str.charAt(i)]=true;
		}
		return true;
	}

	public static void main(String[] args)
	{
		String s = "Hi tom";
		System.out.println(IsUnique(s));
	}
}

