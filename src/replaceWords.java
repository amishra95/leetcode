class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        dict.sort((a, b) -> a.length() - b.length());
        
        dict.sort((a, b) -> a.length() - b.length());
        String[] words = sentence.split("\\s+");
        
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(String root : dict){
                if(word.startsWith(root)){
                    words[i] = root;
                    break;
                }
            }
        }
        return String.join(" ", words);
    }
}