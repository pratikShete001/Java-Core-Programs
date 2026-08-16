class palindromeString {
    public static void main(String args[]) {
        String s = "madam";
        char arr[] = s.toCharArray();
        int len = arr.length;
        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (arr[i] != arr[len - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
