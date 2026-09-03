import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class LeetCode241 {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        if(s.length()!=t.length()){
            return result;   
        }
        char[] chacter1=s.toCharArray();
        char[] chacter2=t.toCharArray();

        Arrays.sort(chacter1);
        Arrays.sort(chacter2);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (char c : chacter1) {
            sb1.append(c);
        }

        for (char c : chacter2) {
            sb2.append(c);
        }

        if (sb1.toString().equals(sb2.toString())) {
            result=true;
        }
        return result;
    }
}

class SecondApproach {
    public boolean isAnagram(String s, String t){
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if(map1.containsKey(s.charAt(i))){
               Integer getValue =  map1.get(s.charAt(i));
               getValue++;
               map1.put(s.charAt(i), getValue);
            }
            else 
                map1.put(s.charAt(i), count);
                
        }
        
        for (int i = 0; i < t.length(); i++) {
            if(map2.containsKey(t.charAt(i))){
               Integer getValue =  map2.get(t.charAt(i));
               getValue++;
               map2.put(t.charAt(i), getValue);
            }
            else 
                map2.put(t.charAt(i), count);
        }
        if(map1.equals(map2)){
            return true;
        }
        
        return false;
    }
}

class Main4{
    public static void main(String[] args) {
        LeetCode241 lc = new LeetCode241();
        SecondApproach sa = new SecondApproach();
        String s="anagram" , t="nagaram";
        boolean result=sa.isAnagram(s, t);
        System.out.println(result);
    }
}