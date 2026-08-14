import java.util.*;
class PrimeNumber
{ 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting range");
        int sr = sc.nextInt();
        System.out.println("Enter Ending range");
        int er = sc.nextInt();
        sc.close();

        int i;
        int c =0;
        int arr[] = new int[100];
        for (int num = sr; num < er; num++) 
        {
            
            for (i = 2; i < num; i++) 
            {
                if (num ==2) 
                { 
                    break;
                }
                if(num % i == 0)
                {
                    break;
                }       
            }
            if (num == i)
            {
                System.out.print(num+",");
                arr[c] = num;
                c++;
            }
        }
        int mid = c/2;
        System.out.println();
        System.out.println("sum is: "+(arr[mid]+arr[mid+1]));
    }
}