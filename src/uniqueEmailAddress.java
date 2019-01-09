class Solution {
    public int numUniqueEmails(String[] emails) {
        if(emails == null || emails.length == 0){
            return 0;
        }    
        
    Set<String> set = new HashSet<>();
    for(String email : emails){
        StringBuilder sb = new StringBuilder();
        boolean helper = true;
        int idx = 0;
        
    for(int i = 0; i < email.length(); i++){
        if(helper && email.charAt(i) != '@'){
            if(email.charAt(i) == '.'){
                continue;
            }
            else if(email.charAt(i) == '+'){
                helper = false;
            }
            else{
                sb.append(email.charAt(i));
            }
        }
        else if(email.charAt(i) == '@'){
            idx = i;
            break;
        }
    }
        
        sb.append(email.substring(idx));
            set.add(sb.toString());
    }
        return set.size();
    }
}