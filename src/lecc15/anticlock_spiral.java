package lecc15;

public class anticlock_spiral {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		spiral(arr);
	}
	public static void spiral(int[][] arr) {
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int c=0;
		int tc=arr.length*arr[0].length;
	while(c<tc){	
		for(int i=minc;i<=maxc && c<tc;i++) {
			System.out.print(arr[minr][i]+" ");
			c++;
		}
		minr++;
		for(int i=minr;i<=maxr && c<tc;i++){
			System.out.print(arr[i][maxc]+" ");
			c++;
		}
		maxc--;
		for(int i=maxc;i>=minc && c<tc;i--) {
			System.out.print(arr[maxr][i]+" ");
			c++;
		}
		maxr--;
		for(int i=maxr;i>=minr && c<tc;i--) {
			System.out.print(arr[i][minc]+" ");
			c++;
		}
		minc++;
	}
	}
}
