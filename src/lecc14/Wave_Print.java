package lecc14;

public class Wave_Print {

	public static void main(String[] args) {
		int[][] arr= {{10,20,30,40,50},{60,70,80,90,71},{10,11,13,16,19},{23,76,45,90,11},{45,61,72,83,95}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		WavePrint(arr);

	}
	public static void WavePrint(int[][] arr) {
		for(int col=0;col<arr[0].length;col++) {
			if(col%2==0) {
				for(int row=0;row<arr.length;row++) {
					System.out.print(arr[row][col]+" ");
				}
			}
			else {
				for(int row=arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}
}
