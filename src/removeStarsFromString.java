class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
       int count = 0;
        for(int i = s.length()-1; i >=0; i--){
            char c = s.charAt(i);
            if(c == '*') count++;
            else if(count > 0) count--;
            else sb.append(c);
       

    }
            return sb.reverse().toString();


}
}
