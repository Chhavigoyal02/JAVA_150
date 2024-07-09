package lecc28;

public class partition_string {

	public static void main(String[] args) {
		String ques = "nitin";
		Partition(ques,"");

	}
	public static void Partition(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			Partition(ques.substring(i),ans+s+"|");
		}
	}

}
