class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap();
        for (String word: A.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);
        for (String word: B.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);

        List<String> ans = new LinkedList();
        for (String word: count.keySet())
            if (count.get(word) == 1)
                ans.add(word);

        return ans.toArray(new String[ans.size()]);
    }
}

public String[] uncommonFromSentences(String A, String B) {
        if(A == null || B == null || A.isEmpty() || B.isEmpty()){
            return null;
        }
        StringBuilder ans = new StringBuilder();
        String concatStr = A.concat(" ").concat(B);
        String[] splitArray = concatStr.split(" ");
        Arrays.sort(splitArray);
        for(int i = 0; i < splitArray.length; i++){
            if(i+1 < splitArray.length){
                if(!splitArray[i].equalsIgnoreCase(splitArray[i+1])){
                    ans.append(splitArray[i]).append(" ").append(splitArray[i+1]);
                }
            }else{
                ans.append(splitArray[i]);
            }
        }
        return ans.toString().split(" ");
    }
}
