import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };

		int data = 7;

		Map<Integer, Integer> tabel = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (tabel.containsKey(arr[i])) {
				tabel.put(tabel.get(arr[i]), i);
			} else {
				tabel.put(arr[i], i);
			}
		}

		int i = 0;
		int j = arr.length - 1;
		int k = -1;
		while (i < j) {
			int sum = arr[i] + arr[j];
			if (sum != data && sum < data) {
				int target = data - sum;
				if (tabel.containsKey(target)) {
					k = tabel.get(target);
					break;
				}
			}
			if ((k != -1 && sum + arr[k] > data) || sum == data) {
				j--;
			} else {
				i++;
			}

		}
		System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
	}
}
