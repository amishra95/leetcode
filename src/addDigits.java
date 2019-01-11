class Solution {
    public int addDigits(int num) {
      while(num/10 != 0){
          num = add(num);
      }  
        return num;
    }

    public int add(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}

