package arrayPrograms;

public class MaximumArray {
public static void main(String[] args) {
	int arr[] = {7,9,3,0};
	int max = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max) {
			max = arr[i];
		}
	}
	System.out.println("Maximum value in the array is: " + max);
}
}
