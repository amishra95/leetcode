 // k is the length of the substring
//find the max number of vowels that exist in a substring of length k

//"aeiou", k=2
class Solution {
    public int maxVowels(String s, int k) {
        if(k > s.length()){
            return 0;
        }
        int count = 0;
        int max = 0;
        
        for(int i = 0; i < k; i++){
          if(vowelCheck(s.charAt(i))){
            count++;
          }
        }
   
     max= Math.max(count, max);

     for(int i = k; i < s.length(); i++){
        if(vowelCheck(s.charAt(i-k))){
            count--;
        }
        if(vowelCheck(s.charAt(i))){
            count++;
        }
    
    max = Math.max(max, count);

    }
        return max;
    }

    private boolean vowelCheck(char c){
       return c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }


}
