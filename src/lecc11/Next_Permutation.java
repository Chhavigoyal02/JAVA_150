package lecc11;

public class Next_Permutation {

	public static void main(String[] args) {
		int[] arr= {3,2,8,6,4,2,1};
		Permutation(arr);
	    for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void Permutation(int[] arr) {
		int p=-1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		if(p==-1) {
			Reverse(arr,0,arr.length-1);
			return;
		}
		else {
		int q=-1;
		for(int i=arr.length-1;i>p;i--) {
			if(arr[i]>arr[p]) {
				q=i;
				break;
			}
		}
		int temp=arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		Reverse(arr,p+1,arr.length-1);
		
		return;
		
	}
	}
	
	public static void Reverse(int[] arr,int a,int b) {
		int i=a;
		int j=b;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;	
		}
	}
}
