package Algorithm;

public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		} else
			return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return (a * b) / gcd(b, a % b);
	}
}
