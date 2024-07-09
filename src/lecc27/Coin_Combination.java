package lecc27;

	public class Coin_Combination {
	
		public static void main(String[] args) {
			int[] coin = { 1, 3, 5 };
			int amount = 6;
			combination(coin, amount, "", 0);
		}
	
		public static void combination(int[] coins, int amount, String ans, int idx) {
			if (amount == 0) {
				System.out.println(ans);
				return;
			}
			for (int i = idx; i < coins.length; i++) {
				if (amount >= coins[i]) {
					combination(coins, amount - coins[i], ans + coins[i], i);
	
				}
			}
		}
	}
