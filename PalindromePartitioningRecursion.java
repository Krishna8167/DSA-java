import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningRecursion {

    // Check if a string is a palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    // Recursive function to find all palindrome partitions
    public static void partitionHelper(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                current.add(s.substring(start, end + 1));     // Choose
                partitionHelper(s, end + 1, current, result); // Explore
                current.remove(current.size() - 1);           // Un-choose (Backtrack)
            }
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        partitionHelper(s, 0, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        String input = "aab";
        List<List<String>> partitions = partition(input);

        System.out.println("Palindrome partitions of \"" + input + "\":");
        for (List<String> p : partitions) {
            System.out.println(p);
        }
    }
}
