package lecc16;

public class Substring_Demo {

	public static void main(String[] args) {
		String s="hello";
//		System.out.print(s.substring(2,7));   //2-6 index tk print krega;(7,2) nhi likh skte
//		System.out.print(s.substring(3));  // 3 se end tk
//		System.out.print(s.substring(3));// empty 
		Substring(s);
		
	}
		
		public static void Substring(String s) {
			for(int i=0;i<s.length();i++) {
				for(int j=i+1;j<s.length();j++) {
					System.out.print(s.substring(i,j+1)+" ");
				}
				System.out.println();
			}
		}

}
