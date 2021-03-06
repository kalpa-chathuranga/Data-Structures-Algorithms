
public class MS {

	public static void mergeSort(int[] a) {
		int n = a.length;

		// Base case for partitioning
		// Array with single element is already sorted
		if (n == 1)
			return;

		int middle = n / 2;
		// Create sub arrays
		int[] left = new int[middle];
		int[] right = new int[n - middle];

		// Fill sub arrays
		for (int i = 0; i < middle; i++) {
			left[i] = a[i];
		}
		for (int i = middle; i < n; i++) {
			right[i - middle] = a[i];
		}

		// recursively partition until 1 element is there
		mergeSort(left);
		mergeSort(right);

		// Merge sub arrays
		Merge(left, right, a);

	}

	public static void Merge(int[] left, int[] right, int[] a) {

		int leftArrItems = left.length;
		int rightArrItems = right.length;

		// i for left array looping
		// j for right array looping
		// k for a array looping
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftArrItems && j < rightArrItems) {

			// Decides from what sub array to pick to fill final array
			if (left[i] < right[j]) {
				a[k++] = left[i++];
			} else {
				a[k++] = right[j++];
			}
		}

		// Just in case if any sub array is left over
		// with additional elements
		while (i < leftArrItems) {
			a[k++] = left[i++];
		}
		while (j < rightArrItems) {
			a[k++] = right[j++];
		}

	}
}
