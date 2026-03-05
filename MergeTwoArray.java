package arrayPrograms;

public class MergeTwoArray {
	public static void main(String[] args) {
		int arr1[] = {2,5,8,0};
		int arr2[] = {1, 4, 7,3};
		int merge[] = new int[arr1.length + arr2.length];
		int k =0;
		
		for(int i =0 ; i<arr1.length; i++) {
			merge[k++] = arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) {
			merge[k++] = arr2[i];
		}
		
		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i] + ",");
			
		}
	}

}
