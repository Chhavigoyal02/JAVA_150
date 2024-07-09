package lec06;

public class Array_swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call By Reference
		int[] arr= {2,3,4,5,7};
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);
		
	}
	public static void Swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
