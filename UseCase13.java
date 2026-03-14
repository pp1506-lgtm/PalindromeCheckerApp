public class UseCase13 {
    public static void main(String[] args) {
        String input = "level";
        long start = System.nanoTime();
        
        int s = 0, e = input.length() - 1;
        boolean isPalindrome = true;
        while (s < e) {
            if (input.charAt(s) != input.charAt(e)) {
                isPalindrome = false;
                break;
            }
            s++; e--;
        }
        
        long end = System.nanoTime();
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
// UC13: Performance Comparison Implementation