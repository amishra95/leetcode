
public class sumOfSubarrayMin {
	public int sumSubarrayMins(int[] A) {
	long modulo = (long) (Math.pow(10, 9) + 7);
	long sumOfMin = 0;
	for (int i = 0; i < A.length; i++) {
		int left = i - 1;
		int right = i + 1;
		while (left >= 0 && A[i] <=A[left]) {
			left--;
		}
		while (right < A.length && A[i] < A[right]) {
			right++;
		}
		sumOfMin += (i - left) * (right - i) * A[i];
	}
	return (int) (sumOfMin % modulo);
}


}
