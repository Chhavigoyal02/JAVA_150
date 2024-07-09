package lecc11;

public class Is_Bad_Version {
	//leetcode ques 278
	public static void main(String[] args) {
		int n=5;
		
	}
	public static int firstBadVersion(int n) {
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			//int mid=(lo+hi)/2;this formula of mid gives the no which get overflow out of integer range.then no of iterations 
			//increase and then it gives TLE.
			int mid=lo+(hi-lo)/2;
			if(isBadVersion(mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	public boolean isBadVersion(int mid) {
		return false;
	}
}
