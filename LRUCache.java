class LRUCache {
    
 private final int capacity;
 private final Stack<Integer> stack = new Stack<>();
 private final HashMap<Integer, Integer> map = new HashMap<>();

    public LRUCache(int capacity) {
       this.capacity = capacity;
    }
    
    public int get(int key) {
    if(!map.containsKey(key)){
        return -1;
    }
    stack.remove((Integer) key);
    stack.push(key);
    return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            stack.remove((Integer) key);
        }
        else if(stack.size() == capacity){
            int lru = stack.remove(0);
            map.remove(lru);
        }
        stack.push(key);
        map.put(key, value);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
