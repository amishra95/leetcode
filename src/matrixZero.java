public class Solution {
    public void setZeroes(int[][] matrix) {
     int fr = 0, fc =0;
        for(int i=0; i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) fr=1;
                    if(j==0) fc = 1;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1; i< matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
         if(matrix[i][0] == 0 || matrix[0][j]== 0){
             matrix[i][j] =0;
         }
            
            }
        }
        if(fr == 1){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i] = 0;
            }
        }
        if(fc == 1){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
    }
}