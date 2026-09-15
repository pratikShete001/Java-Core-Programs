import java.util.Scanner;
public class Array_crud_operations
{
	static int size;
	public void create(int arr[], Scanner sc)
	{
		System.out.println("Enter size of Array");
		size = sc.nextInt();
		System.out.println(" Enter the elements of Array");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Insertion Successful");
		
	}
	
	public void insert(int arr[], Scanner sc)
	{
		System.out.println("Enter value of element to insert");
		int value = sc.nextInt();
		System.out.println("Enter index to insert");
		int index = sc.nextInt();
		for(int i = size - 1; i >= index; i--)
		{
			arr[i+1] = arr[i];
		}
		size++;
		arr[index] = value;
		System.out.println("Insertion Successful");
	}
	public void delete(int arr[], Scanner sc)
	{
		System.out.println("Enter index to delete");
		int index = sc.nextInt();
		
		for(int i = index; i<=size-1; i++)
		{
			arr[i] = arr[i+1];
		}
		size--;
		System.out.println("Deletion Successful");
	}
	public void display(int arr[])
	{
		System.out.println("All Elements of Array");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String args[])
	{
		Array_crud_operations a = new Array_crud_operations();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		while(true){
		System.out.println("Array Menu");
		System.out.println("1. Create");
		System.out.println("2. Insert");
		System.out.println("3. Delete");
		System.out.println("4. Display");
		System.out.println("5. Exit");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
			switch(choice)
			{
				case 1: a.create(arr,sc);
						break;
				case 2: a.insert(arr,sc);
						break;
				case 3: a.delete(arr,sc);
						break;
				case 4: a.display(arr);
						break;
				case 5:sc.close();
						return;
			}
		}
	}
}
