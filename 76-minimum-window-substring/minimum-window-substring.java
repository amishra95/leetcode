import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0; 
        int right = 0;
        int informed = map.size();
        int formed = 0; 

        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        HashMap<Character, Integer> windowmap = new HashMap<>();

        while (right < s.length()) {
            char ch = s.charAt(right);
            windowmap.put(ch, windowmap.getOrDefault(ch, 0) + 1);  
            
            if (map.containsKey(ch) && windowmap.get(ch).equals(map.get(ch))) {
                formed++;
            }

            while (formed == informed) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    minLeft = left;
                }
                
                char leftChar = s.charAt(left);
                windowmap.put(leftChar, windowmap.get(leftChar) - 1);
                
                if (map.containsKey(leftChar) && windowmap.get(leftChar) < map.get(leftChar)) {
                    formed--;
                }
                left++; 
            }
            right++; 
        }
        
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}