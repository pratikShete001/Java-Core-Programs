import java.util.Scanner;

public class Armstrong_numbers_in_range
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range");
        int range = sc.nextInt();

        // Print a heading for the found Armstrong numbers
        System.out.println("Armstrong numbers in the range are:");

        for(int number = 1; number <= range; number++)
        {
            int original_number = number;
            int power = 0; // RESET for every fresh number

            // Step 1: Count digits (power) using a copy of the number
            while(original_number > 0)
            {
                original_number = original_number / 10;
                power++;
            }

            // Step 2: Calculate Armstrong sum using another copy
            int temp = number; 
            int result = 0; // RESET for every fresh number
            
            while(temp != 0)
            {
                int digit = temp % 10;
                result = result + (int)Math.pow(digit, power);
                temp = temp / 10; // Safely reduces temp, leaving 'number' untouched
            }

            // Step 3: Check if the calculated sum equals the current number
            if (result == number) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // New line at the end
    }
}
