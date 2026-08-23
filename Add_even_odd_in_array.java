class Add_even_odd_in_array
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		int even_addition = 0;
		int odd_addition = 0;
		int i;
		for(i = 0; i< arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				even_addition = even_addition + arr[i];
			}
			else{
				odd_addition = odd_addition + arr[i];
			}
		}
		System.out.println("addition of even numbers in array is: "+even_addition);
		System.out.println("addition of odd numbers in array is: "+odd_addition);
		
	}
}