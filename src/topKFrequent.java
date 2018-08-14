class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
    
            ArrayList<Integer> list = new ArrayList<>();
        
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
     for(int num : nums)
         map.put(num, map.getOrDefault(num, 0) + 1);
        
    List<Integer> count = new ArrayList<Integer> (map.values());
        Collections.sort(count);
        
    int threshold = count.get(count.size() - k);
        
    for(int num : map.keySet())
        if(map.get(num) >= threshold)
            list.add(num);
        
        return list;
   

        
        
    }
}