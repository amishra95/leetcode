class Solution {
    public boolean closeStrings(String word1, String word2) {
            if(word1.length() != word2.length()){
                return false;
            }

            int[] array1 = new int[26];
            int[] array2 = new int[26];

        for(int i = 0; i < word1.length(); i++){
            for(int j = 0; j < word2.length(); j++){
                array1[word1.charAt(i) - 'a']++;
                array2[word2.charAt(j) - 'a']++;

            }
        }

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
            if(array1[i] > 0 && !(array2[j] > 0)){
                return false;
             }
            }
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

        
        
    }
}
