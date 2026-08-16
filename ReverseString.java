class ReverseString
{
	public static void main(String args[])
	{
		String s = "pratik";
		char temp;
		char arr[] = s.toCharArray();
		int len = arr.length;
		for(int i = 0; i< len/2; i++)
		{
			temp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = temp;
		}
		
		for(int i = 0 ; i<arr.length; i++)
			{
				System.out.print(arr[i]);
			}
		
	}
	
}