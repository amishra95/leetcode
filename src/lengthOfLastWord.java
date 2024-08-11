class Solution {
    public int lengthOfLastWord(String s) {
    // s = "Hello World" 5
    // s = "fly me to the moon" 4

    
//Create a coun
    int count = 0;

// Iterate through the loop backwards, where you look for not whitespace
// Once you iterate through not whitespace you end up adding the count
    for(int i = s.length()-1; i >= 0; i--){
        if(s.charAt(i) != ' '){
            count++;
        }
        else{
            if(count > 0){
                return count;
            }
            
        }
   
 }
// Add the count value to the solution possible case
return count;

    }
}
