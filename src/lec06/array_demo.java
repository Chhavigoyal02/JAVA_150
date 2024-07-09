package lec06;

public class array_demo {

	public static void main(String[] args) {
		int[] arr=new int[5];
		System.out.println(arr);

		// output is [I@626b2d4a. here bracket shows 1D array.I shows integer array
		System.out.println(arr.length);
		int[] other = arr;
	}

}
	