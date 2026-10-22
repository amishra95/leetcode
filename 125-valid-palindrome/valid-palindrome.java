// Valid Palindrome without using Regex.(Better solution and no memorization needed)
class Solution {
    public boolean isPalindrome(String s) {
   String b = realString(s);
    int start = 0;
    int end = b.length()-1;

    
    while(start < end){
        if(b.charAt(start) != b.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
    }

    public String realString(String s){
       StringBuilder sb = new StringBuilder();

    for(char c : s.toCharArray()){
        if((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z')|| (c >= '0' && c <= '9')){
            sb.append(c);
        }
    }
   return  sb.toString().toLowerCase();
    
    }
}


class Solution {
    public boolean isPalindrome(String s) {

    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  

        int left = 0;
        int right = s.length()-1;
    
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
