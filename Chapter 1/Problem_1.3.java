class Problem{
	
	public static String URLify(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;++i)
		{
			if(ch[i]==' ')
			{			
				for(int j=ch.length-2;j>=i+1;--j)
				{	
					ch[j+1]=ch[j-1];
				}
				ch[i]='%';
				ch[i+1]='2';
				ch[i+2]='0';
			}
		}
		String t = new String(ch);
		return t;
	}


	public static void main(String[] args)
	{
		String s = "Mr John Smith Jr.      ";
		System.out.println(URLify(s));
	}
}