class Solution {
    public int countValidPrefixes(String s) {
    
        int countZero = 0;
        int countOne = 0;
        int solution = 0;

    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '0'){
            countZero++;

        }
        else{
        countOne++;
        }
        
    if(Math.abs(countOne - countZero) <= 1){
        solution++;
    }
  
    }

  

    return solution;
    
    }
}