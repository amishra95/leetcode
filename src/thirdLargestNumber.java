
class Solution {
   public int thirdLargest(int[] arr) { // total time complexity is O(n + k)
	
	// remove distinct elements
	arr = distinctArr(arr); // O(n)

	// get max element in array
	int max = getMaxElement(arr); // O(n)

	boolean[] sortedArr = new boolean[max];

	for (int i = 0; i < arr.length; i++) {
		sortedArr[arr[i]] = true;
	}

	int count = 2; // when count is 0, we've reached the third largest element
				   // can be changed to nth largest by setting count = n-1
	for (int i = sortedArr.length; i >= 0; i--) {
		if (sortedArr[i]) {
			if (count == 0) {
				return i;
			}
			count--;
		}
	} // O(k)

	return max; // if there are less than 3 elements, return the max element
}

public int[] distinctArr(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    int[] arr2 = new int[arr.length];
    int index = 0;
    for(int i = 0; i < arr.length; i++){
        if(!set.contains(arr[i])) {
        	set.add(arr[i]);
            arr2[index] = arr[i];
            index++;
        }
    }
    
    return arr2;
}

public int getMaxElement(int[] arr) {
	int max = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if arr[i] > max {
			max = arr[i];
		}
	}
	return max;
}

        
    }
