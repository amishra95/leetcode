class FreqStack {
    int pushCount;
    PriorityQueue<Node> pq;
    Map<Integer, Integer> map;
    public FreqStack() {
        pushCount = 0;
        pq = new PriorityQueue<Node>(new NodeComparator());
        map = new HashMap<Integer, Integer>();
    }
    
    public void push(int x) {
        if (!map.containsKey(x)){
            map.put(x, 0);
        }
        map.put(x, map.get(x) + 1);
        Node n = new Node(x, map.get(x), pushCount++);
        pq.offer(n);
    }
    
    public int pop() {
        return pq.poll().value;
    }
    
    
    class Node{
        public int value;
        int freq;
        int pushIndex;
        public Node(int v, int f, int p){
            this.value = v;
            this.freq = f;
            this.pushIndex = p;
        }
    }
    
    class NodeComparator implements Comparator<Node>{
        public int compare(Node a, Node b){
            if (a.freq != b.freq) return b.freq -a.freq;
                    return b.pushIndex - a.pushIndex;

        }
    }
}
