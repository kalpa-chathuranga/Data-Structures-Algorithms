import java.util.Arrays;

public class Sort {

	int[] tempArray;

	int[] array = {85,24,14,32,45,75};
	// Bubble sort implementation
	public int[] bubbleSort(int[] array) {

		for (int out = array.length - 1; out > 1; out--) {

			for (int i = 0; i < out; i++) {

				if (array[i] > array[i + 1]) {
					// swap
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

		return array;

	}

	// Selection sort implementation
	public int[] selectionSort(int[] array) {

		int out = array.length - 1;
		for (int in = 0; in < out; in++) {

			int min = in;

			for (int j = in + 1; j < out + 1; j++) {

				if (array[min] > array[j]) {

					min = j;
				}
			}

			int temp = array[in];
			array[in] = array[min];
			array[min] = temp;
		}

		return array;
	}

	// Insertion sort implementation
	public int[] insertionSort(int[] array) {

		for (int out = 1; out < array.length; out++) {
			int in = out;
			int temp = array[out];

			while (in > 0 && temp <= array[in - 1]) {
				// move sorted portion to have some space to array[in-1]
				array[in] = array[in - 1];
				in--;
			}

			array[in] = temp;
		}

		return array;
	}

	public void mergeSort() {
		tempArray = new int[array.length];
		recMergeSort(tempArray, 0, array.length - 1);
		
		System.out.println(Arrays.toString(array));
	}

	public void recMergeSort(int[] tempArray, int lowerBound, int upperBound) {

		if (lowerBound == upperBound)
		{
			return;
		} 
		else 
		{
			int middle = (upperBound + lowerBound) / 2;

			recMergeSort(tempArray, lowerBound, middle);
			recMergeSort(tempArray, middle + 1, upperBound);

			merge(tempArray, lowerBound, middle +1 , upperBound);

		}

	}

	public void merge(int[] tempArray, int lowerPtr, int highPtr, int upperBound) {

		int j = 0; //tempArray index
		int lowerBound = lowerPtr;
		int mid = highPtr -1;
		int n = upperBound - lowerBound + 1; // # of items
		
		while (lowerPtr <= mid && highPtr <= upperBound) {
			 if (array[lowerPtr] < array[highPtr]) {
				 tempArray[j++] = array[lowerPtr++];
			} else {
				tempArray[j++] = array[highPtr++];
			}
		}
		
		while (lowerPtr <= mid) { tempArray[j++] = array[lowerPtr++];		}

		while (highPtr <= upperBound) { tempArray[j++] = array[highPtr++];		}
		
		for (j = 0; j < n; j++) {
			
			array[lowerBound + 1] = tempArray[j];
		}
		
	}

	
	
	
	public static void quickSort(int[] a, int start,  int end)
	{
		if(start < end) {
		
		int pIndex = partition (a, start, end);
		
		quickSort(a, start, pIndex- 1);
		quickSort(a, pIndex+1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		//Pivot can be any index.
		// In this case we choose it as the final element
		int pivot = a[end];
		
		int partitionIndex = start;
		
		for(int i = start ; i<=end -1; i++)
		{
			if(a[i] <= pivot){
				int temp = a[i];
				a[i]=a[partitionIndex];
				a[partitionIndex] = temp;
				
				partitionIndex = partitionIndex + 1;
			}
			
		}
		
		int temp = a[partitionIndex];
		a[partitionIndex]=a[end];
		a[end] = temp;
		
		return partitionIndex;
		
		
	}
	
	
}
