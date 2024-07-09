package lecc14;

public class search_2D_Matrix {
//staircase method    leetcode ques 240
	public static void main(String[] args) {
		int[][] arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int item=5;
		System.out.print(Search(arr,item));
	}
	public static boolean Search(int[][] arr,int item) {
		int r=arr.length-1;
		int c=0;
		while(r>=0 && c<arr[0].length) {
			if(arr[r][c]==item) {
				return true;
			}
			else if(arr[r][c]>item) {
				r--;
			}
			else {
				c++;
			}
		}
		return false;
	}
}
