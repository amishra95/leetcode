public void setZeroes(int[][] matrix) {
        if (matrix == null)
            return;
        int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer> col = new HashSet<Integer>();
        HashSet<Integer> row = new HashSet<Integer>();
        for(int i=0; i<m; i++) {
            for(int j=0;j<n; j++) {
                if (matrix[i][j] == 0) {
                    col.add(j);
                    row.add(i);
                }   
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if (col.contains(j) || row.contains(i))
                    matrix[i][j] = 0;
            }
        }
        return;
    }

