class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxlength = 0;
        int maxstreak = 0;

    for(int right = 0; right < n; right++){
       // Adding all the characters in a hashmap and then checking for it's value
        map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+ 1);
       // Checking on the streak of the number
        maxstreak = Math.max(maxstreak, map.get(s.charAt(right)));
    //
        while((right- left + 1)- maxstreak > k){
            map.put(s.charAt(left), map.get(s.charAt(left))- 1);
            left++;
        }

    maxlength = Math.max(maxlength, right-left+1);
    }
    return maxlength;
        
    }
}