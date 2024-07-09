package lecc21;

public class linear_search_recursion {
	//first occurence
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,4,3,4,1};
		int item=4;
		System.out.println(search(arr,item,0));
	}
	public static int search(int[] arr,int item,int idx) {
		if(idx==arr.length) {
			return -1;
		}
		  if(arr[idx] == item)
			  return idx;
		  return search(arr,item,idx+1);
	}

}
//O(n)