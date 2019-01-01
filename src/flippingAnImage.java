public class Solution{
public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i < A.length; i++)
            flipAndInvertRow(A[i]);
        return A;
    }
    private void flipAndInvertRow(int[] a){
        int i=0, j = a.length-1, tmp=-1;
        while(i <= j){
            tmp = a[i] ^ 1;
            a[i] = a[j] ^ 1;
            a[j] = tmp;
            ++i;
            --j;
        }
    }
}