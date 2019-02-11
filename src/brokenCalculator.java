class Solution {
    public int brokenCalc(int X, int Y) {
        int count = 0;
        while(X < Y){
            count++;
            if(Y % 2 == 1)
                Y++;
            else
                Y /= 2;
        }
        
        return count + X - Y;
    }
}