package lecc26;

public class Queen_Permutation {

	public static void main(String[] args) {
		int n =4;
		boolean[] board = new boolean[n];
		int tq =2;//total queen
		permutation(board,tq,0,"");
		//qpsf == queen place so far(mtlb kitni queen beth chuki h)
		// agr board m true h to queen bethi h , false h to nhi bethi
	}
	public static void permutation(boolean[] board,int tq,int qpsf ,String ans) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true; // placed queen
				permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				board[i]=false; // remove queen (undo step --> backtracking)
			}
		}
	}
}
