
	class Solution {
	    public int[] deckRevealedIncreasing(int[] deck) {
	        if (deck == null) return deck;
	        if (deck.length <= 1) return deck.clone();
	        
	        List<Integer> list = new LinkedList<>();
	        Arrays.sort(deck);
	        
	        int n = deck.length;
	        list.add(deck[n - 2]);
	        list.add(deck[n - 1]);
	        for (int i = n - 3; i >= 0; i--) {
	            list.add(0, list.remove(list.size() - 1)); //move the current last card to the front...
	            list.add(0, deck[i]); //add the prevoius card onto the top...
	        }
	        int[] res = new int[n];
	        for (int i = 0; i < n; i++) {
	            res[i] = list.get(i);
	        }
	        return res;
	    
	}


}
