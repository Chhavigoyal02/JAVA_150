package lec07;

public class linear_search {

	public static void main(String[] args) {
		int[] arr= {3,2,1,7,8,9,11,13};
		int item=7;
		System.out.println(Search(arr,item));

	}
	public static int Search(int[] arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}
}
