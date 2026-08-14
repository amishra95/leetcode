class Solution {
    public int maximumLengthSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        int left = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.get(arr[right]) > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);
                left++;
            }
            
            count = Math.max(count, right - left + 1);
        }

        return count;
    }
}