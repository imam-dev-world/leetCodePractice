import java.util.*;

class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {        
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            // conevrt the string as a each character
            char[] ch = strs[i].toCharArray();
            // sort the character
            Arrays.sort(ch);
            StringBuilder sb = new StringBuilder();
            // append the character as a complete string
            String key = sb.append(ch).toString();
            
            // check whether the key is inside map
            if(map.containsKey(key)){
                List<String> list=map.get(key);
                list.add(strs[i]);
            }
            // add key and value inside the map if not ex
            else{
                List<String> lists = new ArrayList<>();
                lists.add(strs[i]);
                map.put(key, lists);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}

class GroupAnagram {
    public static void main(String[] args) {
        String[] str = { "eat","tea","tan","ate","nat","bat" };
        LeetCode49 l = new LeetCode49();
        List<List<String>> lists = l.groupAnagrams(str);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}