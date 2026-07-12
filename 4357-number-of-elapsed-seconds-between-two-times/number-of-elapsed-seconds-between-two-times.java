class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        int val = 0;
        int sum1 = 0;
        int sum2 = 0;

        String s1 = startTime.substring(0, 2);
        String s2 = startTime.substring(3, 5);
        String s3 = startTime.substring(6, 8);

        String s4 = endTime.substring(0,2);
        String s5 = endTime.substring(3,5);
        String s6 = endTime.substring(6, 8);

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);

        int n4 = Integer.parseInt(s4);
        int n5 = Integer.parseInt(s5);
        int n6 = Integer.parseInt(s6);

         sum1 = n1*60*60 + n2*60 + n3;
         sum2 = n4*60*60 + n5*60 + n6;

        val = sum2-sum1;

        return val;






    }
}