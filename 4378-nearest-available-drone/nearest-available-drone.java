class Solution {
    public int nearestDrone(int[][] drones, int[] target) {

       int index = -1; 
       int minDist = Integer.MAX_VALUE;
       int sum = 0;


        for(int i = 0; i < drones.length; i++){
            sum = Math.abs(drones[i][0]- target[0]) + Math.abs(drones[i][1] - target[1]);
            int range = drones[i][2];
            
            if(sum <= range && sum < minDist){
               minDist = sum;
                index = i;
            }   
            
            }

    return index;

    }
}