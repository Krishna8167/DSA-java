public class WildcardMatchingRecursion {

    public static boolean isMatch(String s, String p, int i, int j) {
        // If both pattern and string are exhausted
        if (i == s.length() && j == p.length()) return true;

        // If pattern is exhausted but string isn't
        if (j == p.length()) return false;

        // If string is exhausted but pattern isn't
        if (i == s.length()) {
            // Remaining pattern must be all '*'
            for (int k = j; k < p.length(); k++) {
                if (p.charAt(k) != '*') return false;
            }
            return true;
        }

        // Case 1: Character match or '?'
        if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?') {
            return isMatch(s, p, i + 1, j + 1);
        }

        // Case 2: '*' can match 0 or more characters
        if (p.charAt(j) == '*') {
            return isMatch(s, p, i, j + 1)     // '*' matches empty sequence
                || isMatch(s, p, i + 1, j);    // '*' matches one character
        }

        // No match
        return false;
    }

    public static boolean isMatch(String s, String p) {
        return isMatch(s, p, 0, 0);
    }

    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*b";

        boolean result = isMatch(s, p);
        System.out.println("Does \"" + s + "\" match pattern \"" + p + "\"? " + result);
    }
}
