class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        
        // STEP 1: Build graph using Template 1
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] pair : adjacentPairs) {
            int a = pair[0], b = pair[1];
            graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }
        
        // STEP 2: Find starting point using Template 4
        int start = 0;
        for (int node : graph.keySet()) {
            if (graph.get(node).size() == 1) {  // degree 1 = endpoint
                start = node;
                break;
            }
        }
        
        // STEP 3: DFS traversal using Template 2
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        dfs(start, graph, visited, result);
        
        // STEP 4: Convert to array using helper pattern
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    // Template 2: DFS with result collection
    private void dfs(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited, List<Integer> result) {
        visited.add(node);
        result.add(node);
        
        for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited, result);
            }
        }
    }
}
