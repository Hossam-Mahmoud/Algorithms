import java.util.Arrays;


public class Test {
	
    public static void doSomethingToElementsOfAnArray(int[] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
	public static void main(String[] args) {
		int[] arr = {10, 30, 14, 2, 5, 1, 0 , 100, 44, 8};
		doSomethingToElementsOfAnArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
