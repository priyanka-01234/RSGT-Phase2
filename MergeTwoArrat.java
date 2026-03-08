package arrayPrograms;

public class MergeTwoArrat {
	public static void main(String[] args) {
		int[] a = { 2, 6, 9, 0, 1 };
		int[] b = { 9, 3, 2, 5 };
		int[] m = new int[a.length + b.length];
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			m[k++] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			m[k++] = b[i];
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				if (m[i] > m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;

				}
			}
		}

		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + ",");
		}
	}

}
