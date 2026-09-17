import java.util.HashSet;

public class leetCode03 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                right++;
                result = Math.max(result, right - left);
            }
        }
        return result;
    }
}

class MainDriver {
    public static void main(String[] args) {
        leetCode03 l03 = new leetCode03();
        String s = "Imam";
        int result = l03.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}