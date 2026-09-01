class Solution3 {
    public boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        String lowerCase = s.toLowerCase();
        String nonAlphanumericCharacters = "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lowerCase.length(); i++) {
            char ch = lowerCase.charAt(i);
            if(Character.isLetter(ch) || (ch>=48 && ch<=57) ){
                result.append(ch);
            }
        }
        nonAlphanumericCharacters=result.toString();
        
        int start = 0;
        int end = nonAlphanumericCharacters.length()-1;

        while (start<end) {
            if(nonAlphanumericCharacters.charAt(start)==nonAlphanumericCharacters.charAt(end)){
                start++;
                end--;
            }
            else
                return isPalindrome;
        }

        isPalindrome=true;

        return isPalindrome;
    }
}

class Main3{
    public static void main(String[] args) {
        Solution3 s2 = new Solution3();
        String s = "0P";
        boolean result = s2.isPalindrome(s);
        System.out.println(result);
    }
}