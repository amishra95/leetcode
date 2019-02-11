/**
 * For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].

Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
 * @author Avanish Mishra
 *
 */
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
    List<Integer> list = new ArrayList<Integer>();
        
    StringBuilder sb = new StringBuilder();
        
    for(int num : A){
        
        sb.append(num);
    }
        int finalInt = Integer.parseInt(sb.toString());
    
        int sum = finalInt + K;
        list.add(sum);
        
        return list;
        
        
    
        
    }
}