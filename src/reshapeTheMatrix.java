
public class reshapeTheMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
	    int curRow = nums.length;
	    int curCol = nums[0].length;
	    if (curRow*curCol != r*c) {
	        return nums;
	    }
	    int[][] matrix = new int[r][c];
	    int count = 0;
	    for(int row = 0 ; row < curRow; row++) {
	        for (int col = 0; col < curCol ; col++) {
	            //2*2 -> 1*4                
	            matrix[count/c][count%c] = nums[row][col];
	            count++;
	        }
	    }        
	    return matrix;
	}


}
