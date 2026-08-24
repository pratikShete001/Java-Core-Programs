import java.util.Scanner;
public class VowelCounter {
    public static int countVowels(String str) {
        int count = 0;
        // Convert to lowercase to simplify checking
        String lowerStr = str.toLowerCase(); 
        
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
        String inputStr = sc.nextLine();
        System.out.println("Number of vowels: " + countVowels(inputStr));
    }
}
