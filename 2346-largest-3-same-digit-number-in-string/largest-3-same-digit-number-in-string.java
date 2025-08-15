class Solution {
    public String largestGoodInteger(String num) {
        char[] a = num.toCharArray();   
        int count = 1;
    String str  = new String();
       
        if(a.length < 3){
            return " ";
            }    

    for(int i = 1; i < a.length; i++){
        if(a[i] == a[i-1]){
            count++;
            if(count == 3){
                String current = "" + a[i] + a[i] + a[i];
                if(current.compareTo(str) > 0){
                    str = current;
                }
            }
            
        }
            else{
                count = 1;
            }   
    
    }

return str;



    }
}